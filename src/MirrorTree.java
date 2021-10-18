public class MirrorTree {

    public TreeNode mirrorTree (TreeNode root) {

        /*先考虑单层 再多层 然后递归*/
        if(root == null){
            return root;
        }
        TreeNode temp = root.left;
        root.left =  root.right;
        root.right =  temp;
        if(root.left != null){
            mirrorTree(root.left);
        }
        if(root.right != null){
            mirrorTree(root.right);
        }
        return  root;
        // write code here
    }
}
