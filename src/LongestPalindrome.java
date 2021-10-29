public class LongestPalindrome {

    public int getLongestPalindrome(String A, int n) {
        // write code here
        if(A == null || n == 0){
            return 0;
        }
        char[] arr = A.toCharArray();
        int m = arr.length;
        boolean[][] dp = new boolean[m][m];
        /*dp[i][j]   表示[i...j] 是回文字串*/
        /*初始化dp */
        for (int i = 0;i<m;i++){
            dp[i][i]  = true;
        }
        /*不管什么算法 先从暴力求解 穷举  开始 */
        /*从长度开始遍历*/

        int  maxLen = 1;
        int  begin = 0;
        /*一定要考虑边界情况 是<  还是 <= */
        for (int l = 2; l <=m ; l++) {
            /*再从起点开始遍历*/
            for (int i = 0; i < m-1; i++) {
                /*然后求得右边j的值  i+l*/
                 int j = i+l-1;

                 if (j>=m){
                     break;
                 }
                char c1 = arr[i];
                char c2 = arr[j];
                /*边界情况 一定要考虑*/
                 if (l<=3){
                     if (c1 == c2){
                         dp[i][j] = true;
                     }else {
                         dp[i][j] = false;
                     }
                 }else {
                      if (c1 == c2){
                          dp[i][j] = dp[i+1][j-1];
                      }else {
                          dp[i][j] = false;
                      }
                 }
                 if (dp[i][j]&&(j-i+1)>maxLen){
                     maxLen = j-i+1;
                     begin = i;
                 }
            }
        }

        return  maxLen;

    }

}
