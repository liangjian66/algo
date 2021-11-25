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
         if(root == null){
             return root;
         }
         if(root ==p || root == q){
             return root;
         }
         TreeNode left = dfs(root.left,p,q);
         TreeNode right = dfs(root.right,p,q);
         if(left != null && right != null){
             return root;
         }
         if(left == null){
             return right;
         }
         if(right == null){
             return left;
         }
         return null;  // 2. if(left != null and right != null)
    }
}
// @lc code=end

