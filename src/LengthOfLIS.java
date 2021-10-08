public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        /*
        * 已知一个序列 {S1, S2,...,Sn}，取出若干数组成新的序列 {Si1, Si2,..., Sim}，其中 i1、i2 ... im 保持递增，
        * 即新序列中各个数仍然保持原数列中的先后顺序，称新序列为原序列的一个 子序列 。
        * 如果在子序列中，当下标 ix > iy 时，Six > Siy，称子序列为原序列的一个 递增子序列 。
        *  动态规划递推公式  dp[i] = max(dp[j])+1 条件nums【i】 大于 nums[j]
        * */

        if (nums == null){
            return 0;
        }
        int n = nums.length;
        int[] dp = new int[nums.length];
        dp[0] = 1;
         int   maxAns = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1) ;
                }
                maxAns = Math.max(maxAns,dp[i]);
            }

        }
         return  maxAns;
    }
}
