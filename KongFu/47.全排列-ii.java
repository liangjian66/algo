/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(nums == null || len ==0){
            return res;
        }
        Deque<Integer>  path = new LinkedList<Integer>();
        boolean[] isUseds = new boolean[len];
        Arrays.sort(nums);
        dfs(nums,isUseds,path,res);
         return res;
         
    }

    /**先写一个全排列不包含重复元素的方案
     * 再在其基础上 修改
     * 
     * 
     */

    public void dfs(int[] nums,boolean[] isUseds,Deque<Integer> path,List<List<Integer>> res){
        if(path.size() == nums.length){
            ArrayList<Integer> arr = new ArrayList<>(path);
            res.add(arr);
            return ;
        }
        for( int i = 0;i<nums.length;i++){
            if(isUseds[i]) continue;
            if(i>0 &&(nums[i] == nums[i-1])&&!isUseds[i-1]){
                continue;
            }
            int num = nums[i];
            path.addLast(num);
            isUseds[i] = true;
            dfs(nums,isUseds,path,res);
            path.removeLast();
            isUseds[i] = false;
        }
    }
}
// @lc code=end

