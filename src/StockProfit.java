
/*股票问题:StockProfit  如何获得最大收益  思路： 记录最小值 ，差值较大的覆盖之前的*/
public class StockProfit {
    public static  int maxProfitFor1Time(int[] prices){

        if (prices==null || prices.length==0 ){
            return 0;
        }
        int min = prices[0];
        int maxProfir = 0 ;
        for (int i = 0; i < prices.length; i++) {
            if (min>prices[i]){
                min = prices[i];
            }else if (prices[i] - min >maxProfir){
                maxProfir  = prices[i] - min;
            }

        }
        return maxProfir;
    }

    public static void main(String[] args) {
        int[] prices = {9,2,7,4,3,1,8,4};
        System.out.print(maxProfitFor1Time(prices));
    }
}
