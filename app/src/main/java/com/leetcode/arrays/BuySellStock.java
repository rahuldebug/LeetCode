package com.leetcode.arrays;

/**
Question
121. Best Time to Buy and Sell Stock

Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

**/

/** solution
 Basically you can sell stock once for the maximum profit

Brute force approach ::

pick the current element on ith position and compare it with rest of the element to find the profit
save the profit and compare it with global profit

 efficient approach ::

repeat the same for n-1 elements
Time complexity == n^2
keep evaluating the minimum and compare the current price and store it using math.max
**/

/**
 * although an easy problem this form basis of Kadane's  algorithm
 */

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }
            profit = Math.max(profit, price - minPrice);
        }
        return profit;
    }

}
