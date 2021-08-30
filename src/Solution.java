
import javax.swing.tree.TreeNode;
import java.util.List;
import java.util.ArrayList;
/*二叉树前序遍历题解  ：  单层条件是先根节点，左节点 右节点 后使用递归 ，递归的基线条件是：root节点==null 终止  */
class TreeNodeNew {
      int val;
    TreeNodeNew left;
    TreeNodeNew right;
     TreeNodeNew() {}
    TreeNodeNew(int val) { this.val = val; }
    TreeNodeNew(int val, TreeNodeNew left, TreeNodeNew right) {
         this.val = val;
         this.left = left;
          this.right = right;
     }
}



public class Solution {


    public List<Integer> preorderTraversal(TreeNodeNew root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNodeNew root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

}
