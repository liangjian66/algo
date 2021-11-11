/*
 * @lc app=leetcode.cn id=486 lang=java
 *
 * [486] 预测赢家
 */

// @lc code=start
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        int len = nums.length;
        int[][] dp = new int[len][len];
        for(int i =0;i<len;i++){
            dp[i][i] = nums[i];
        }
        for(int i = len-2;i>=0;i--){
            for(int j = i+1;j<len;j++){
                int left = nums[i] - dp[i+1][j];
                int right = nums[j] - dp[i][j-1];
                dp[i][j] = Math.max(left,right);
 
            }
        }
        return dp[0][len-1]>=0;

    }
}
// @lc code=end

