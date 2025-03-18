package com.home.leetcode;
/*
 Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyandSellStock {
	//O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 obj = new Solution4();
		System.out.println(obj.maxProfit(new int[] {7,1,5,6,4,2}));
		System.out.println(obj.maxProfit(new int[] {7,8,5,6,4,2,1}));
	}
}
class Solution4 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            buy = (prices[i] < buy)?prices[i]:buy;
            profit = (prices[i]-buy>profit)?prices[i]-buy:profit;
        }
        return profit;
    }
}