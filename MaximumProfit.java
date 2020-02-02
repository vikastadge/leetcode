package com.vikastadge.algo;
/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Example 1:

Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Example 2:

Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.
Example 3:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class MaximumProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minIndex= 0;
        int maxIndex= 0;
        for (int i=0;i<prices.length;i++){

            if (prices[i] < prices[maxIndex]){
                maxProfit = maxProfit + (prices[maxIndex] - prices[minIndex]);
                minIndex = i;
                maxIndex = i;
            }

            if (prices[i] <= prices[minIndex]){
                minIndex=i;
            }

            if (prices[i] >= prices[maxIndex]){
                maxIndex=i;
            }

        }
        if (maxIndex == prices.length -1 && minIndex< maxIndex){
            maxProfit = maxProfit + (prices[maxIndex] - prices[minIndex]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,9,6,9,1,7,1,1,5,9,9,9};
        System.out.println(maxProfit(input));
    }
}
