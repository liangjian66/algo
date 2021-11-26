/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int len = nums.length;
        int right = len-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }
        }

        return new int[]{-1,-1};

    }
}
// @lc code=end

