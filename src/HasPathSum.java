import java.util.LinkedList;
import java.util.Queue;

/* 路径之和
*   广度优先遍历
*   广度优先遍历 ，记录每个节点到根节点的和   ，条件达到叶子节点，和与目标值可相等
*
* */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null) return false;
        Queue<TreeNode>  nodeQueue = new LinkedList<TreeNode>();
        Queue<Integer>  valQueue = new LinkedList<Integer>();
//        先写一个广度优先遍历
        nodeQueue.offer(root);
        valQueue.offer(root.data);
        while (!nodeQueue.isEmpty()){
            TreeNode now = nodeQueue.poll();
            Integer num = valQueue.poll();
            if ((now.left==null)&&(now.right==null)){
                if (num == targetSum){
                    return  true;
                }
            }
            if (now.left != null){
                nodeQueue.offer(now.left);
                valQueue.offer(now.left.data+num);
            }
            if (now.right != null) {
                nodeQueue.offer(now.right);
                valQueue.offer(now.right.data+num);
            }
        }

        return false;
    }




    public  void  dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
    }
}
