/*
 * @lc app=leetcode.cn id=312 lang=java
 *
 * [312] 戳气球
 */

// @lc code=start
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        // 添加两侧的虚拟气球
        int[] points = new int[n+2];
        points[0] = points[n+1] = 1;
        for(int i = 1;i<=n;i++){
            points[i] = nums[i-1];
        }
        // 初始化dp
        int[][] dp = new int[n+2][n+2];
        // i 应该从下到上
        for(int i=n;i>=0;i--){
           // j 应该从左到右
           for(int j = i+1;j<n+2;j++){
            //     最后戳爆的气球是哪个
              for(int k = i+1;k<j;k++){
                  // 择优做选择
                  dp[i][j] = Math.max(dp[i][j],dp[i][k]+dp[k][j]+points[i]*points[j]*points[k]);
              }
           }
        }
        return dp[0][n+1];

    }
}
// @lc code=end

