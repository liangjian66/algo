/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树节点最小距离
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
    public int minDiffInBST(TreeNode root) {
          if(root == null){
              return 0;
          }
          List<Integer> res = new ArrayList<>();
          dfs(root,res);
          int min = Integer.MAX_VALUE;
          for (int i = 0; i < res.size()-1; i++) {
              int val = res.get(i+1) - res.get(i);
              min = Math.min(val,min);
              
          }
          return min;
    }
    public void dfs(TreeNode root ,List<Integer> res){
        if(root == null){
            return ;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }


}
// @lc code=end

