/*二叉树的高度 和深度是相等*/

public class MaxDepth {
      public static  int maxDepth(TreeNode root){
          if (root == null){
              return  0;
          }
//      转化成子问题
          int left = maxDepth(root.left);
          int right = maxDepth(root.right);
          int res = Math.max(left+1,right+1);
          return  res;
      }

}
