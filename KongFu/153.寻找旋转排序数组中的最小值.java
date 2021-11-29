/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0){
            return 0;
        }
        int left = 0;
        int right = len-1;
        while(left<right){
            int point = left + (right -left)/2;
            if(nums[point]<nums[right]){
                right = point;
            }else if(nums[point]>nums[right]){
                left = point+1;
            }else{
                right--;
            }
        }

        return nums[left];

    }
}
// @lc code=end

