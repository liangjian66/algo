public class MinDistanceTwo {

    public int minDistance(String word1, String word2) {

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int m = arr1.length;
        int n = arr2.length;
        if (word1 == ""||word2==""||m==0||n==0){
            return  m+n;
        }
        int[][] dp = new int[m+1][n+1];

        // 边界状态初始化
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < n + 1; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < m+1; i++) {
            char c1 = arr1[i-1];
            for (int j = 1; j < n+1; j++) {
                char c2 = arr2[j-1];

                    int left_up = 0;
                    int up = 0;
                    int left = 0;
                    left_up = dp[i-1][j-1];
                    up    = dp[i-1][j]+1;
                    left    = dp[i][j-1]+1;
                    if (c1!=c2){
                        left_up++;
                    }
                     dp[i][j] = Math.min(left_up,Math.min(up,left));
            }
        }
        return  dp[m][n];
    }

}
