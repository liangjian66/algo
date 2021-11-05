/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public static int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int len = s.length();
        boolean[][]  dp = new boolean[len][len];
        int  res = 0;
        for(int l =1;l<=len;l++){
            for(int i=0;i<=len-l;i++){
                int j = i+l-1;
                if(i ==j){
                    dp[i][j] = true;
                }
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if (l<=3){
                    if(c1 == c2){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else {
                    if(c1 == c2){
                        dp[i][j] = dp[i+1][j-1];
                    }else{
                        dp[i][j] = false;
                    } 
                }
                if(dp[i][j]){
                    res++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

