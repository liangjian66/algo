/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0){
            return 0;
        }
        Arrays.sort(nums);
        int a = nums[0]*nums[1]*nums[len-1];
        int b = nums[len-3]*nums[len-2]*nums[len-1];
        return Math.max(a,b);

    }
}
// @lc code=end

