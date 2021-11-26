/*
 * @lc app=leetcode.cn id=99 lang=java
 *
 * [99] 恢复二叉搜索树
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
    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        in_order(root);
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;

    }
    // 中序遍历
    public void in_order(TreeNode root){
        if(root == null){
            return ;
        }
        in_order(root.left);
        if(firstNode == null && root.val<preNode.val){
            firstNode = preNode;
        }
        if(firstNode != null && root.val<preNode.val){
            secondNode = root;
        }

        preNode = root;
        in_order(root.right);
    }
}
// @lc code=end

