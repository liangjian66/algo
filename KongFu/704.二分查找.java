/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int i= 0;
        int j = len-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                j = mid-1;
            }else if(target>nums[mid]){
                i = mid+1;
            }
        }
        return -1;

    }
}
// @lc code=end

