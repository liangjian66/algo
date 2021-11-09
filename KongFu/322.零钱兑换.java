import java.util.Arrays;
/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[]  dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        if(amount == 0){
            return 0;
        }
        for(int i=0;i<coins.length;i++){
            int coin = coins[i];
            if (coin<=amount){
                dp[coin] = 1;
            }
        }

        for(int i= 1;i<=amount;i++){
            for(int j =0;j<coins.length;j++){
                int coin = coins[j];
                if(coin<=i){
                    //  dp[i] = dp[i-coin]+1;

                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
// @lc code=end

