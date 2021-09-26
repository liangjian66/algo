
/*礼物的最大价值
* f(i,j)=max[f(i,j−1),f(i−1,j)]+grid(i,j)
*  动态规划   建立 dp数组
*
*
* 转移方程

 * */
public class GetMaxValue {
      public  int maxValue(int[][] grid){
          int m = grid.length , n = grid[0].length;
          if (m==0||n==0){
              return  0;
          }
          int[][] dp = new int[m][n];

          for (int i = 0; i < m; i++) {
              for (int j = 0; j < n; j++) {
                  if (i==0&&j==0) continue;
                  if (i==0) dp[i][j]  = grid[i][j]+dp[i][j-1];
                  else if (j==0) dp[i][j]  = grid[i][j]+dp[i-1][j];
                  else  dp[i][j] =  grid[i][j] +Math.max(dp[i-1][j],dp[i][j-1]);
              }
          }
          return dp[m-1][n-1];
      }

}
