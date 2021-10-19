public class CoinChangeTwo {

    public int coinChange(int[] coins, int amount) {

        /*
        * 其中 Cj代表的是第j枚硬币的面值
        * 那么需要从F(i-Cj)的状态转移过来
        *再枚举的的这枚硬币数量1的贡献
        *所以F(i) 为前面转移过来的最小值加上枚举硬币数量1
        * */
        if (coins==null || coins.length == 0){
            return  -1;
        }
        /*零钱兑换  就是完全背包问题*/
        int max  = amount+1;
        /*凑成  需要的最少个数*/
        int[] dp =  new int[amount+1];
        for (int i = 0; i < amount+1; i++) {
              dp[i] = max;
        }
        dp[0] = 0;
        int n = coins.length;
        for (int i = 1; i < amount+1; i++) {
            /*遍历零钱*/
            for (int j = 0; j < n; j++) {
                if (coins[j]<=i){
                    dp[i]  = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return  dp[amount]>amount?-1:dp[amount];
    }
}
