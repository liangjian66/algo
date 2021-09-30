import java.util.Stack;

/*最小栈的实现  ： MinStack  加一个辅助栈记录最小值  辅助很重要 */
public class MinStack {

    private Stack<Integer>  mainStack = new Stack<Integer>();
    private Stack<Integer>  minStack = new Stack<Integer>();  // 辅助栈

    /*入栈操作*/
    public  void  push(int element){
        mainStack.push(element);
//        如果辅助栈为空 ， 或者新元素小于或者等于辅助栈栈顶 ，则将新元素压入辅助栈
        if (minStack.empty() || element <= minStack.peek()){

            minStack.push(element);
        }

    }

    public  Integer pop(){
//        如果 出栈元素和辅助栈顶元素值相等 ， 辅助栈出栈
        if (mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        return  mainStack.pop();
    }

    public  int getMin() throws  Exception{

        if (mainStack.empty()){
            throw  new Exception("stack is empty");

        }
        return  minStack.peek();
    }

    public static void main(String[] args) throws Exception {
        MinStack stack  = new MinStack();
        stack.push(4);
        stack.push(9);
        stack.push(7);
        stack.push(3);
        stack.push(8);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }


}


class MinStackTwo {
    Stack<Integer> mainSt;
    Stack<Integer> minSt;

    public MinStackTwo() {
        mainSt = new Stack<Integer>();
        minSt = new Stack<Integer>();
        minSt.push(Integer.MAX_VALUE);

    }

    public void push(int val) {
        mainSt.push(val);
        minSt.push(Math.min(minSt.peek(),val));

    }

    public void pop() {
        mainSt.pop();
        minSt.pop();
    }

    public int top() {
        return   mainSt.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}

