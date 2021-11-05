/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        
        int n = s.length();
        // 对应ASCII 吗
        int[] count = new int[128];
        for (int i = 0; i < n; i++) {
            char each = s.charAt(i);
            count[each]++;
        }
        int res = 0;
        for(int num: count){
            int temp = num/2*2;
            res+=temp;
            if(num%2==1&&res%2==0){
                res++;
            }
        }
        return res;
    }
}
// @lc code=end

