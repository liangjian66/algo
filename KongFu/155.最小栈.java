/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
import java.util.*;
class MinStack {
    Stack<Integer> mStack;
    Stack<Integer> minStack ;

    public MinStack() {
          mStack  = new Stack<>();
          minStack = new Stack<>();
          minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
          mStack.push(val);
          if(val<minStack.peek()){
              minStack.push(val);
          }else{
              Integer peekVal= minStack.peek();
              minStack.push(peekVal); 
          }

    }
    
    public void pop() {
          mStack.pop();
          minStack.pop();
    }
    
    public int top() {
          return mStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

