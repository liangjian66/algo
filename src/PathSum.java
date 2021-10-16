import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PathSum {

    List<List<Integer>>  res = new LinkedList<List<Integer>>();
    Deque<Integer>  path =  new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
       /*深度优先搜索*/
        dfs(root,target);

        return  res;
    }

    public  void  dfs(TreeNode root,int target){
        if (root == null){
            return;
        }
        path.offerLast(root.val);
        target-= root.val;
        if (root.left == null && root.right == null&& target == 0){
            res.add(new LinkedList<Integer>(path));
        }
         dfs(root.left,target);
        dfs((root.right,target);
        path.pollLast();
//        ArrayList
    }
}
