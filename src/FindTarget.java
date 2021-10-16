import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTarget {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null){
            return  false;
        }
        List<Integer> res = new ArrayList<Integer>();
        dfs(root,res);
        Set<Integer> set = new HashSet<Integer>();
        for (int i =0; i<res.size();i++){
            if(!set.add(res.get(i))){
                return  true;
            }
            if ((!set.add(k-res.get(i)))&&(k-res.get(i)!=res.get(i))){
                return  true;
            }
        }
        return  false;

    }
    public  void  dfs(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
}
