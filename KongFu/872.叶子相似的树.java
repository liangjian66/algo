/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        dfs(root1,res1);
        dfs(root2,res2);
        return res1.equals(res2);
    }
    public void dfs(TreeNode root ,List<Integer> res){
        if(root == null){
            return;
        }
        dfs(root.left,res);
        if(root.left == null && root.right ==null){
            res.add(root.val);
        }
        dfs(root.right,res);
    }
}
// @lc code=end

