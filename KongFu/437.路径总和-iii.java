/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null ){
            return 0;
        }
        List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Deque<Integer> path = new ArrayDeque();

        dfs(root,targetSum,path,res);
        int rootVal = res.size();
        int leftVal = pathSum(root.left,targetSum);
        int rightVal = pathSum(root.right,targetSum);

        return rootVal+leftVal+rightVal;
    }

    

    public void dfs(TreeNode root,int target,Deque<Integer> path,List<ArrayList<Integer>> res){
          if(root == null){
              return;
          }
          path.addLast(root.val);
          target -= root.val;
          if(target == 0){
              ArrayList<Integer> arr = new ArrayList<>(path);
              res.add(arr);
          } 
          dfs(root.left,target,path,res);
          dfs(root.right,target,path,res);
          path.pollLast();

    }
}
// @lc code=end

