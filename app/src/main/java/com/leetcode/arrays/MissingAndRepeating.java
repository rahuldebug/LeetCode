package com.leetcode.arrays;

import java.util.Vector;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[]a={1, 1, 2, 3, 4, 6};
        Vector result=MissingAndRepeating.findNumbers(a);
       result.stream().forEach(System.out::println);
    }
    public static Vector<Integer> findNumbers(int[] a)
    {
        //You can code here
        boolean[] check = new boolean[a.length+1];
        Vector<Integer> result = new Vector<>();
        //check=false;
        int repeated = 0;
        int missing = 0;
        for (int i=0;i<a.length;i++) {
            int pos=a[i];
          //  System.out.print(pos);
            if (check[pos]) {
                repeated = pos ;
             //   System.out.println("repeated  ==" + repeated);
            } else {
                check[pos] = true;
            }
        }
        for (int i = 1; i < check.length; i++) {
            if (!check[i]) {
            //    System.out.println(i);
                missing = i ;
            }
        }

        result.add(missing);
        result.add(repeated);
        return result;


    }
}
