/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
class  TreeNode {
    int val;
    int height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.height = 0;
    }
}
class Solution {
    Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
            int len = inorder.length;
            for(int i = 0;i<len;i++){
                hashMap.put(inorder[i],i);
            }
            int postorder_len = postorder.length;
            TreeNode root =  mybuildTree(inorder,0,len-1,postorder,0,postorder_len-1);
            return root;
    }
    public TreeNode mybuildTree(int[] inorder,int inorder_left,int inorder_right, int[] postorder,int postorder_left,int postorder_right){
        if(inorder_left>inorder_right){
            return null;
        }
        int root_val = postorder[postorder_right];
        int inorder_root_index = hashMap.get(root_val);
        int left_size =  inorder_root_index - inorder_left;

        int right_size  =  inorder_right - inorder_root_index;
        TreeNode root = new TreeNode(root_val);
        root.left  = mybuildTree(inorder,inorder_left,inorder_left+left_size-1,postorder,postorder_left,postorder_left+left_size-1);
        root.right = mybuildTree(inorder,inorder_root_index+1,inorder_root_index+right_size,postorder,postorder_left+left_size,postorder_left+left_size+right_size-1);
        return root;
    }
}
// @lc code=end

