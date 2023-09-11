package com.leetcode.arrays;

public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int aptr=0;
        int bptr=numbers.length -1;
        while(bptr>aptr){
            int currval=numbers[aptr]+numbers[bptr];
            if(currval==target) return new int[]{aptr+1,bptr+1};
            else if(currval<target){
                aptr++;
            } else{
                bptr--;
            }
        }
        return new int[0];
    }
}
