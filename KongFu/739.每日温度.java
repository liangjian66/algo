/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //  单调递减栈
        int len = temperatures.length;
        int[] res = new int[len];
        if(temperatures == null || len ==0){
            return res;
        }
        Deque<Integer> stack = new ArrayDeque<Integer>();
         for(int i = 0;i<len;i++){
             int num = temperatures[i];
             while(!stack.isEmpty()&&(temperatures[stack.peekLast()]<num)){
                 int prev = stack.peekLast();
                 int temp = i - prev;
                 res[prev] = temp;
                 stack.pollLast();
             }
             stack.offerLast(i);
         }
        return res;

    }
}
// @lc code=end

