/*
 * @lc app=leetcode.cn id=516 lang=java
 *
 * [516] 最长回文子序列
 */

// @lc code=start
class Solution {
    public static int longestPalindromeSubseq(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int len = s.length();
        //
        int[][] dp = new int[len][len];


        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
//        for(int[] nums:dp){
//            Arrays.fill(nums,1);
//        }
        //  i  起点  j 结束点
        int maxLen = 0;

        for (int l = 1; l <= s.length(); l++) {
            for (int i = 0; i < s.length()-l+1; i++) {
//                j 是结束点
                int  j = i+l-1;
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if(j==0){
                    dp[0][0] = 1;
                }else if(j>0&&i+1<s.length()){
                    if(c1 == c2){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }else{
                        dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }else if(i==s.length()-1){
                    dp[i][j] = 1;
                }
                if (i==j){
                    dp[i][j] = 1;
                }

                if(dp[i][j]>maxLen){
                    maxLen = dp[i][j];
                }

            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        String temp = "aaa";
        System.out.println(longestPalindromeSubseq(temp));

    }
}
// @lc code=end

