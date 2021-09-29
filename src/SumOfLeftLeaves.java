
/*统计左叶子节点的和*/
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
            if (root==null) return 0;
//            单层子问题
            if (isLeaf(root)) return root.left.val+ sumOfLeftLeaves(root.right);
//            递归   查询 左子树  和 右子树
            return   sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private boolean isLeaf(TreeNode root){
        if (root == null) return  false;
        return root.left==null && root.right == null;
    }

}
