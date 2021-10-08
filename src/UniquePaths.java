import java.util.Arrays;

public class UniquePaths {

    public int uniquePaths(int m, int n)  {
//        路径数 = 上面个格子+左边的格子
        int row = m;
        int col  = n;
        int[][] dp = new int[row][col];
        for (int[] arr:dp){
            Arrays.fill(arr,1);
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {

                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[row-1][col-1];
        /**/
    }
}
