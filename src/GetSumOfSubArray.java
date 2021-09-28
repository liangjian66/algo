
/*连续子数组的最大和    求最值 就是用动态规划*/
public class GetSumOfSubArray {

    public  int max(int[] nums){
        int len = nums.length;
        if (len==0){
            return 0;
        }

//        dp[i] 是以nums[i]结尾的最大和最大的连续子数组的和
        int[] dp = new  int[len];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i <len ; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            res = Math.max(res,dp[i]);
        }
        return  res;
    }
}
