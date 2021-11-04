/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        //  包含i 的dp
        int m  = nums.length;
        int[] dp = new int[m];
        dp[0] = nums[0];
        
        int res = Integer.MIN_VALUE;
        res  = Math.max(res,dp[0]);
        for (int i = 1; i < nums.length; i++) {
            int each = nums[i];
            // dp[i] = dp[i-1];
            // dp[i] = dp[i-1]+each;
            // dp[i] = each;
            dp[i] = Math.max(dp[i-1]+each,each);
            res  = Math.max(res,dp[i]);
        } 
        return res;

    }
}
// @lc code=end

