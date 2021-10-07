
/*对称的二叉树:递归遍历左右子树是否是镜像*/

public class IsSymmetrical {

    public boolean isSymmetric(TreeNode root){
        if (root==null)  return true;
        return  judge(root,root);
    }

    public  boolean judge(TreeNode left,TreeNode right){
        if (left == null && right==null){
            return  true;
        }
        if (left == null || right == null ||left.val != right.val){
            return  false;
        }
        return  ((left.val==right.val)&&(judge(left.left,right.right))&&(judge(left.right,right.left)));
    }







}
