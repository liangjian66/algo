/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> res = new HashSet<>();
         HashSet<Integer> set = new HashSet<>();
         int len1 = nums1.length;
         int len2 = nums2.length;
         for(int i=0;i<len1;i++){
             int num = nums1[i];
             set.add(num);
         }
         for(int i =0;i<len2;i++){
             int num = nums2[i];
             
             if(set.contains(num)){
                res.add(num);
             }
         }

         int[] ans = new int[res.size()];
         int i =0;
        //      res.forEach((item)->{
        //          ans[i] = item;
        //          i++;
        //     }
            
        //  );
        for(int num:res){
            ans[i] = num;
             i++; 
        }

         
        
        return  ans;
    }
}
// @lc code=end

