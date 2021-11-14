/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        if(nums == null || len == 0){
            return  res;
        }
        Arrays.sort(nums);
        Deque<Integer> path = new LinkedList<>();
        dfs(nums,0,path,res);
        return res;

    }
    public void dfs(int[] nums,int start,Deque<Integer> path,List<List<Integer>> res){
        // 先不考虑有重复元素
        ArrayList<Integer>  arr = new ArrayList<>(path);
        res.add(arr);
        for(int i = start;i<nums.length;i++){
               int num = nums[i];
            //     剪枝
               if(i>start && nums[i] == nums[i-1]){
                   continue;
               }
               path.addLast(num);
               dfs(nums,i+1,path,res);
               path.removeLast();
        }
    }
}
// @lc code=end

