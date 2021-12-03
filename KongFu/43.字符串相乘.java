/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int len1 = num1.length();
        int len2  = num2.length();
        int[] res = new int[len1+len2];
        for(int i = len1-1;i>=0;i--){
            int n1 = num1.charAt(i)-'0';
            for(int j = len2-1;j>=0;j--){
                int n2  =  num2.charAt(j)-'0';
                // res[i+j+1] 代表进位
                int sum = res[i+j+1]+ n1*n2;
                res[i+j+1] = sum%10;
                res[i+j] += sum/10;
            }
        }
        int begin = 0;
        if(res[0] == 0) {
            begin++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = begin;i<len1+len2;i++){
            sb.append(String.valueOf(res[i]));
        }
        return sb.toString();
    }
}
// @lc code=end

