/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        int l = 0, r = n - 1;
        while (l < r) {
            int mid = (l+r)/2;
            if (nums[mid] > nums[mid+1]){
                  r = mid;
            }
            else l = mid + 1;
        }
        return l;
    }
}


// @lc code=end

