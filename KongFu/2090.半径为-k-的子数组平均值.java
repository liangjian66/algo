/*
 * @lc app=leetcode.cn id=2090 lang=java
 *
 * [2090] 半径为 k 的子数组平均值
 */

// @lc code=start
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        //前缀和数组
        long[] dp = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + nums[i - 1];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            // 区间左、右端点
            int l = i - k, r = i + k;
            if (l < 0 || r >= n) {
                ans[i] = -1;
            } else {
                ans[i] = (int) ((dp[r + 1] - dp[l]) / (r - l + 1));
            }
        }
        return ans;
    }
}

// @lc code=end

