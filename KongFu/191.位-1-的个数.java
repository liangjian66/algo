/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        for(int i = 0;i<32;i++){
            res+= n&1;
            n >>=1;
        }

        return res;
    }
}
// @lc code=end

