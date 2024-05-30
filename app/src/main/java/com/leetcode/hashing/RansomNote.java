package com.leetcode.hashing;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        RansomNote note= new RansomNote();
        //note.canConstruct();
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dictonary = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            if (!dictonary.containsKey(ch)) {
                dictonary.put(ch, 1);
            } else {
                dictonary.put(ch, dictonary.get(ch) + 1);
            }
        }
        for (char ch : ransomNote.toCharArray()) {
            if (dictonary.containsKey(ch) && dictonary.get(ch) > 0) {
                dictonary.put(ch,dictonary.get(ch)-1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
