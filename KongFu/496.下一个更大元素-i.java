/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
           int len1 =  nums1.length;
           int len2 = nums2.length;
           int[] res = new int[len1];
           if(len1>len2){
               return res;
           }
           Stack<Integer> stack  = new Stack();
           HashMap<Integer,Integer> map = new HashMap<>();
           for(int i = len2-1;i>=0;i--){
               int num = nums2[i];
               while(!stack.isEmpty()&& stack.peek()<=num){
                   stack.pop();
               }
               int nextBigNum = stack.isEmpty()?-1:stack.peek();
               map.put(num,nextBigNum);
               stack.push(num);
           }
           for(int i = 0;i<len1;i++){
               int num = nums1[i];
               int next = map.get(num);
               res[i] = next;
           }
           return res;
        
     }
}
// @lc code=end

