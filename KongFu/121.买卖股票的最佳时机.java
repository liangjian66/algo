/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int sunMax = 0;
        for(int i = 0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            sunMax  = Math.max(sunMax,prices[i]-min);
        }
        return sunMax;

    }
}
// @lc code=end

