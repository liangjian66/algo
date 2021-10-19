import java.util.Map;

public class MinPathSumTwo {


    public int minPathSum(int[][] grid) {
        if (grid== null|| grid.length==0){
            return  0;
        }

        int row = grid.length;
        int col = grid[0].length;
        int[][] dp  = new int[row+1][col+1];
        // 默认 第一行  第一列 都是 0 ；
        for (int i = 1; i < row+1; i++) {
            for (int j = 1; j < col+1; j++) {
                if (i == 1 ){
                    dp[i][j] = dp[i][j-1]+grid[i-1][j-1];
                }
                if (j == 1 ){
                    dp[i][j] = dp[i-1][j]+grid[i-1][j-1];
                }
                if (i>1 &&j>1){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
                }
            }
        }
        return  dp[row][col];
    }

}
