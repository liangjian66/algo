/*二叉树的高度 和深度是相等*/

public class MaxDepth {
      public static  int maxDepth(TreeNode root){
          if (root == null){
              return  0;
          }
//      转化成子问题
          int left = maxDepth(root.left)+1;
          int right = maxDepth(root.right)+1;
          int res = Math.max(left,right);
          return  res;
      }

}
