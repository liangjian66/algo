/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start

import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>  res = new ArrayList<>();
        if(n == 0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque();
        backTrack(n,1,path,k,res);

        return res;
    }
    public void backTrack(int n ,int start,Deque<Integer> path ,int k,List<List<Integer>> res){
        if(path.size() == k){
            ArrayList<Integer> array = new ArrayList<>(path);
            res.add(array);
        }
        for(int i = start ;i<=n;i++){
                path.addLast(i);
                backTrack(n,i+1,path,k,res);
                path.removeLast();
        }
    }
}
// @lc code=end

