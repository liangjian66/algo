import java.util.Stack;
/*in 栈用来处理入栈（push）操作，out 栈用来处理出栈（pop）操作。*/
public class CQueue {

    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer>  out = new Stack<Integer>();
    public  void  push(int node){
        in.push(node);
    }

    public  void deleateHead(){
        if (!out.isEmpty()){
            out.pop();
        }
        else {
            while (!in.isEmpty())
            {
                out.push(in.pop());
            }

            out.pop();
        }
    }
}
