/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start  算法在不会的时候就穷举
class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int len = nums.length;
        if(nums == null|| len == 0){
            return 0;
        }
        int count = 1;
        int res = 1;
        for(int i= 0 ;i<len-1;i++){
            if(nums[i+1]>nums[i]){
                 count++;
            }else{
                count = 1;
            }
            res = Math.max(res,count);
        }
        return res;

    }
}
// @lc code=end

