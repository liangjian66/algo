/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        char[]  word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        int len1 = word1Arr.length;
        int len2 = word2Arr.length;
        int[][] dp = new int[len1+1][len2+1];
        dp[0][0] = 0;
        for(int i = 0;i<len1+1;i++){
            dp[i][0] = i;
        }
        for(int i = 0;i<len2+1;i++){
            dp[0][i] = i;
        }
        for(int i =1;i<len1+1;i++){
               char rowC = word1Arr[i-1];
               for(int j = 1;j<len2+1;j++){
                   char colC = word2Arr[j-1];
                
                   int left_up = dp[i-1][j-1];
                   if(rowC!=colC){
                      left_up++;
                   }
                   int left = dp[i][j-1]+1;
                   int up = dp[i-1][j]+1;
                   int left_up_min = Math.min(left,up);
                   dp[i][j] = Math.min(left_up,left_up_min);

               }
        }
        return dp[len1][len2];

    }
}
// @lc code=end

