/*
 * @lc app=leetcode.cn id=1143 lang=java
 *
 * [1143] 最长公共子序列
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
          char[]  text1Arr = text1.toCharArray();
          char[]  text2Arr  = text2.toCharArray();
          int len1 = text1Arr.length;
          int len2 = text2Arr.length;
          int[][] dp = new int[len1+1][len2+1];
          dp[0][0] = 0;
          for(int i=0;i<len2;i++){
              dp[0][i] = 0;
          }
          for(int i=0;i<len1;i++){
            dp[i][0] = 0;
          }
          int res = 0;
          for(int i=1;i<len1+1;i++){
                 char rowC = text1Arr[i-1];
                 for(int j=1;j<len2+1;j++){
                     char colC  = text2Arr[j-1];
                     if(rowC==colC){
                        dp[i][j] = dp[i-1][j-1]+1;
                     }else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);   
                     }
                      res = Math.max(res,dp[i][j]);
                 }
          }
          return res;
    }
}
// @lc code=end

