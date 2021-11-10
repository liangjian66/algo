/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length ==0){
            return new int[0];
        }
        Deque<Integer>  deque = new LinkedList<Integer>();
        for(int i = 0;i<k;i++){
             while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                 deque.pollLast();
             }
            deque.offerLast(i);
        }
        int n = nums.length;
        int len  = n-k+1;
        int[] res  = new int[len];
        res[0] = nums[deque.peekFirst()];
        for(int i=0;i<n-k+1;i++){
            int left = i;
            int right = left+k-1;
            while(!deque.isEmpty()&&nums[right]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(right);
            while(left>deque.peekFirst()){
                deque.pollFirst();
            }
            res[i] = nums[deque.peekFirst()];
        }
        return res;

    }
}
// @lc code=end

