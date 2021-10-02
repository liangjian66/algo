import java.util.LinkedList;
import java.util.Queue;
/* 主要通过一次交换实现逆序*/
public class StacksWhithQueue {
//  主队列
    Queue<Integer> mQuene;
//    辅助队列
    Queue<Integer> xQuene;

    public StacksWhithQueue() {
           mQuene = new LinkedList<Integer>();
           xQuene = new LinkedList<Integer>();
    }

    public void push(int x) {
//               mQuene.offer(x);
               xQuene.offer(x);
               while (!mQuene.isEmpty()){
                   xQuene.offer(mQuene.poll());
               }
               Queue temp = mQuene;
               mQuene = xQuene;
               xQuene = mQuene;
    }

    public int pop() {
         return mQuene.poll();
    }

    public int top() {
         return  mQuene.peek();
    }

    public boolean empty() {
         return mQuene.isEmpty();
    }
}
