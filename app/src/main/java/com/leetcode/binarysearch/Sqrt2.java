package com.leetcode.binarysearch;

public class Sqrt2 {

        public int mySqrt(int x) {
            //edge cases
            if (x==1||x==0) return x;
            int start =1;
            int end =x;
            int mid=-1;

            //loop condition
            while (start <= end ){
                mid =start +(end -start) /2 ;

                if ((long)mid*mid==x) return mid;
                else if ((long)mid*mid<x){
                    start=mid+1;
                }
                else {
                    end =mid-1;
                }

            }
            return Math.round(end);
        }
    }


