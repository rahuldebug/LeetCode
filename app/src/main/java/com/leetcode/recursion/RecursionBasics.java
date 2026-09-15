package com.leetcode.recursion;

/**
 * Recursion 3 — Coding Shuttle lecture 1.4.
 * Covers: recursion on strings (palindrome check, reverse, count occurrences)
 * and the include/exclude decision tree (subsequences).
 */
public class RecursionBasics {

    public static void main(String[] args) {
        String s = "abcca";
        System.out.println("Palindrome check on \"" + s + "\": "
                + isPalindrome(0, s.length() - 1, s));

        String str = "rahul";
        System.out.println("Reversed \"" + str + "\": " + reverse(str));

        System.out.println("Occurrences of \"a\" in \"" + s + "\": "
                + countOccurrences(s, "a", 0));

        System.out.println("All subsequences of \"abc\":");
        printAllSubsequences(0, "abc", "");
    }

    /**
     * Checks whether s[l..r] is a palindrome by shrinking from both ends.
     * Base case is l >= r (not l == r) — this handles both odd- and
     * even-length strings correctly; with only l == r, even-length
     * pointers would cross without ever meeting.
     * Recurrence: T(n) = T(n-2) + O(1) → O(n) time, O(n) stack.
     */
    private static boolean isPalindrome(int l, int r, String s) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isPalindrome(l + 1, r - 1, s);
    }

    /**
     * Reverses str by walking the index down from length to 0, appending
     * each character into a StringBuilder accumulator.
     *
     * Uses StringBuilder, not String concatenation ("sb + ch"). String
     * concatenation would allocate a brand-new String object on every
     * call — for length n that's 1+2+...+n characters copied, i.e. O(n^2)
     * time, even though the algorithm looks like a simple O(n) reversal.
     * StringBuilder mutates in place, so appending is O(1) amortized.
     *
     * Recurrence: T(n) = T(n-1) + O(1) → O(n) time, O(n) space (the
     * builder), O(n) stack.
     */
    private static String reverse(String str) {
        if (str == null || str.isBlank()) return "";
        return reverseHelper(str, str.length(), new StringBuilder()).toString();
    }

    private static StringBuilder reverseHelper(String str, int length, StringBuilder sb) {
        // base case: no characters left to append
        if (length == 0) return sb;
        sb.append(str.charAt(length - 1));
        return reverseHelper(str, length - 1, sb);
    }

    /**
     * Counts how many times pattern t occurs in s, checking from index i
     * onward. Shrinks by index, not by substring — s.substring(i) would
     * copy a new string on every call, turning an O(n*m) algorithm into
     * O(n^2*m). startsWith(t, i) checks from an offset without copying.
     * Recurrence: T(n) = T(n-1) + O(m) → O(n*m) time, O(n) stack.
     */
    private static int countOccurrences(String s, String t, int i) {
        if (i + t.length() > s.length()) return 0;
        int here = s.startsWith(t, i) ? 1 : 0;
        return here + countOccurrences(s, t, i + 1);
    }

    /**
     * Generates all 2^n subsequences of s via include/exclude at each index.
     * Same tree shape as nCr and Subsets-of-a-String — one leaf per subset.
     * No memoization: every root-to-leaf path produces a distinct output,
     * so there is no repeated subproblem to cache (contrast with
     * Fibonacci/nCr, where the same (n) or (n,r) is asked for repeatedly).
     * O(2^n * n) time (2^n leaves, O(n) work building each string),
     * O(n) stack.
     */
    static void printAllSubsequences(int i, String s, String sbSeq) {
        if (i == s.length()) {
            System.out.println(sbSeq);
            return;
        }
        printAllSubsequences(i + 1, s, sbSeq + s.charAt(i)); // include s[i]
        printAllSubsequences(i + 1, s, sbSeq);                // exclude s[i]
    }
}