import java.util.Arrays;

public class RobTwo {

    /*拆解成子问题 0到 n-1  或者 1到n 的问题 取较大值*/
    public int rob(int[] nums) {
           if (nums.length == 0){
               return 0;
           }

           if (nums.length == 1){
               return  nums[0];
           }
           /*投第0个 不投最后一个*/
           int [] one = Arrays.copyOfRange(nums,0,nums.length-1);
           /*不偷第0个 ， 偷最后一个*/
            int [] two = Arrays.copyOfRange(nums,1,nums.length);

        return  Math.max(robWithArray(one),robWithArray(two));
    }


    public static int robWithArray(int[] nums) {
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
