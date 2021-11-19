/*
 * @lc app=leetcode.cn id=354 lang=java
 *
 * [354] 俄罗斯套娃信封问题
 */

// @lc code=start
import java.util.*;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0]?b[1]-a[1]:a[0]-b[0];
            }
        });
        // 对高度数组寻找LIS
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = envelopes[i][1];
        }
        return  lengthOfLIS(height);
   }


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

