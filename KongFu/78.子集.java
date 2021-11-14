/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         int len = nums.length;
         List<List<Integer>> res = new ArrayList<>();
         if(nums == null || len == 0){
             return  res;
         }
         Deque<Integer> path  = new LinkedList<Integer>();
         
        dfs(nums,0,path,res);

         return res;

    }

    public void dfs(int[] nums,int start,Deque<Integer> path,List<List<Integer>> res){
         List<Integer> arr = new ArrayList<>(path);
        res.add(arr);
        for(int i = start ;i<nums.length;i++){
              int num  = nums[i];
              path.addLast(num);
              dfs(nums,i+1,path,res);
              path.removeLast();
        }

    }


}
// @lc code=end

