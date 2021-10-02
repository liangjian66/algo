import java.util.Stack;
/*取得时候 需要判断辅助栈 是否还有数据*/
public class QueuesWithStacks {
    Stack<Integer> mStack;
    Stack<Integer> xStack;

    public QueuesWithStacks() {
        mStack = new Stack<Integer>();
        xStack = new Stack<Integer>();

    }

    public void push(int x) {
        xStack.push(x);
    }

    public int pop() {
        if (mStack.isEmpty()){
            while (!xStack.isEmpty()){
                mStack.push(xStack.pop());
            }
        }

        return  mStack.pop();

    }

    public int peek() {
        if (mStack.isEmpty()){
            while (!xStack.isEmpty()){
                mStack.push(xStack.pop());
            }
        }

        return mStack.peek();
    }

    public boolean empty() {
        if (mStack.isEmpty()){
            while (!xStack.isEmpty()){
                mStack.push(xStack.pop());
            }
        }
        return mStack.isEmpty();
    }

}
