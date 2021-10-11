
public class FindTargetSumWays {
    /*目标和*/
    public int findTargetSumWays(int[] nums, int target) {
        int sums = 0;
        for (int num:nums){
            sums +=num;
        }
        int diff = sums - target;

        if (diff < 0 || diff % 2 != 0) {
            return 0;
        }

        int neg = (sums - target)/2;
        int n = nums.length;
        int[][] dp = new int[n+1][neg+1];

        dp[0][0] = 1;
//        初始化时  i= 1 dp[i]  代表的是 0 到i-1 的方案数字  dp[n]  代表的是nums 0 n-1 的方案数  刚好是整个数组的方案数字
        for (int i = 1; i <= n; i++) {
            int num = nums[i-1];
            for (int j = 0; j <= neg; j++) {
                if (j<num){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-num];
                }
            }
        }
         return dp[n][neg];
    }

}
