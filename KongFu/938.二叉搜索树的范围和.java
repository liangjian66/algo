/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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
    int lowIndex = 0;
    int highIndex = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
            if(root == null){
                return 0;
            }
            List<Integer> res  = new ArrayList<>();
            dfs(root,res);
            int sum = 0;
            for(int i = 0;i<res.size();i++){
                if(res.get(i) == low){
                    lowIndex = i;
                }
                if(res.get(i) == high){
                    highIndex = i;
                }
            }

            for(int i = lowIndex;i<highIndex+1;i++){
                sum += res.get(i);
            }
            return sum;

    }
    public void dfs(TreeNode root,List<Integer> res){
        if(root == null){
            return ;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
}
// @lc code=end

