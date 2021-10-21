public class IsInterleave {

    public boolean isInterleave(String s1, String s2, String s3) {


        /*递推三部曲
        * 1. 边界条件
        * 2. 递推公式
        * 3. dp数组取值
        * 套路 ； dp[i][j]  往往依赖  dp[i][i-1]  dp[i-1][j]  dp[i-1][j-1]  只要是动态规划就依赖这三个
        * */
        if (s1==null || s2 == null || s3 == null){
            return  false;
        }

              char[] ch1 = s1.toCharArray();
              char[] ch2 = s2.toCharArray();
              char[]  ch3 = s3.toCharArray();
              if (ch1==null || ch2 == null || ch3 == null){
                  return  false;
              }
              int m = ch1.length;
              int n = ch2.length;
              if (ch3.length != m+n){
                  return false;
              }
              boolean[][] dp= new boolean[m+1][n+1];
              dp[0][0] = true;
        for (int i = 1; i < m+1; i++) {

            if (ch1[i-1] != ch3[i-1]){
                break;
            }
            dp[i][0] = true;

        }
        for (int j = 1; j < n+1; j++) {
            if (ch2[j-1] != ch3[j-1]){
                break;
            }
            dp[0][j] = true;
        }

        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                /*两种情况 dp[i-1][j]  dp[i][j-1]*/
                if ((dp[i-1][j]&&ch1[i-1]==ch3[i+j-1])||(dp[i][j-1]&&ch2[j-1]==ch3[i+j-1])){
                    dp[i][j] = true;
                }
            }
        }
        return  dp[m][n];
    }

}
