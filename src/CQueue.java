import java.util.Stack;
/*in 栈用来处理入栈（push）操作，out 栈用来处理出栈（pop）操作。*/
public class CQueue {


    Stack<Integer> in ;
    Stack<Integer> out;



    public CQueue() {
        this.in =  new Stack<Integer>();
        this.out = new Stack<Integer>();
    }

    public void appendTail(int value) {
        in.push(value);

    }

    public int deleteHead() {
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if (out.isEmpty()){
            return -1;
        }
        return  out.pop();

    }
}
