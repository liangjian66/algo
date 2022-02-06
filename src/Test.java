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
        int[] nums = {200,3,140,20,10};
        Test test = new Test();
        test.rob(nums);
    }

    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        char[] str = s.toCharArray();
        int n = str.length;
        long x = 0, b = 1;
        String ans = null;
        for (int i = 0; i < k; i++) {
            char ch = str[n - 1 - i];
            x = (x * power + ch - 'a' + 1) % modulo;
        }
        for (int i = 0; i < k - 1; i++)
            b = b * power % modulo;
        if (x == hashValue)
            ans = s.substring(n - k);
        for (int i = n - k - 1; i >= 0; i--) {
            x = (x + modulo - (b * (str[i + k] - 'a' + 1) % modulo)) % modulo;
            char ch = str[i];
            x = (x * power + ch - 'a' + 1) % modulo;
            if (x == hashValue)
                ans = s.substring(i, i + k);
        }
        return ans;
    }

    public List<Integer> maxScoreIndices(int[] nums) {
        int len = nums.length;
        int[] leftZero = new int[len + 1];
        leftZero[0] = 0;
        for (int i = 1; i < len + 1; i++) {
            int num = nums[i - 1];
            if (num == 0) {
                leftZero[i] = leftZero[i - 1] + 1;
            } else {
                leftZero[i] = leftZero[i - 1];
            }
        }
        int[] rightOne = new int[len + 1];
        rightOne[len] = 0;
        for (int i = len - 1; i >= 0; i--) {
            int num = nums[i];
            if (num == 1) {
                rightOne[i] = rightOne[i + 1] + 1;
            } else {
                rightOne[i] = rightOne[i + 1];
            }
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len + 1; i++) {
            int left = leftZero[i];
            int right = rightOne[i];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res.clear();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }
}