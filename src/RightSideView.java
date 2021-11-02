import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RightSideView {


    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return  new ArrayList<Integer>();
        }
        Deque<TreeNode>  deque = new LinkedList<>();
        deque.addLast(root);
        ArrayList<Integer> res = new ArrayList<>();
        while (!deque.isEmpty()){
            int m = deque.size();
            for (int i = 0; i < m; i++) {
                TreeNode node = deque.pollFirst();
                 if (i == m-1){
                    res.add(node.val);
                 }
                 if (node.left != null){
                     deque.addLast(node.left);
                 }
                 if (node.right != null){
                     deque.addLast(node.right);
                 }
            }
        }
        return  res;
    }
}
