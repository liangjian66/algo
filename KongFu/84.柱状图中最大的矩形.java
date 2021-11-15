/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if(heights == null || len == 0){
            return 0;
        }
        int maxCount = 0 ;
        // left数组存储当前位置左边第一个比他小的位置
        // 2 1  5 6 2 3
        // left[4] = 1
        int[] left = new int[len];
        int[] right = new int[len];
        Deque<Integer>  stack = new ArrayDeque<>();
        for(int i=0;i<len;++i){
            int num = heights[i];
            while(!stack.isEmpty()&&(heights[stack.peekLast()]>=num)){
                stack.pollLast();
            }
            left[i] = stack.isEmpty()?-1:stack.peekLast();
            stack.offerLast(i);
        }
        stack.clear();
        for(int i=len-1;i>=0;--i){
            int num = heights[i];
            while(!stack.isEmpty()&&(heights[stack.peekLast()]>=num)){
                stack.pollLast();
            }
            right[i] = stack.isEmpty()?len:stack.peekLast();
            stack.offerLast(i);
        }
        for(int i=0;i<len;i++){
            int temp = (right[i] - left[i]-1)*heights[i];
            maxCount = Math.max(maxCount,temp);
        }

        return maxCount;
    }
}
// @lc code=end

