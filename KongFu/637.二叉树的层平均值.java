/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> deque = new ArrayDeque();
        deque.addLast(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = deque.pollFirst();
                arr.add(node.val);
                if(node.left !=null){
                    deque.addLast(node.left);
                }  
                if(node.right != null){
                    deque.addLast(node.right);
                } 
            }
            Double sum = 0.00000;
            for(int i = 0;i<arr.size();i++){
                sum +=arr.get(i);
            }
            Double value = (Double)sum/arr.size();
            res.add(value);

        }
        return res;

    }
}
// @lc code=end

