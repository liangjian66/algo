import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTest {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if ( root == null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.offer(root);

        while (!deque.isEmpty()){

            int n = deque.size();
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i <n ; i++) {
                TreeNode node = deque.poll();
                temp.add(node.val);
                if (node.left != null){
                    deque.offer(node.left);
                }
                if (node.right != null){
                    deque.offer(node.right);
                }
            }
            ans.add(temp);

        }
        return  ans;

    }
}
