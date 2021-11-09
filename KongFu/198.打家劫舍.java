/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
           return 0;
        }
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];

        dp[1] = nums[0]>nums[1]?nums[0]:nums[1];
        for(int i=2;i<len;i++){
            // dp[i] = dp[i-2]+nums[i];
            // dp[i] = dp[i-1];
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[len-1];

    }
}
// @lc code=end

