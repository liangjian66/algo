import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*  通过版本*/
public class MaxSlidingWindow {


    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k) {
            return new int[0];
        }
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == (i - k)) {
                qmax.pollFirst();
            }
            if (i >= k - 1) {
                res[index++] = nums[qmax.peekFirst()];
            }
        }
        return res;
    }
}

/**
public class MaxSlidingWindow {

//    有一个用例 没有通过
      static class  MyQueue{
        Deque<Integer> deque = new LinkedList<Integer>();
        public void pop(Integer value){
             if (!deque.isEmpty() && value == deque.peekFirst() ){
                      deque.pollFirst();
             }
        }

        public void  push(Integer value){
            while (!deque.isEmpty()&&value>deque.peekLast()){
                deque.pollLast();
            }
            deque.offerLast(value);
        }

        int peekFirst() {
            return deque.peekFirst();
        }
    }

    private static  int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue myQueue = new MyQueue();
        if (nums.length == 0){
            return  new int[0];
        }
        List<Integer>  res = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            myQueue.push(nums[i]);
        }

        int[] ans = new int[nums.length-k+1];
        ans[0]  = myQueue.peekFirst();
       int j = 1;
        for (int i = k; i < nums.length; i++) {
//               左边弹出
            myQueue.pop(nums[i-k]);
//             右边边进入 push
            myQueue.push(nums[i]);
            ans[j++]  = myQueue.peekFirst();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-7,-8,7,5,7,1,6,0};
         int[] res =  maxSlidingWindow(nums,4);
         for (int num: res){
             System.out.println(num);

         }
    }

}
*/




