/*
 * @lc app=leetcode.cn id=897 lang=java
 *
 * [897] 递增顺序搜索树
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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return root;
        }
        Deque<Integer> res  = new ArrayDeque<>();
        dfs(root,res);
        TreeNode headRoot = new TreeNode(res.pollFirst());
        TreeNode curr = headRoot;
        while(!res.isEmpty()){
            TreeNode node =   new TreeNode(res.pollFirst());
            curr.right = node;
            curr.left = null;
            curr = node;

        }

       return headRoot;
    }

    public void dfs(TreeNode root,Deque<Integer> res){
        if(root == null){
            return ;
        }
        dfs(root.left,res);
        res.addLast(root.val);
        dfs(root.right,res);
    }
}
// @lc code=end

