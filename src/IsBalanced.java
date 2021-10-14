public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int value = Math.abs(treeHeight(root.left)-treeHeight(root.right));
        boolean temp = true;
        if (value>1){
            temp =  false;
        }
        return  temp&&(isBalanced(root.left))&&(isBalanced(root.right));
    }
    public  int treeHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftH = treeHeight(root.left);
        int rightH = treeHeight(root.right);
        return Math.max(leftH+1,rightH+1);
    }
}
