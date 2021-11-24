/*
 * @lc app=leetcode.cn id=450 lang=java
 *
 * [450] 删除二叉搜索树中的节点
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(root.val == key){
            // 找到了进行删除操作
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            //处理情况3 
            TreeNode minNode = getMin(root.right);
            root.val  = minNode.val;
            root.right = deleteNode(root.right,minNode.val);

        }else if(root.val >key){
            // 去左子树寻找key
            root.left = deleteNode(root.left,key);
        }else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }

        return root;

    }
    TreeNode getMin(TreeNode node){
        while(node.left != null)  node = node.left;
        return  node;
    }
}
// @lc code=end

