public class MinDistance {

    public  static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        /*
        * 动态规划三部曲
        * 分析问题
        * 明确边界条件
        * 根据条件写出递推方程式
        *
        * */

        for (int i = 1; i <=m ; i++) {
            dp[i][0] = i;
        }

        for (int j = 1; j <=n ; j++) {
            dp[0][j] = j;
        }
        
        for (int i = 1; i < m+1; i++) {

            char c1 = word1.charAt(i-1);
            for (int j = 1; j < n+1; j++) {
                char c2 = word2.charAt(j-1);


                if (c1==c2){
                     dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+1;
                }

            }


        }
          int ans =   dp[m][n];
        return  ans;
    }

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        System.out.println(minDistance(word1,word2));

    }
}
