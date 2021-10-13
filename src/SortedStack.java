import java.util.LinkedList;
import java.util.Stack;

public class SortedStack {

     /*对栈进行排序使最小元素位于栈顶 */

    /*从顶到底的按从小到大的顺序排序 升序*/
    Stack<Integer> ascendingStack = new Stack<Integer>();

    /*从顶到底的按从大到小顺序排序 降序*/
    Stack<Integer> descendingStack = new Stack<Integer>();


    public SortedStack() {

    }

    public void push(int val) {
        while (!ascendingStack.isEmpty()&&(ascendingStack.peek()<val)){
            descendingStack.push(ascendingStack.pop());
        }

        while (!descendingStack.isEmpty()&&(descendingStack.peek()>val)){
            ascendingStack.push(descendingStack.pop());
        }
        ascendingStack.push(val);
    }

    public void pop() {
        while (!descendingStack.isEmpty()){
            ascendingStack.push(descendingStack.pop());
        }
        if (!ascendingStack.isEmpty()){
            ascendingStack.pop();
        }
    }

    public int peek() {
        while (!descendingStack.isEmpty()){
            ascendingStack.push(descendingStack.pop());
        }

        if (!ascendingStack.isEmpty()){
          return   ascendingStack.peek();
        }
        return  -1;

    }

    public boolean isEmpty() {
          return  descendingStack.isEmpty()&&ascendingStack.isEmpty();
    }
}
