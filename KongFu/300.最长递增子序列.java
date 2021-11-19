/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
import java.util.*;
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0){
            return 0;
        }
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        dp[0]  =1;
        int res  = 1;
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    // dp[i] = dp[j]+1;
                    dp[i] = Math.max(dp[i],dp[j]+1);
                     res = Math.max(res,dp[i]);
                }
            }
            
        }
        return res;
    }
}
// @lc code=end

