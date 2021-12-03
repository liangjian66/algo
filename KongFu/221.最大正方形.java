/*
 * @lc app=leetcode.cn id=221 lang=java
 *
 * [221] 最大正方形
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if(matrix == null || matrix.length == 0|| matrix[0].length == 0){
            return maxSide;
        }
        int rows = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1'){
                    if (i==0||j==0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                    maxSide = Math.max(maxSide,dp[i][j]);
                }
            }
        }
        int maxSquare = maxSide*maxSide;
        return maxSquare;
    }
}
// @lc code=end

