
/*零钱兑换322：CoinChange 题解： 动态规划 求F(11)最优解 ，求出F(10)+1   求出F(9)+1
*   dp(n)的定义 ，输入一个目标金额n ，返回凑出目标金额n的最少硬币数量
*  时间复杂度 O(sn)  动态规划
*  */

import java.util.Arrays;

public class CoinChange {

    public  static  int  coinChange(int[] coins,int amount){
        int max = amount+1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {

            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <=i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
            
        }
        return  dp[amount]>amount?-1:dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        System.out.println(coinChange(coins,11));
    }
}
