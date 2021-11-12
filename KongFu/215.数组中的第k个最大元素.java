/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
           if(nums == null || nums.length == 0){
               return 0;
           }
           Arrays.sort(nums);
           int len = nums.length;
           return nums[len-k];
    }
}
// @lc code=end

