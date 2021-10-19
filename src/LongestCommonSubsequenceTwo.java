public class LongestCommonSubsequenceTwo {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        if (arr1.length==0|| arr2.length==0){
            return  0;
        }
        int m = arr1.length;
        int n = arr2.length;
        /*想递推公式*/

        int[][] dp = new int[m+1][n+1];
//        dp[0] = 0;
        /*dp[i][j] 意思是j以前的最长公共字符串  不包含j 所以后面取下标的时候取len  而不是len-1*/
        /*二维数组解决 字符匹配问题*/

        for (int i = 1; i < m+1; i++) {
            char one = text1.charAt(i-1);
            for (int j = 1; j < n+1; j++) {
                char two = text2.charAt(j-1);
                if (one == two){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return  dp[m][n];
    }
}
