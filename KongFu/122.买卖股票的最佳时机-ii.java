/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // 其实就是计算上涨的和
        if(prices == null || prices.length == 0){
            return 0;
        }
        int sum = 0;
        for(int i = 0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                sum+= prices[i+1]-prices[i];
            }
        }
        return sum;
    }
}
// @lc code=end

