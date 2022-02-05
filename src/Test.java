import java.util.*;

// 对人生欲望的挑战  抓住机会   一定抓住机会  对人生欲望的挑战

// 人生 那种挑战的欲望  挑战和改变  这可能就是人生吧
public class Test {

    public static void main(String[] args) {
        String s = " 3/2 ";
        int[] res = new int[]{4, -2, -3, 4, 1};
        Test test = new Test();
        int[] nums = new int[]{1, 1};
        System.out.println(test.maxScoreIndices(nums));

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