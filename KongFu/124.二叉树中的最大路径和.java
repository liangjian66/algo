/*
 * @lc app=leetcode.cn id=124 lang=java
 *
 * [124] 二叉树中的最大路径和
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
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        gain(root);
        return maxPathSum;

    }
    Integer maxPathSum = Integer.MIN_VALUE;
    public int gain(TreeNode root){
          if(root == null){
              return 0;
          }
          //左子树贡献
        int leftGain = Math.max(gain(root.left),0);
        int rightGain =  Math.max(gain(root.right),0);
        int sum = leftGain + root.val + rightGain;
        maxPathSum = Math.max(maxPathSum,sum);

        // 计算贡献值 只能左子节点  或者右子节点 必须包含该节点
        return Math.max(leftGain,rightGain)+root.val;
    }
}
// @lc code=end

