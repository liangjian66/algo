import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            if (root == null){
                return  new ArrayList<List<Integer>>();
            }
        Deque<TreeNode>  deque = new LinkedList<>();
        Deque<List<Integer>>  resDeque = new LinkedList<>();

        deque.addLast(root);
        while (!deque.isEmpty()){
            int m = deque.size();
            List<Integer>  arr = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                TreeNode node = deque.pollFirst();
                arr.add(node.val);
                if (node.left != null){
                    deque.addLast(node.left);
                }
                if (node.right != null){
                    deque.addLast(node.right);
                }
            }
            resDeque.addFirst(arr);
        }
        return   new ArrayList<List<Integer>>(resDeque);
    }
}
