public class LengthOfLISTwo {

    public int lengthOfLIS(int[] nums) {
        if (nums== null || nums.length == 0){
            return  0;
        }
        int n  = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int maxAns  = 0;
        for (int i = 0; i < n; i++) {
                dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i]){
                    /*动态更新 dp i 的数据*/
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
            maxAns = Math.max(maxAns,dp[i]);
        }
         return  maxAns ;
    }
}
