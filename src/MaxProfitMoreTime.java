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
}
