/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // 双指针
        int len = height.length;
        int left = 0;
        int right = len-1;
        int res = 0;
        while(left<right){
            if(height[left]<height[right]){
                int temp = height[left]*(right-left);
                res = Math.max(res,temp);
                 left++;
            }else{
                int temp = height[right]*(right-left);
                res = Math.max(res,temp);
                res = Math.max(res,temp);
                right--;
            }
        
        }
        return res;
    }
}
// @lc code=end

