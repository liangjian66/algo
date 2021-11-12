/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
    int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        depth(root);
        return ans-1;

    }
    
    public int  depth(TreeNode root){
          if(root == null){
              return 0;
          }
         int leftH = depth(root.left);
         int rightH = depth(root.right);
         ans  = Math.max(ans,leftH+rightH+1);
         return Math.max(leftH+1,rightH+1);

    }
}
// @lc code=end

