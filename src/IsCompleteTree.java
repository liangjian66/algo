public class IsCompleteTree {
    int n = 0 ;
    int p = 0;
    public  boolean isCompleteTree(TreeNode root){
        if (!dfs(root,1)) return false;
        return n == p;

    }


    public  boolean dfs(TreeNode root,int k ){  // K是当前节点编号
        /*递归到了叶子节点*/
        if (root == null){
            return  true;
        }
        if (k>100) return  false;
        /*记录节点数和最大节点编号值*/
        n++;
        p = Math.max(p,k);
        /*递归左右子树*/
        return  dfs(root.left,2*k)&&dfs(root.right,2*k+1);
    }
}
