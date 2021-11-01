import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SumNumbers {


    public int sumNumbers (TreeNode root) {
        // write code here
        if (root == null){
            return  0;
        }
        Deque<Integer>  deque = new LinkedList<>();
        List<Integer>  res =  new ArrayList<>();
        dfs(root,deque,res);
        int m = res.size();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += res.get(i);
        }

        return  sum;
    }


    public  void  dfs(TreeNode root, Deque<Integer> deque, List<Integer> res){
        if (root == null){
            return;
        }
        deque.addLast(root.val);
        if (root.left==null && root.right == null){
            List<Integer> ans = new ArrayList<>(deque);
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < ans.size(); i++) {
                builder.append(ans.get(i));
            }
            String temp = builder.toString();
            Integer num = Integer.parseInt(temp);
            res.add(num);
        }
        dfs(root.left, deque, res);
        dfs(root.right,deque,res);
        if (!deque.isEmpty()){
            deque.removeLast();
        }
    }
}
