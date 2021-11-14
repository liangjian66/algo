/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
             int len  = candidates.length;
             List<List<Integer>> res = new ArrayList<>();
             if(candidates == null || len == 0){
                 return res;
             }
             Arrays.sort(candidates);
             Deque<Integer>  path  = new LinkedList<Integer>();
             dfs(candidates,target,0,path,res);
             return res;

    }

    public void dfs(int[]  nums,int target,int begin,Deque<Integer> path,List<List<Integer>> res){
          if(target<0){
              return ;
          }
          if(target == 0){
              ArrayList<Integer> arr = new ArrayList<Integer>(path);
              res.add(arr);
              return;
          }
          int len = nums.length;
          for(int i=begin;i<len;i++){
              int num = nums[i];
              int newTarget = target - num;
              if(newTarget<0){
                  break;
              }
              if(i>begin&&nums[i] == nums[i-1]){
                  continue;
              }


              path.addLast(num);
              dfs(nums,newTarget,i+1,path,res);
              path.removeLast();

          }
    }

}
// @lc code=end

