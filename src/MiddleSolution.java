import java.util.ArrayList;
import java.util.List;

/*二叉树 中序遍历*/
public class MiddleSolution {
    public List<Integer> preorderTraversal(TreeNodeNew root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNodeNew root, List<Integer> res) {
        if (root == null) {
            return;
        }
        preorder(root.left, res);
        res.add(root.val);
        preorder(root.right, res);
    }
}
