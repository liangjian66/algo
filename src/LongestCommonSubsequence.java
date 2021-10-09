import java.util.Arrays;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1==null || text2 == null){
            return 0;
        }
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int m = s1.length;
        int n = s2.length;
        int[][] dp = new int[m+1][n+1];

//        int res = 0;

        /*
        * dp数组 整体下移一位 (向右 向下)    解决 n-1 越界问题
        * dp[i][j]  存着 0->i-1  0->j-1 之间的最长公共子序列
        * */
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                    if (s1[i-1] == s2[j-1]){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }else {
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }

//                res = Math.max(res,dp[i][j]);



            }

        }
          return dp[m][n];
    }

    public static void main(String[] args) {
        int[][] nums= new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//        int[][] nums= new int[5][3];

        System.out.println(nums.length);
        System.out.println(nums[0].length);

    }
}
