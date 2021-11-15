/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int len1 = nums1.length;
         int len2 = nums2.length;
         if(len1>len2){
             return new int[0];
         }
         Map<Integer,Integer> map = new HashMap<>();
         Deque<Integer> stack  = new ArrayDeque<Integer>();
         for(int i =0;i<len2;i++){
             int num = nums2[i];
            //  单调递减栈
             while(!stack.isEmpty()&&(nums2[stack.peekLast()]<num)){
                 int last =  nums2[stack.peekLast()];
                 map.put(last,num);
                 stack.pollLast();
             }
             stack.offer(i);
         }
         int[] res = new int[len1];
         int i = 0;
         for(int num:nums1){
            int temp =  map.getOrDefault(num,-1);
            res[i++] = temp; 
         }
         return res;
        }
}
// @lc code=end

