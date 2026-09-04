package com.leetcode.recursion;

import com.leetcode.recursion.LinkedList.Node;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        // Both merge methods below are DESTRUCTIVE: they don't copy nodes,
        // they relink the existing nodes' `.next` pointers to splice the two
        // lists together. That means once a list has been merged, its nodes
        // now belong to the merged chain — you can't merge it again.
        // That's why we build a brand new pair of lists for the second test
        // instead of reusing l1/l2: reusing them would feed mergeRecursive
        // whatever mergeIterative already rewired them into.
        Node l1 = build(1, 3, 5);
        Node l2 = build(2, 4, 6);
        print(l1);
        print(l2);
        print(mergeIterative(l1, l2));

        Node l3 = build(1, 3, 5);
        Node l4 = build(2, 4, 6);
        print(mergeRecursive(l3, l4));
    }

    // Builds a list from a sequence of values using the same dummy/tail
    // pattern as mergeIterative: `dummy` is a throwaway node that gives us
    // something to point at before the real first node exists, and `tail`
    // walks forward attaching one new node per value. Returning
    // `dummy.next` skips over the dummy and hands back the real head.
    private static Node build(int... vals) {
        Node dummy = new Node(0);
        Node tail = dummy;
        for (int v : vals) {
            tail.next = new Node(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    // Walks the list from head to tail, printing every value. Doesn't
    // mutate anything — `head` here is just a local loop variable, the
    // caller's reference to the real head is untouched.
    private static void print(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" -> ");
            head = head.next;
        }
        sb.append("null");
        System.out.println(sb);
    }

    // Iterative merge: walk l1 and l2 side by side, and at each step bolt
    // the smaller of the two current nodes onto the end of the result list
    // we're building. Runs in O(n + m) time and O(1) extra space (we reuse
    // the existing nodes, we don't allocate new ones except the dummy).
    public static Node mergeIterative(Node l1, Node l2) {
        // `dummy` is a sentinel node — its own value (0) is never read or
        // returned, it only exists so `tail` always has something to point
        // *from*. Without it we'd need special-case code to set the very
        // first node of the result, since there'd be nothing yet to attach
        // to.
        Node dummy = new Node(0);
        // `tail` is the pointer that actually builds the merged list. It
        // always points at the *last* node attached so far, so
        // `tail.next = X` means "append X to the result." `dummy` itself
        // never moves, so it always marks the very start of the list.
        Node tail = dummy;

        // Stop as soon as either list runs dry — at that point there's
        // nothing left to *compare*, so the leftover of whichever list
        // still has nodes is already sorted and can just be appended whole.
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;   // attach the smaller node to the result
                l1 = l1.next;     // advance only the list we took a node from —
                                  // l2 is untouched, we'll compare against it again
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            // Move the result pointer forward to the node we just attached,
            // so the *next* attachment lands after it instead of overwriting it.
            tail = tail.next;
        }

        // Exactly one of l1/l2 is null here (or both, if they were equal
        // length). Whichever one is NOT null still holds a fully sorted
        // remainder — since it came from an already-sorted input list —
        // so we can splice it on in one assignment instead of looping
        // through it node by node.
        tail.next = (l1 != null) ? l1 : l2;

        // dummy itself is not a real node from either input list, so skip
        // past it — dummy.next is the actual first node of the merged list.
        return dummy.next;
    }

    // Recursive merge: same result as mergeIterative, but instead of
    // building the list forward with a loop, it's defined in terms of a
    // smaller version of itself — "the merge of two lists is: the smaller
    // head, followed by the merge of everything else."
    //
    // Trace for merge([1,3,5], [2,4]):
    //   merge([1,3,5],[2,4]) -> 1 wins -> 1.next = merge([3,5],[2,4])
    //   merge([3,5],[2,4])   -> 2 wins -> 2.next = merge([3,5],[4])
    //   merge([3,5],[4])     -> 3 wins -> 3.next = merge([5],[4])
    //   merge([5],[4])       -> 4 wins -> 4.next = merge([5],null)
    //   merge([5],null)      -> base case, l2 is null, return 5
    // The `.next` assignments then resolve bottom-up as the recursion
    // unwinds: 4.next=5, 3.next=4, 2.next=3, 1.next=2, giving 1->2->3->4->5.
    public static Node mergeRecursive(Node l1, Node l2) {
        // Base case: one list is empty, so there's nothing left to compare
        // against — the merge of "nothing" and a (sorted) list is just that
        // list, unchanged.
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            // l1's head is the smaller value, so it belongs at the front of
            // the result. Everything after it (l1.next) still needs to be
            // merged with the entirety of l2 — that's the exact same
            // problem as this call, just one node smaller, so we recurse
            // and let that call figure out the rest of the chain.
            l1.next = mergeRecursive(l1.next, l2);
            return l1;
        } else {
            // Mirror image of the branch above: l2's head is smaller, so it
            // goes to the front, and its tail is "merge the rest of l2 with
            // all of l1."
            l2.next = mergeRecursive(l1, l2.next);
            return l2;
        }
    }

}
