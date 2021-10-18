public class LowestCommonAncestorTwo {

    public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || p == null || q == null){
            return  root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root,p,q);
        if (left == null) {
            return  right;
        }
        if (right == null ){
            return  left;
        }
        return  root;
    }
}
