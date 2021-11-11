/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        // 买卖股票有手续费
        // 股票只有两种状态
        // 1. 持有股票 2. 还有不持有股票
        if(prices == null || prices.length == 0){
            return 0;
        }
        int len = prices.length;
        int[][] dp = new int[len][2];
        // dp[i][0] 不持有股票 dp[i][1] 持有股票
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        int sumMax = 0;
        for(int i=1;i<len;i++){
             dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]-fee);
             dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            int temp = Math.max(dp[i][0],dp[i][1]);
            sumMax = Math.max(sumMax,temp);
        }
        return sumMax;

    }
}
// @lc code=end

