

/*修剪二叉树*/
public class TrimBST {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return root;
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        if (root.val>high)   return trimBST(root.left,low, high);

        if (root.val<low)   return trimBST(root.right,low, high);

        return  root;
    }


}
