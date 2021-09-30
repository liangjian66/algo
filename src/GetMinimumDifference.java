
/*二叉搜索树的最小绝对差*/

import java.util.ArrayList;
import java.util.List;

public class GetMinimumDifference {

    public int getMinimumDifference(TreeNode root) {
        if (root == null){
            return  0;
        }
        List<Integer>  res = new ArrayList<Integer>();
        dfs(root,res);
        int i = 0;
        int j = 1;
        int min = Integer.MAX_VALUE;
        while (j<=res.size()-1){
           min = Math.min(min,res.get(j)-res.get(i));
           i++;
           j++;
        }
        return  min;
    }

    public  void dfs(TreeNode root, List<Integer> res){
        if (root  == null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }

}
