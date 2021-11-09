/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n<2){return n;};
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i= 1;i<n;i++){
            f1 = f2;
            f2 = f3;
            f3 = f1+f2;
        }
        return f3;

    }
}
// @lc code=end

