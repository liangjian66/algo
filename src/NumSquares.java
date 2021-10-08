public class NumSquares {

    public int numSquares(int n) {
         int[] dp = new  int[n+1];
         for (int i = 1;i <= n;i++){
//             最坏的情况每次加1
             dp[i] = i;
             for (int j = 1; i-j*j >=0 ; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
             }
         }
        return dp[n];
    }
}
