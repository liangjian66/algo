/*用栈实现队列 :MyQuene     解题： 将一个栈当作输入栈，用于压入 \texttt{push}push 传入的数据；另一个栈当作输出栈  */


import java.util.Deque;
import java.util.LinkedList;

class MyQueue {

    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public MyQueue() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public  int pop(){
        if (outStack.isEmpty()){
            // 把 inStack 元素全部移到  outStack
             in2out();
        }
        return  outStack.pop();
    }

    public int peek(){
        if (outStack.isEmpty()){
            // 把 inStack 元素全部移到  outStack
            in2out();
        }
        return  outStack.peek();
    }

    private  void  in2out(){
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }
}
