/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          int len = candidates.length;
          List<List<Integer>>  res = new ArrayList<>();
          if(len == 0){
              return res;
          }
          Deque<Integer>  path  = new LinkedList<Integer>();
          dfs(candidates,0,len,target,path,res);
          return res;
    }


    public void dfs(int[] candidates,int begin,int len,int target,Deque<Integer>  path,List<List<Integer>>  res){
           if(target<0){
               return;
           }
           if(target == 0){
               res.add(new ArrayList<Integer>(path));
               return;
           }
           for(int i = begin;i<len;i++){
                 int num = candidates[i];
                 path.add(num);
               dfs(candidates,i,len,target - num,path,res);
               path.removeLast();
           }
    }
}
// @lc code=end

