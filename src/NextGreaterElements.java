import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class NextGreaterElements {
    /*假设 5个数 75 71 69 72 76 赋值一倍10个数   第1个和第6个数 相等   第2个和第7个数 相等 所以取余即可*/
    /*单调栈 解法 先考虑不是循环数组的情况 */
        public int[] nextGreaterElements(int[] nums) {
            if (nums == null){
                return new int[0];
            }

            Stack<Integer>  stack = new Stack<Integer>();
            int n = nums.length;
            int[] res = new int[n];
            Arrays.fill(res,-1);

            for (int i = 0; i < n*2; i++) {
                int num = nums[i%n];
                while (!stack.isEmpty() && nums[stack.peek()]<num ){
                    int   prev = stack.pop();
                    res[prev] = num;
                }
                stack.push(i%n);
            }
            return  res;
        }
}
