/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(nums == null || len == 0){
              return res;
        }
        boolean[] isUseds = new boolean[len];
        Deque<Integer> path  = new  ArrayDeque<>();
         dfs(nums,isUseds,path,res);
        return res;

    }
    public void dfs(int[] nums,boolean[] isUseds,Deque<Integer> path,List<List<Integer>> res){
        int len = nums.length;
        if(path.size() == len){
            ArrayList<Integer>  temp = new ArrayList<>(path);
            res.add(temp);
            // return;
        }
        for(int i=0;i<len;i++){
            int num = nums[i];
            if(isUseds[i]) continue;
            path.addLast(num);
            isUseds[i] = true;
            dfs(nums,isUseds,path,res);
            isUseds[i]  = false;
            path.removeLast();
        }
    }
}
// @lc code=end

