/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int len  = height.length;
        if(height == null || len ==0){
            return 0;
        }
        int left  = 0;
        int right  = len-1;
        int res = 0 ;
        int left_max= 0;
        int right_max = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=left_max){
                    left_max = height[left];
                }else{
                    res+= left_max - height[left];
                }
                left++;
            }else{
                if(height[right]>=right_max){
                    right_max = height[right];

                }else{
                    res+= right_max - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
// @lc code=end

