import java.util.Deque;
import java.util.LinkedList;

public class GetMinNumberStack {

    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public void MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }
      /*压入的重点是 压入最小值 假设压入值比较大 就压入当前peek值*/
    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


}
