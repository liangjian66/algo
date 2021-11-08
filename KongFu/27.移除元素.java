/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
         int len = nums.length;
         int left = 0;
         for(int right=0;right<len;right++){
             if(nums[right]!=val){
                 nums[left] = nums[right];
                 left++;
             }
         }
         return left;

    }
}
// @lc code=end

