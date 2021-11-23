/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        if(nums == null || len ==0){
            return true;
        }
        int sum = 0;
        Arrays.sort(nums);
        for(int num:nums){
            sum +=num;
        }
        if(sum%2!=0) return false;
        int target = sum/2;
        boolean[][] dp = new boolean[len+1][target+1];
        dp[0][0]  = true;
        for(int i = 1;i<target+1;i++){
            dp[0][i] = false;
        }

        for(int i =1 ;i<len+1;i++){
            dp[i][0] = false;
        }

        for(int i=1;i<len+1;i++){
            int num = nums[i-1];
            for(int j=1;j<target+1;j++){
                if(num>j){
                    dp[i][j] = dp[i-1][j];
                }
                else if(num == j){
                    dp[i][j] = true;
                }else{
                    dp[i][j] = dp[i-1][j-num] || dp[i-1][j];
                }
            }
        }
        return dp[len][target];

    }
}
// @lc code=end

