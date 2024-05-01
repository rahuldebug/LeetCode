package com.leetcode.stackqueue;

import java.util.Stack;
/*The stock span problem is a financial problem where we have a series of n daily price quotes
for a stock and we need to calculate the span of stocks price for all n days.
The span Si of the stocks price on a given day i is defined as the maximum
number of consecutive days just before the given day,
for which the price of the stock on the current day is less
 than or equal to its price on the given day*/
public class StockSpan
{
    public static void main(String[] args) {
       int N = 7;

       int price[] = {100, 80, 60, 70, 60, 75, 85};
        var res=calculateSpan(price,N);
        for (int n:res){
            System.out.print(n);
        }
    }
    public static int[] calculateSpan(int price[], int n)
    {
        int result[]=new int[n];
        Stack<Integer> span= new Stack <>();
        span.push(0);
        result[0]=1;
        for (int i=1;i<n;i++){
            while(!span.isEmpty()){
                int top= span.peek();
                if(price[top]>price[i]){
                    break;
                }
                else{
                    span.pop();
                }
            }
            if (span.isEmpty()){
                result[i]=i+1;
            }
            else{
                result[i]=i-span.peek();
            }
            span.push(i);
        }
        return result ;





    }
}