public class Rob {
    public int rob(int[] nums) {
        /*n+1   最大值取决于 n n-1 的值 最主要写好转移方程式就行了*/
        /*转移方程式： dp[n+1] = d[n],d[n-1]+nums[n+1]*/
        if (nums == null){
            return 0;
        }
        int n = nums.length;
        if (nums.length == 1){
            return nums[0];
        }
        int[]  dp = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            /*转移方程式 很重要*/
            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i+1]);
        }
         return    dp[n-1];
    }
}
