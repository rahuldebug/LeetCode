package com.leetcode.arrays;

/*121. Best Time to Buy and Sell Stock
Easy
26.7K
853
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
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
