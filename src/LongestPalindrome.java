public class LongestPalindrome {

    public String longestPalindrome(String s) {

        int len = s.length();
        if (len<2){
            return  s;
        }
        int  maxLen = 1;
        int  begin = 0;
        /*dp[i][j]  表示i j 是否是回文串*/
        boolean[][] dp = new boolean[len][len];
        /*初始化 所有长度为为1的字串 都是回文子串*/
        for (int i = 0; i < len; i++) {
            dp[i][i]  = true;
        }
        char[]  charArray = s.toCharArray();
        /*递推开始*/
        /*先枚举子串长度*/
        for (int l = 2; l <= len ; l++) {
            /*枚举左边界  i代表左边界*/
            for (int i = 0; i < len; i++) {
                /*由l i 可以得到右边界  j-i+1 = l*/
                /*推导出 j = l+i-1 */
                int j = l+i-1;
                if (j>=len){
                    break;
                }

                /*左边 和 右边相等 是回文*/
                char leftC = s.charAt(i);
                char rightC = s.charAt(j);
                if (leftC == rightC){
                    if (l<3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }else {
                    dp[i][j] = false;
                }
                /*只要dp[i][j] == true 成立，就表示字串s[i...j]是回文  此时记录回文的长度和起始位置*/
                if (dp[i][j] && j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return  s.substring(begin,begin+maxLen);
    }
}
