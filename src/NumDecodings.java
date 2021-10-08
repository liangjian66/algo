public class NumDecodings {
/*
* 分析清楚就简单了呀 ，动态规划有点像 贪心 一步步来 先计算子问题 1-》2-》-》n
最终得到最终结果
* */
    public  static   int numDecodings(String s){
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <=n ; i++) {
            /*
            * 第一种情况是我们使用了一个字符，即 s[i],s[i] 进行解码，那么只要 s[i] 不等于  0
            *  状态转移方程式  dp[i] = dp[i-1]
            * */
            if (s.charAt(i-1) != '0'){
                dp[i] = dp[i] + dp[i-1];
            }
            /*
            *第二种情况 我们使用了两个字符 即s[i]  s[i-1]  进行编码  条件： s[i−1] 不能等于 0
            *并且 s[i-1]s[i−1] 和 s[i]s[i] 组成的整数必须小于等于 2626
            *状态转移方程式  dp[i] = dp[i-2]
            * */
            if (i>1&&s.charAt(i-2) !='0' &&(s.charAt(i-2) - '0')*10+(s.charAt(i-1)-'0')<=26){
                dp[i] = dp[i] + dp[i-2];
            }
            
        }
         return  dp[n];
    }

    public static void main(String[] args) {
        numDecodings("226");
    }
}
