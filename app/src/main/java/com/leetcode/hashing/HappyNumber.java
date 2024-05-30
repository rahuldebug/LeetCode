package com.leetcode.hashing;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> checkForLoop= new HashSet<Integer>();
        while(n!=1){
            int curr=n;
            int result=0;
            while (curr!=0){
                result+= (curr%10)*(curr%10);
                curr=curr/10;
            }
            n=result;
            if (checkForLoop.contains(result)) return false;
            else{
                checkForLoop.add(result);
            }
        } return true;

    }
}
