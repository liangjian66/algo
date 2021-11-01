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

/**
 *    经过根节点的路径最大值 = 左子节点最大贡献 + 根节点 + 右子节点最大贡献
 *      priceNewPath 记录最大路径和
 *     递归计算每个节点的最大贡献值 一个节点最大贡献值 = 自己 + 左子节点和右子节点的较大者
 *    nodeGain =   node.val + Math.Max(leftgain,rightgain);
 *    当节点的贡献值小于0 那么舍去 该节点贡献值就为0
 * */
class MaxPathSum {


    public int maxPathSum(TreeNode root) {
        if (root == null){
            return  0;
        }
        maxGain(root);
        return  maxSum;
    }
    int maxSum = Integer.MIN_VALUE;
    public  int maxGain(TreeNode node){
        if (node == null){
            return  0;

        }
        /*递归计算左右子节点的最大贡献值*/
        /*只有贡献值大于0 才会选取对应的子节点*/
        int leftGain = Math.max(maxGain(node.left),0);
        int rightGain = Math.max(maxGain(node.right),0);
        /*节点的最大路径和取决于该节点的值与该节点左右子节点的贡献值*/
        int  priceNewPath = node.val+leftGain+rightGain;

        /*更新答案*/
        maxSum = Math.max(maxSum,priceNewPath);
        /*返回该节点的最大值*/
        /*只能选择左右子节点的其中一个 不能同时选择 因为计算的是该节点的最大贡献值*/
        return  node.val + Math.max(leftGain,rightGain);
    }
}
