public class CanPartition {

    public boolean canPartition(int[] nums) {
        if (nums == null){
            return  false;
        }

        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;

        for (int num: nums){
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        int m = sum/2;

        if (maxNum > m) {
            return false;
        }
        if (sum % 2 != 0) {
            return false;
        }
        boolean[][] dp = new boolean[n][m+1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;

        for (int i = 1; i <n; i++) {
            int num = nums[i];
            for (int j = 1; j <=m ; j++) {
                if (j>=num){

                    dp[i][j] = dp[i-1][j] | dp[i-1][j-num];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }

            return  dp[n-1][m];
    }
}
