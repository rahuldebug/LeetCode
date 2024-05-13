package com.leetcode.binarysearch;

public class Sqrt {
    public static void main(String[] args) {
        Sqrt sqrt= new Sqrt();
        System.out.println( sqrt.sqrt(113488
        ));
    }
    public  int sqrt(int A) {
        int result = -1;
        int l=1;
        int r=A;
        while(l<=r){
            long mid= l+ (r-l)/2;
            System.out.println("l is : "+l+ " r is : "+r+" mid is : "+mid);
            if (mid*mid==A) return (int) mid;
            else if ((mid * mid)<A) {
                result= (int) mid;
                l= (int) (mid+1);
            }
            else{
                r= (int) (mid-1);
            }
        }


        return result;
    }
}
