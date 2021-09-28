
/*
*  思路 ：  左右子树 深度差超过 1  它就不是平衡二叉树
*
* */

public class TreeIsBanced {


    private  Boolean result = true;

    public boolean isBalanced(TreeNode root) {
         if (root == null){
             return  true;
         }
         treeDepth(root);
         return  result;
    }


    private int  treeDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        if (Math.abs(leftDepth-rightDepth)>1) result = false;

        int depth = leftDepth>rightDepth?(leftDepth+1):(rightDepth+1);
        return  depth;
    }

}
