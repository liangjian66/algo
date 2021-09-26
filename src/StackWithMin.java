import java.util.Stack;

/*包含min函数的栈 ： StackWithMin*/
class MinStackCopy {

    Stack<Integer>  A,B;
    public  MinStackCopy() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public  void  push(int x){
        A.add(x);
        if (B.isEmpty()||x<=B.peek()){
            B.add(x);
        }
    }

    public  void  pop(){
        if (A.pop().equals(B.peek())){
            B.pop();
        }
    }

    public  int top(){
        return  A.peek();
    }
    public  int min(){
        return  B.peek();
    }
}
