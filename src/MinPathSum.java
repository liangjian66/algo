public class MinPathSum {

    public int minPathSum(int[][] grid) {
              if (grid == null){
                  return 0;
              }
              int row = grid.length;
              int col  = grid[0].length;
              int[][] dp = new int[row][col];
              dp[0][0] = grid[0][0];
//              int i = 0;
//              int j = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==0&&j>0){
                    dp[0][j] = dp[0][j-1] + grid[0][j];
                }else if (j==0&&i>0){
                    dp[i][0] = dp[i-1][0] + grid[i][0];

                }else if (i>0&&j>0){
                    dp[i][j] = Math.min(dp[i][j-1]+grid[i][j],dp[i-1][j]+grid[i][j]);
                }
            }

        }
        return dp[row-1][col-1];
              /**/
    }

}
