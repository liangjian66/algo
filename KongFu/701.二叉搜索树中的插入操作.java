/*
 * @lc app=leetcode.cn id=701 lang=java
 *
 * [701] 二叉搜索树中的插入操作
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
                if(root == null){
                    return new TreeNode(val);
                }
                if(root.val == val){
                    return root;
                }
                if(root.val<val){
                    root.right = insertIntoBST(root.right,val);
                }
                if(root.val>val){
                    root.left = insertIntoBST(root.left,val);
                }
                return root;
    }
}
// @lc code=end

