package com.leetcode.hashmap;

import java.util.HashMap;
/*Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

If multiple answers are possible, return any of them.

It is guaranteed that the length of the answer string is less than 104 for all the given inputs.



Example 1:

Input: numerator = 1, denominator = 2
Output: "0.5"
Example 2:

Input: numerator = 2, denominator = 1
Output: "2"
Example 3:

Input: numerator = 4, denominator = 333
Output: "0.(012)"*/
public class FractionToDecimal {
    public static void main(String[] args) {
        FractionToDecimal fraction= new FractionToDecimal();
        System.out.println( fraction.fractionToDecimal(7,-12));
    }
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb= new StringBuilder();

        if((numerator<0 && denominator>0) || (numerator>0 && denominator<0)){
            sb.append("-");
        }

        long q=numerator/denominator ;

        long r=numerator%denominator ;

        sb.append(Math.abs(q));

        if(r==0){
            return sb.toString();
        }
        else{
            sb.append(".");
            HashMap<Long,Integer> map= new HashMap<>();
            while(r!=0){
                if(map.containsKey(r)){
                    int pos=map.get(r);
                    sb.insert(pos,'(');
                    sb.append(')');
                    break;
                }
                else{
                    map.put(r,sb.length());
                    r*=10;
                    q=r/denominator;
                    sb.append(Math.abs(q));
                    r=r%denominator;
                }
            }

        }

        return sb.toString();
    }

}
