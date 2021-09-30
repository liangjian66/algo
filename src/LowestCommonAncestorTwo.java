public class LowestCommonAncestorTwo {

    public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || root == p || root == q){
            return  root;
        }
//        左子树 是最近公共父节点 不断递归
        TreeNode left  = lowestCommonAncestor(root.left ,p,q);
        //        右子树 是最近公共父节点 不断递归
        TreeNode right  = lowestCommonAncestor(root.right ,p,q);
        if (left == null) return  right;
        if (right == null) return  left;
        return  root;
    }
}
