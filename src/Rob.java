public class Rob {
    public int rob(int[] nums) {
        /*转移方程式： dp[n+1] = d[n],d[n-1]+num*/
        if (nums == null){
            return 0;
        }
        int n = nums.length;
        if (nums.length == 1){
            return nums[0];
        }

        int[]  dp = new int[n+1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 1; i+1 < n; i++) {

            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i+1]);
        }
        return    dp[n-1];
    }
}
