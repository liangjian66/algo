import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Trap {

    /**
     * 接雨水  动态规划解法
     * @param height
     * @return
     */
    public int trapWithDp(int[] height) {
        int n = height.length;
        if (n == 0){
            return  0;
        }
        /*leftMaxDp[i] 表示下标i及其左边的位置中，height的最大高度*/
        /*转移方程式*/
        /*初始化 ，边界条件*/
        int[] leftMaxDp = new int[n];
        leftMaxDp[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxDp[i] = Math.max(leftMaxDp[i-1],height[i]);
        }
        int[] rightMaxDp = new int[n];
        rightMaxDp[n-1] = height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMaxDp[i] = Math.max(rightMaxDp[i+1],height[i]);
        }
//        int sum = Math.min(left,right) - height;
        int res = 0;
        for (int i = 1; i < n-1; i++) {

            int temp = Math.min(leftMaxDp[i],rightMaxDp[i]) - height[i];
            res += temp;
        }
        return  res;
    }

    /**
     * 接雨水 单调栈解法
     *   题解 维护一个单调递减的单调栈  出现大于等于 那么可以计算接水量
     *   得到一个可以接水的区域 该区域的宽度是i-left-1
     * @param height
     * @return
     */
    public  int trap(int[] height){
        if (height == null || height.length == 0){
            return  0;
        }
        int ans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int n = height.length;
        for (int i = 0; i <n ; i++) {
            while (!stack.isEmpty() && height[i]>height[stack.peek()]){
                int top = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left-1;
                int currHeight = Math.min(height[left],height[i] - height[top]);
                ans+= currWidth * currHeight;
            }
            stack.push(i);
        }
        return  ans;
    }

}
