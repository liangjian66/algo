
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
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
            stack.push(temp.right);
            stack.push(temp.left);
        }
      return  res;
    }
}
