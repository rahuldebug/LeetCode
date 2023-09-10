package com.leetcode.arrays;
/*50. Pow(x, n) leetcode
 */
public class Power {
    public static void main(String[] args) {
        myPow(2,3);
    }
    public static  double myPow(double x, int n) {
//exponentiation
        double result=1;
        int  m=Math.abs(n);

        while(m>=1){

            if(m%2==1){
                result=result*x;
                m=m-1;
            }
            else{
                x=x*x;
                m=m/2;
            }
        }
        return (n<0)? 1/result:result ;
    }
}
