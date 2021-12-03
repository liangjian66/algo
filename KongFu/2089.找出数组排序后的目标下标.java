/*
 * @lc app=leetcode.cn id=2089 lang=java
 *
 * [2089] 找出数组排序后的目标下标
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]== target){
                res.add(i);
            }

        }
        return res;

    }
}
// @lc code=end

