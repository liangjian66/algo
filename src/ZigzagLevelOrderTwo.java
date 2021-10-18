import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ZigzagLevelOrderTwo {

    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null){
            return   new ArrayList<ArrayList<Integer>>();
        }
        Deque<TreeNode> deque  = new LinkedList<TreeNode>();
        deque.offer(pRoot);
        /*初始化 通过是否是奇数行 实现之子打印*/
        boolean isOdd = false;

        while (!deque.isEmpty()){
            int n = deque.size();
            /*第一次 是奇数  后面然后再取反*/
            isOdd = !isOdd;
            Deque<Integer>  arrDeque = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                TreeNode temp = deque.poll();
                /*正向加入*/
                if (isOdd){
                    arrDeque.offerLast(temp.val);
                }else {
                    arrDeque.offerFirst(temp.val);
                }
                if (temp.left != null){
                    deque.offer(temp.left);
                }
                if (temp.right != null){
                    deque.offer(temp.right);
                }
            }
            res.add(new ArrayList<>(arrDeque));
        }
        return  res;
    }
}
