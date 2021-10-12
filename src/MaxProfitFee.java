public class MaxProfitFee {

    public int maxProfit(int[] prices, int fee) {
        if (prices == null){
            return 0;
        }
        int n = prices.length;
        int[][]  dp  = new int[n+1][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < n; i++) {
            /*买入有手续费*/
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]-fee);
            /*卖出没有手续费*/
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);

        }

        return dp[n-1][0];
    }
}
