import java.util.*;

// 对人生欲望的挑战  抓住机会   一定抓住机会  对人生欲望的挑战

// 人生 那种挑战的欲望  挑战和改变  这可能就是人生吧
public class Test {

    public int rob(int[] nums) {
        int len = nums.length;
        // 不偷 最后一个  那是0 。。。len-1;
        int[][] dp = new int[len-1][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < len-1; i++) {
            int num = nums[i];
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = dp[i-1][0] + num;
        }
        int left = Math.max(dp[len-2][0],dp[len-2][1]);
        int[][] rightDp = new int[len][2];
        rightDp[0][0] = 0 ;
        rightDp[0][1] = 0;
        rightDp[1][0] = 0;
        rightDp[1][1] = nums[1];
        for (int i = 2; i < len; i++) {
            int num = nums[i];
            rightDp[i][0] = Math.max(rightDp[i-1][0],rightDp[i-1][1]);
            rightDp[i][1] = rightDp[i-1][0] + num;
        }
        int right = Math.max(rightDp[len-1][0],rightDp[len-1][1]);
        return  left>right?left:right;
    }


    public static void main(String[] args) {
        System.out.print("A,");
//        System.out.pr

    }




}