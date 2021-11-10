/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);
    }
    // 
    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
         if(root ==null){
             return root;
         }
        if(root == p|| root==q){
              return root;
        }
          TreeNode leftNode = dfs(root.left,p,q);
          TreeNode rightNode = dfs(root.right,p,q);
         if(leftNode == null ){
             return rightNode;
         }
         if(rightNode == null ){
             return leftNode;
         }
        return root;
    }
}
// @lc code=end

