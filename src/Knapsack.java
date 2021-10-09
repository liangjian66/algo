public class Knapsack {
     /*
     * W 为背包的总体积
     *N 为物品数量
     * weights 数组存储N个物品的重量
     * values  数组存储N个物品的价值
     * 本质上是个二维数组 然后填写数据 后面数据依赖前面的数据
     * */
    public int knapsack(int W,int N,int[] weights,int[] values){
        int[][] dp = new int[N+1][W+1];

        for (int i = 1; i <=N; i++) {
            int w = weights[i-1];
            int v = values[i-1];
            for (int j = 0; j <=W; j++) {
                /*太大了 放不进去*/
                  if (j<w){
                   dp[i][j] = dp[i-1][j];
                  }else {
                      /*可以放置进去*/
                      dp[i][j] = Math.max(dp[i-1][j],dp[i][j-w]+v);
                  }
            }
        }

        return dp[N][W];

    }
}
