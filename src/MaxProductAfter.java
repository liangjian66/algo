

/*剪绳子 ： MaxProductAfter*/

public class MaxProductAfter {
      public  int cutRope(int n){
          int[] dp = new int[n+1];
          dp[1] = 1;
          for (int i = 2; i <=n; i++) {
              for (int j = 1; j < i; j++) {
//                  动态规划
                  dp[i] = Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
              }
          }
          return dp[n];
      }

}
