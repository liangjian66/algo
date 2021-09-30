import java.util.ArrayList;
import java.util.List;

public class KthSmallest {

    public int kthSmallest(TreeNode root, int k) {
        if (root==null){
            return 0;
        }
        List<Integer> res = new  ArrayList<Integer>();
        dfs(root,res);

        int value = res.get(k-1);
        return value;
    }

    public  void  dfs(TreeNode root, List res){
        if (root == null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);

    }
}
