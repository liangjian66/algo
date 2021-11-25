/*
 * @lc app=leetcode.cn id=518 lang=java
 *
 * [518] 零钱兑换 II  
 */

// @lc code=start
class Solution {
    public int change(int amount, int[] coins) {
         int len = coins.length;
         if(coins == null || len == 0){
             return 0;
         }
         int[] dp = new int[amount+1]; 
         dp[0] = 1;
         for(int i = 0;i<len;i++){
             int coin = coins[i];
             for(int j= 0 ;j<=amount;j++){
                 if(coin<=j){
                     dp[j] = dp[j] + dp[j-coin];
                 }
             }
         }


         return dp[amount];
    }
}
// @lc code=end

