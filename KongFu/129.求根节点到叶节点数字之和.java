/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        List<Integer> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(root,path,res);
        int ans = 0;
        for(int num :res){
            ans+=num;
        }
        return ans;

    }
    public void dfs(TreeNode root ,Deque<Integer> path,List<Integer> res){
          if(root == null){
              return ;
          }
         path.addLast(root.val);
          if(root.left==null && root.right == null){
              ArrayList<Integer>  temp = new ArrayList<>(path);
              manage(temp,res);
              
          }
          dfs(root.left,path,res);
          dfs(root.right,path,res);
          path.pollLast();
    }

    public void manage(ArrayList<Integer>  arr,List<Integer> res){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.size();i++){
            if(i==0&&arr.get(i)==0) continue;
            sb.append(arr.get(i));
        }
        String valStr = sb.toString();
        if(valStr.length()==0||valStr==""){
            valStr = "0";
        }
        Integer temp  = Integer.valueOf(valStr);
        res.add(temp);
    }

}
// @lc code=end

