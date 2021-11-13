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
        if(len == 0){
            return res;
        }
        Deque<Integer>  path = new LinkedList<Integer>();
        boolean[] isUseds = new boolean[len];
         dfs(nums,isUseds,0,path,res);
        return res;

    }

    public void dfs(int[] nums,boolean[] isUsed,int index,Deque path,List<List<Integer>> res){
        int len = nums.length;
        if(path.size() == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0 ;i<len;i++){
            // if(!isUsed[i]){
                if(isUsed[i])  continue;
                int num = nums[i];
                path.addLast(num);
                isUsed[i] = true;
                dfs(nums,isUsed,index+1,path,res);
                isUsed[i] = false;
                path.removeLast();
            // }
            
        }
    }
}
// @lc code=end

