/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        Deque<Integer>  deque = new LinkedList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(root,targetSum,deque,res);
        return res;

 }

 public void dfs(TreeNode root,int targetSum,Deque<Integer> deque,List<List<Integer>> res){
        if(root == null){
            return;
        }
        deque.offer(root.val);
        targetSum -= root.val;
        if(root.left == null && root.right ==null&& targetSum==0){
            ArrayList<Integer> temp = new ArrayList<Integer>(deque);
            res.add(temp);
        }
        dfs(root.left,targetSum,deque,res);
        dfs(root.right,targetSum,deque,res);
        deque.pollLast();
 }
}
// @lc code=end

