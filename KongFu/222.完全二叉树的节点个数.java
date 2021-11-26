/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
class Solution {
    int count = 0 ;
    public int countNodes(TreeNode root) {
        if(root == null){
          return 0;
        }
        dfs(root);
        return count;

    }
    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        count+=1;
        dfs(root.left);
        dfs(root.right);
    }
}
// @lc code=end

