/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(cost == null || len == 0)
        return 0;
        // 爬到i位置的最小消费
        int[] dp = new int[len+1];
        dp[0] = 0;
        if(len ==1){
            return cost[0];
        }
        dp[1] =  0;
        for(int i=2;i<len+1;i++){
            int a = dp[i-1]+cost[i-1];
            int b = dp[i-2]+cost[i-2];
            dp[i] = Math.min(a,b);
        }

        return dp[len];

    }
}
// @lc code=end

