/*
 * @lc app=leetcode.cn id=877 lang=java
 *
 * [877] 石子游戏
 */

// @lc code=start
class Solution {
    public boolean stoneGame(int[] piles) {
        if(piles == null || piles.length == 0){
            return false;
        }
        int len = piles.length;
        int[][] dp = new int[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]  = piles[i];
        }
        // dp[i][j] 表示i...j 先手（亚历克斯） 后手（李）手中石头的差值 
        for(int i = len-2;i>=0;i--){
             for(int j =i+1;j<len;j++){
                 dp[i][j] = Math.max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1]);
             }
        } 
        return dp[0][len-1]>0;

    }
}
// @lc code=end

