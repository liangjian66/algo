public class FindMaxForm {



    public int findMaxForm(String[] strs, int m, int n) {

        /*递推方程 ：  dp[i][j][k]
        *  i 表示在i个字符串前面
        *  j 使用 jj 个 00 和 kk 个 11 的情况下最多可以得到的字符串数量
        *
        * */
        int length = strs.length;
        int[][][] dp = new int[length+1][m+1][n+1];
        for (int i = 1; i <= length; i++) {
            int[] zerosOnes = getZerosOnes(strs[i-1]);
            int zeros = zerosOnes[0];
            int ones = zerosOnes[1];
            for (int j = 0; j <=m; j++) {
                for (int k = 0; k <=n ; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= zeros && k >= ones) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - zeros][k - ones] + 1);
                    }
                }
            }
        }
        return dp[length][m][n];
    }

    public  int[] getZerosOnes(String str){
        int[] zerosOnes = new int[2];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            zerosOnes[str.charAt(i) - '0']++;
        }
        return zerosOnes;
    }

}
