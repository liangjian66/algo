/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
import java.util.*;
class Solution {
    public int trap(int[] height) {
        int len  = height.length;
        if(height == null || len ==0){
            return 0;
        }
        int res = 0 ;
        // stack存储的是下标 单调递减栈
        Deque<Integer>  stack = new  ArrayDeque<Integer>();
        for(int i = 0 ;i<len;i++){
            int num = height[i];
            while(!stack.isEmpty()&&(height[stack.peekLast()]<num)){
                  int cur = stack.peekLast();
                  stack.pollLast();
                  if(stack.isEmpty()) break;
                  int l = stack.peekLast();
                  int r =  i;
                  int h = Math.min(height[l],height[r]) - height[cur];
                  res += (r-l-1)*h;
            }
            stack.offerLast(i);
        }
        return res;
    }
}
// @lc code=end

