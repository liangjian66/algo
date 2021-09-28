
/*队列的最大值：   维护辅助双端队列记录最大值 和下一个最大值*/


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

 class MaxQueue {
//    主队列
    Queue<Integer> q;
//    辅助   双端队列  记录最大值
     Deque<Integer> d;

      public   MaxQueue(){
          q = new LinkedList<Integer>();
          d = new LinkedList<Integer>();
      }

      public  int max_value(){
          if (d.isEmpty()){
              return -1;
          }
          return  d.peekFirst();
      }
//    加入数字  弹出比value 小的数字
      public  void  push_back(int value){
          while (!d.isEmpty()&&d.peekLast()<value){
              d.pollLast();
          }
          d.offerLast(value);
          q.offer(value);
      }
// 弹出数字
      public  int pop_front(){
         if (q.isEmpty()){
             return -1;
         }
         int ans = q.poll();
         if (ans==d.peekFirst()){
             d.pollFirst();
         }
         return  ans;
      }




}
