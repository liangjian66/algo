/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        // 找到能跳到的最远距离
        if(nums == null || nums.length ==0){
            return false;
        }
        int len = nums.length;
        int maxIndex = 0;
        for(int i =0;i<len;i++){
            if(i<=maxIndex){
                maxIndex = Math.max(maxIndex,i+nums[i]);
            if(maxIndex>=(len-1)){
                return true;
              }
            }
        }
        return false;

    }
}
// @lc code=end

