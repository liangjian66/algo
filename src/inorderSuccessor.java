import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inorderSuccessor {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode>  res = new ArrayList<TreeNode>();
        dfs(root,res);
        Map<TreeNode,Integer>  map = new HashMap<TreeNode,Integer>();
        for (int i = 0; i < res.size(); i++) {
            map.put(res.get(i),i);

        }
      int i =  map.get(p);
        if (i==res.size()-1){
            return  null;
        }
        return  res.get(i+1);
    }

    public void dfs(TreeNode root, List<TreeNode> res){
        if (root == null){
            return;
        }
        dfs(root.left,res);
        res.add(root);
        dfs(root.right,res);

    }

}
