import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TreeToDoublyListTwo {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return pRootOfTree;
        }
        Queue<TreeNode>  queue = new LinkedList<TreeNode>();

        inOrder(pRootOfTree,queue);
        TreeNode head = queue.poll();
        TreeNode prev = head;
        prev.left = null;
        TreeNode curr = null;
        while(!queue.isEmpty()){
            curr =  queue.poll();
            prev.right = curr;
            curr.left = prev;
            prev = curr;
        }
        prev.right=null;

        return head;
    }

    public void inOrder(TreeNode root,Queue queue){
        if(root == null){
            return;
        }
        inOrder(root.left,queue);
        queue.offer(root);
        inOrder(root.right,queue);

    }
}
