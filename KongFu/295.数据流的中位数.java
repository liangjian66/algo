/*
 * @lc app=leetcode.cn id=295 lang=java
 *
 * [295] 数据流的中位数
 */

// @lc code=start
import java.util.*;
class MedianFinder {
    // 大根堆
    PriorityQueue<Integer> lMaxQueue  =  new  PriorityQueue<>((a,b)->b-a);
    // 小根堆
    PriorityQueue<Integer> rMinQueue   = new PriorityQueue<>((a,b)->a-b);


    public MedianFinder() {

    }
    
    public void addNum(int num) {
        int len1 = lMaxQueue.size();
        int len2  = rMinQueue.size();
        if(len1 == len2){
            if(rMinQueue.isEmpty()|| num<=rMinQueue.peek()){
                lMaxQueue.add(num);
            }else{
                lMaxQueue.add(rMinQueue.poll());
                rMinQueue.add(num);
            }
        }else{
            if(lMaxQueue.peek()<=num){
                rMinQueue.add(num);
            }else{
                rMinQueue.add(lMaxQueue.poll());
                lMaxQueue.add(num);
            }
        }

    }
    
    public double findMedian() {
        int len1 = lMaxQueue.size();
        int len2  = rMinQueue.size();
        if(len1 == len2){
            double lVal = lMaxQueue.peek();
            double rVal = rMinQueue.peek();
            double mid = (lVal + rVal)*0.5;
            return mid;
        }else{
            double lVal = lMaxQueue.peek();
            return lVal;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
// @lc code=end

