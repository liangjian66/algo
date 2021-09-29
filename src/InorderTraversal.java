
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/*中序遍历  递归实现*/
public class InorderTraversal {
/*递归*/
    public List<Integer> inorderTraversal1(TreeNode root) {
         List<Integer> res = new ArrayList<Integer>();
         dfs(root,res);
         return  res;
    }

    public void dfs(TreeNode root ,List res){
        if (root == null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }


/*迭代*/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (root!=null ||  !stack.isEmpty()){
              while (root!=null){
                  stack.push(root);
                  root = root.left;
              }
              root = stack.pop();
              res.add(root.val);
              root = root.right;
        }
        return  res;
    }


}
