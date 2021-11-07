/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 1;
        }
        int len = nums.length;
        int left = 0;
        int right= len-1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(target==nums[mid]){
                 return mid;
            }else if(target>nums[mid]){
                left = mid+1;
            }
            else if(target<nums[mid]){
                right = mid -1;
            }
            
        }
        return left;

    }
}
// @lc code=end

