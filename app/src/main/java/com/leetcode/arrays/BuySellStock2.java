package com.leetcode.arrays;

/**
122. Best Time to Buy and Sell Stock II(Medium)

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7

 **/

/**
 Solution
 Basically it is selling without a cool off period

 if current price is greater than previous day ,sell and add to result

 */
public class BuySellStock2 {
    public int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit = profit + prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
