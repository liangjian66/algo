import java.util.Stack;

public class jieyushui1 {

    public int trap(int[] height) {
        int len = height.length;
        if (height == null || len == 0){
            return  0;
        }
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        // 单调递减栈
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()&& height[i]>height[stack.peek()]){
                int cur = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int width = i-left-1;
                int h = Math.min(height[left],height[i])-height[cur];
                ans+=width*h;
            }
            stack.push(i);
        }
        return  ans;
    }
}
