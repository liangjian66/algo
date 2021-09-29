
/*二叉树中和为某一值的路径 ; 根节点到所有叶子节点的路径和  考察还是递归 必须熟练掌握递归 1. 终止条件 2，子问题 3， 传递参数 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PathInTree {

    List<List<Integer>> ret = new LinkedList<List<Integer>>();

    Deque<Integer> path = new LinkedList<Integer>();
    public  List<List<Integer>> pathSum(TreeNode root,int target){
        dfs(root,target);
        return  ret;
    }

    public  void  dfs(TreeNode root,int target){
        if (root == null){
            return;
        }
        path.offerLast(root.val);
        target -= root.val;
//        叶子节点  target为0得到目标值
        if (root.left ==null&&root.right==null&&target==0){
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left,target);
        dfs(root.right,target);
        path.pollLast();
    }
}
