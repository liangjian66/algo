import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {


    /**
     * 迭代二叉搜索树  最近公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return  root;
        }
        while (root != null){
            if (root.val<p.val && root.val<q.val){
                root = root.right;
            }
             else if (root.val>p.val && root.val>q.val){
                root = root.left;
                /*root */
            } else {
                 break;
            }

        }
        StringBuilder
        return  root;
    }


}
