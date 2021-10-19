public class UniquePathsWithObstacles {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        /*思路  ： 先写没有障碍物的路径情况 */
        /*第二部  加入障碍物 */
        if (obstacleGrid == null || obstacleGrid.length==0){
            return  0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row+1][col+1];
        if (obstacleGrid[0][0] ==1){
            dp[1][1]=0;
        }else {
            dp[1][1]=1;
        }
        for (int i = 1; i < row+1; i++) {
            for (int j = 1; j < col+1; j++) {
                if (i==1&&(j>1)){
                    if (obstacleGrid[i-1][j-2]==1||obstacleGrid[i-1][j-1]==1){
                        dp[i][j] = 0;
                        dp[i][j-1] = 0;
                    }else {
                        dp[i][j] = dp[i][j-1];
                    }
                }
                if (j==1&&i>1){
                    if (obstacleGrid[i-2][j-1]==1||obstacleGrid[i-1][j-1]==1){
                        dp[i][j] = 0;
                        dp[i-1][j] = 0;

                    }else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
                if (i>1&&j>1){
                    if (obstacleGrid[i-1][j-2]==1){
                        dp[i][j-1] = 0;
                    }
                    if (obstacleGrid[i-2][j-1]==1){
                        dp[i-1][j] = 0;
                    }
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                    if (obstacleGrid[i-1][j-1]==1){
                        dp[i][j] = 0;
                    }
                }
            }
        }
        return  dp[row][col];
    }
}
