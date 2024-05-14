package com.leetcode.binarysearch;

import java.util.List;

public class PeakElement {
    public static int findPeak(List<Integer> A)
    {
        //You Can Code Here
        if(A.size()==1) return 0;
        if(A==null || A.size()==0) return -1;
        if(A.get(0)>A.get(1))return 0;
        for (int i=1;i<A.size()-1;i++){
            if (A.get(i-1)<A.get(i) && A.get(i)>A.get(i+1))return i;
            //else if (A.get)
        }
        if (A.get(A.size()-1)>A.get(A.size()-2)) return A.size()-1 ;
        return -1;
    }
}
