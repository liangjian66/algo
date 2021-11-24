/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[]  res = new int[len];
        if(temperatures == null || len == 0){
            return res;
        }
        //  单调递减栈
        Stack<Integer>  stack = new Stack();
        for(int i = 0;i<len;i++){
            int num = temperatures[i];
            while(!stack.isEmpty()&&num>temperatures[stack.peek()]){
                int index = stack.pop();
                int val = i - index;
                res[index] = val;
            }
            stack.push(i);
        }
        return res;
    }
}
// @lc code=end

