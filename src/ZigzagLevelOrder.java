import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*二叉树的锯齿形层序遍历: zigzagLevelOrder   题解 ： 利用双端队列锯齿形层次遍历 正常加入 取得时候判断从左 往右 还是从右往左*/
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
                    levelList.offerLast(curNode.val);
                }else {
                    levelList.offerFirst(curNode.val);
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
