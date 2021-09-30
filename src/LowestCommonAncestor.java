import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        List<TreeNode>  path_p = getPath(root,p);
        List<TreeNode>   path_q = getPath(root,q);
        TreeNode ancestor = null;

//        找出最大的i  一直遍历较大的值  会覆盖之前的值
        for (int i = 0; i < path_p.size()&& i<path_q.size(); i++) {
            if (path_p.get(i) == path_q.get(i)) {
                ancestor = path_p.get(i);
            } else {
                break;
            }
        }
        return ancestor;
    }

    public List<TreeNode>  getPath(TreeNode root,TreeNode target ){
        List<TreeNode>  path = new ArrayList<TreeNode>();
//        暂存根节点
        TreeNode node = root;
        while (node !=target){
            path.add(node);
            if (node.val <target.val){
                node = node.right;
            }else  if (node.val > target.val){
                node = node.left;
            }
        }
        path.add(node);
        return  path;
    }
}
