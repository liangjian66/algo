
/*从上到下 打印二叉树  层序遍历*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromToBottom {

    public  static int[]   printFromToBottom(TreeNode root){
          if (root == null){
              return  new int[0];
          }
          Queue<TreeNode>  queue = new LinkedList<>(){
              {add(root);}
          };
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
           if (node.left!=null)queue.add(node.left);
           if (node.right != null)queue.add(node.right);

        }

        int[] res = new int[ans.size()];
        for (int i = 0; i <ans.size() ; i++) {
            res[i] = ans.get(i);
        }
         return  res;
    }

}
