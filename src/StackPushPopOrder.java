import java.util.Stack;
/*面试题31. 栈的压入、弹出序列   借用辅助栈*/
public class StackPushPopOrder {

    public  boolean validateStackSequences(int[] pushed,int[] poped){
        Stack<Integer>   stack = new  Stack<>();
        int i = 0;
        for (int num: pushed){
//            num 入栈
            stack.push(num);
//            循环判断 与出栈
            while (!stack.isEmpty()&& stack.peek() == poped[i]){
                stack.pop();
                i++;
            }
        }
        return  stack.isEmpty();
    }
}
