public class TreeDepth {

    private int  treeDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        int depth = leftDepth>rightDepth?(leftDepth+1):(rightDepth+1);
        return  depth;
    }
}
