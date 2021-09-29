
/*翻转二叉树   左右交换左右子节点  在递归左右子节点*/

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        return root;
    }
}
