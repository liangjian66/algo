/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int add = 0;
        int i = len1-1;
        int j = len2-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0|| j>=0||add !=0){
            int x = i>=0?num1.charAt(i)-'0':0;
            int y = j>=0?num2.charAt(j)-'0':0;
            int sum  = x + y+ add;
            add = sum/10;
            int result =  sum%10;
            sb.append(String.valueOf(result));
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();

    }
}
// @lc code=end

