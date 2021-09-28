import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*二叉树的锯齿形层序遍历: zigzagLevelOrder   题解 ： 利用双端队列锯齿形层次遍历*/
public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =  new LinkedList<List<Integer>>();
        if (root == null){
            return  ans;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;
        while (!nodeQueue.isEmpty()){
//
            Deque<Integer> levelList = new LinkedList<Integer>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft){
                    levelList.offerLast(curNode.data);
                }else {
                    levelList.offerFirst(curNode.data);
                }

                if (curNode.left!=null){
                    nodeQueue.offer(curNode.left);
                }
                if (curNode.right != null){
                    nodeQueue.offer(curNode.right);
                }

            }
            ans.add(new LinkedList<Integer>(levelList));
            isOrderLeft = !isOrderLeft;


        }
        return  ans;

    }
}
