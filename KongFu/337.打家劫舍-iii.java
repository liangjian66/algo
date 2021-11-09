/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
     // f 表示O点选中的 最大权值和
    Map<TreeNode ,Integer> f = new HashMap<TreeNode,Integer>();
    //  g  表示O点不选中的 最大权值和
    Map<TreeNode ,Integer> g = new HashMap<TreeNode,Integer>();
    public int rob(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root);

        return Math.max(f.getOrDefault(root,0),g.getOrDefault(root,0));

    }
    // dfs  二叉树先考虑dfs 
    public void dfs(TreeNode root){
        if(root == null){
            return ;
        }
        dfs(root.left);
        dfs(root.right);
        f.put(root, root.val+g.getOrDefault(root.left,0)+g.getOrDefault(root.right,0));
        int g_left = Math.max(f.getOrDefault(root.left,0),g.getOrDefault(root.left,0));
        int g_right = Math.max(f.getOrDefault(root.right,0),g.getOrDefault(root.right,0));
        g.put(root,g_left+g_right);
    }
}
// @lc code=end

