
/*对称的二叉树:递归遍历左右子树是否是镜像*/

public class IsSymmetrical {

    public boolean isSymmetric(TreeNode root){
        if (root==null)  return true;
        return  recur(root.left,root.right);
    }


      boolean recur(TreeNode L,TreeNode R){
          if (L==null&&R==null) return  true;
          if (L == null ||R==null|| L.val != R.val){
              return  false;
          }
          Boolean leftBool = recur(L.left, R.right);
          Boolean rightBool = recur(L.right, R.left);

          return  leftBool&&rightBool;
      }




}
