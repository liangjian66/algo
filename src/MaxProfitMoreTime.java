public class MaxProfitMoreTime {

    public int maxProfit(int[] prices) {
        if (prices == null){
            return  0;

        }
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int num  = prices[i] - prices[i-1];
            if (num>0){
                max+=num;
            }
        }
        return  max;
    }


        public int maxProfitDynamic(int[] prices) {
            int n = prices.length;
            int[][] dp = new int[n][2];
            dp[0][0] = 0;
            dp[0][1] = -prices[0];
            for (int i = 1; i < n; ++i) {
                // 如果这一天交易完后手里没有股票 1. 前一天没有股票   2. 前一天有股票 ，今天卖出股票
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
                //  有股票  1.前一天有股票    2. 前一天没有股票 今天买入股票两种情况
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            }
            return dp[n - 1][0];
        }

}
