/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        int left = 1;
        int right = x/2;
        while(left<right){
            int mid = left + (right - left+1)/2;
            if(mid>x/mid){
                 right = mid-1;
            }else{
                left = mid;
            }
        }
        return left;
    }
}
// @lc code=end

