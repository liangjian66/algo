
/*二叉树的镜像*/
public class BinaryTreeNode {


    public  TreeNode mirrorTree(TreeNode root){
        if (root == null){
            return  null;
        }
        TreeNode left =  mirrorTree(root.left);
        TreeNode right =  mirrorTree(root.right);
         root.left = right;
         root.right = left;
         return root;
    }
}
