/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x ==0){
            return true;
        }
       String str  =  String.valueOf(x);
       StringBuffer buffer = new StringBuffer(str);
       buffer.reverse();
       return str.equals(buffer.toString());
    }
}
// @lc code=end

