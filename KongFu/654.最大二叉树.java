/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recur(nums,0,nums.length-1);
    }

    public TreeNode recur(int[] nums,int left,int right ){
        if(left >right){
            return null;
        }
        int maxVal = Integer.MIN_VALUE;
        int maxIndex = -1;
           for(int i = left ;i<=right;i++){
                 if(nums[i]>maxVal){
                     maxVal = nums[i];
                     maxIndex = i;
                 }
           }
           TreeNode root = new TreeNode(maxVal);
           if(maxIndex == left){
               root.left = recur(nums,left,left-1);
           }else{
              root.left =  recur(nums,left,maxIndex-1);
           }
           if(maxIndex == right){
               root.right =  recur(nums,right+1,right);
             }else{

              root.right =  recur(nums,maxIndex+1,right);
           }
           return root;
    }
}
// @lc code=end

