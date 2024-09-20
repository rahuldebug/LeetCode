package com.leetcode.hashmap;

import java.util.ArrayList;
import java.util.List;

public class HashMap {
    //default size

    int size = 16;
    List<Node> bucket;

    public HashMap() {
        this.bucket = new ArrayList<>(size);
    }

    public void put(String key, Integer val) {
        Node toInsert = new Node(key, val);
        Integer hash = getHash(key);
        int loc = handleBucket(hash);

        //check for collision first
        if (bucket.get(loc) != null) {
            //curr value at the location
            Node first = bucket.get(loc);
            //keeping temp , so I don't lose the first
            Node temp = first;

            //also needs to check for same key
            if (containsKey(key)) {
                while (!temp.key.equals(key)) {
                    // containsKey(key);
                    temp = temp.next;
                }
                temp = toInsert;
            }
            //looking for insertion location
            else {
                while (temp.next != null) {
                    // containsKey(key);
                    temp = temp.next;
                }
                // here value will be inserted
                temp.next = toInsert;
                bucket.add(loc, first);
            }
        } else {
            //else for the first time
            bucket.add(loc, toInsert);
        }
    }


    public Integer get(String key) {
        Integer hash = getHash(key);
        int loc = handleBucket(hash);
        Node first = bucket.get(loc);

        if (containsKey(key)) {
            while (!first.key.equals(key)) {
                first = first.next;
            }
            return first.val;
        }

        return null;

    }

    //Utility methods


    //method to get bucket Location
    private Integer handleBucket(Integer hash) {
        return hash % size;

    }


    //method to get hash
    private Integer getHash(String key) {
        return key.hashCode();
    }

    private boolean containsKey(String key) {
        int loc = handleBucket(getHash(key));
        Node curr = (Node) bucket.get(loc);
        while (curr.next != null) {
            // String temp= curr.key;
            if (key.equals(curr.key)) return true;
            curr = curr.next;
        }
        return false;
    }
    public void resize(int size) {

        if (size < 1) return;
        List<Node> oldBucket = bucket;
        bucket = new ArrayList<>(size);
        this.size = size;

        for (int i = 0; i < oldBucket.size(); i++) {
            if (oldBucket.get(i) != null) {
                Node temp = oldBucket.get(i);
                while (temp.next != null) {
                    Node curr = temp;
                    put(curr.key, curr.val);
                }


            }
        }

    }


}

