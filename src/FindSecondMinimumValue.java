
/*还是递归*/
public class FindSecondMinimumValue {
//  记录第二小的节点的值
    int res;
//    记录根节点的值
    int rootVal;
    public int findSecondMinimumValue(TreeNode root) {
        res = -1;
        rootVal = root.val;
       dfs(root);
       return  res;
    }

    private void  dfs(TreeNode root){
        if (root == null) return;
//    Node 大于 第二小的节点的值    返回
        if (res !=-1 && root.val>=res){
            return;
        }
        if (root.val>rootVal){
            res = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}
