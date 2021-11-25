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
        Deque<Integer> path  = new  ArrayDeque<>();
        backtrack(nums,path,res);
        return res;
    }
    public void backtrack(int[] nums,Deque<Integer> path,List<List<Integer>> res){
        int len = nums.length;
        if(path.size() == len){
            ArrayList<Integer>  temp = new ArrayList<>(path);
            res.add(temp);
        }
        for(int i=0;i<len;i++){
            int num = nums[i];
            if(path.contains(num)) continue;
            path.addLast(num);
            backtrack(nums,path,res);
            path.removeLast();
        }
    }
}
// @lc code=end

