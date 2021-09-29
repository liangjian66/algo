import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Collections;

/*
* 前序遍历为 root -> left -> right，
* 后序遍历为 left -> right -> root。
*  可以修改前序遍历成为 root -> right -> left，那么这个顺序就和后序遍历正好相反。*/

/*非递归实现*/
public class PostorderTraversal {

    public List<Integer> postorderTraversal1(TreeNode root) {
        if (root == null){
            return  new ArrayList<Integer>();
        }
        List<Integer> res =  new ArrayList<Integer>();
        Stack<TreeNode>  stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()){

            TreeNode temp = stack.pop();
            if (temp == null) continue;
            res.add(temp.val);
            stack.push(temp.left);
            stack.push(temp.right);
        }
        Collections.reverse(res);

        return  res;
    }

/*递归实现*/
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res =  new ArrayList<Integer>();
        postorder(root,res);
        return  res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

}
