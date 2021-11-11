/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        // 股票的三个状态 dp表示最大利润
        // dp[i][0]  持有股票
        // dp[i][1]  不持有股票  在冷冻期
        // dp[i][2]  不持有股票 不在冷冻期
        int len = prices.length;
        int[][] dp = new int[len][3];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for(int i=1;i<len;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2]-prices[i]);
            dp[i][1] = dp[i-1][0]+prices[i];
            dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]);
        }

        return Math.max(dp[len-1][1],dp[len-1][2]);

    }
}
// @lc code=end

