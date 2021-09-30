import java.util.ArrayList;
import java.util.List;

public class FindTargetInBST {
/*  两数之和  就set*/
    public boolean findTarget(TreeNode root, int k) {
         if (root == null){
             return  false;
         }
        List<Integer> res = new ArrayList<Integer>();
         dfs(root,res);
         int l = 0 ;
         int r = res.size()-1;
         while (l<r){
             if (res.get(l)+res.get(r) == k)  return true;
             if (res.get(l)+res.get(r)>k){
                 r--;
             }
             if (res.get(l)+res.get(r)<k){
                 l++;
             }
         }


         return  false;
    }

    public  void dfs(TreeNode root, List<Integer> res){
        if (root == null) return;
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);

    }
}
