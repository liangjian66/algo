import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null){
            return  new ArrayList<>();
        }
         Deque<Integer>  deque = new LinkedList<>();
        List<String>  res = new ArrayList<>();
        dfs(root,deque,res);
       return  res;
    }

    public  void  dfs(TreeNode root, Deque<Integer> deque, List<String> res){
        if (root == null){
            return;
        }

        deque.addLast(root.val);
        if (root.left==null && root.right == null){
            List<Integer> ans = new ArrayList<>(deque);
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < ans.size(); i++) {
                String temp = String.valueOf(ans.get(i));
                buffer.append(temp);
                if (i<ans.size()-1){
                    buffer.append("->");
                }
            }
            res.add(new String(buffer.toString()));
        }
        dfs(root.left,deque,res);
        dfs(root.right,deque,res);
        deque.pollLast();
    }

}
