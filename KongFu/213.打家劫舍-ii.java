/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start

import java.util.*;
class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0){
            return 0;
        }
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int[] one = Arrays.copyOfRange(nums,0,len-1);
        int[] two =  Arrays.copyOfRange(nums,1,len);
        return Math.max(countRob(one),countRob(two));

    }
    public int countRob(int[] nums){
        if(nums == null || nums.length ==0){
            return 0;
        }
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i =2;i<len;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[len-1];
    }
}
// @lc code=end

