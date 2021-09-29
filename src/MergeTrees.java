
/*合并二叉树 */
public class MergeTrees {
    public  TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1==null ) return  root2;
        if (root2 ==null) return  root1;

        TreeNode  newRoot = new TreeNode(root1.val + root2.val);

        newRoot.left  =  mergeTrees(root1.left,root2.left);

        newRoot.right =  mergeTrees(root1.right,root2.right);

        return  newRoot;
    }
}
