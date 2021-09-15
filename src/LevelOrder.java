/*二叉树层序遍历：LevelOrder 题解 ： 先把父节点放入队列 ，  然后遍历队列 ， 遍历子节点 */

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class LevelOrder {


    public List<List<Integer>>  levelOrder(AVLTree.TreeNode root){
        if (root == null){
            return  new ArrayList<List<Integer>>();
        }
        List<List<Integer>>  res = new ArrayList<List<Integer>>();
        LinkedList<AVLTree.TreeNode> queue =  new LinkedList<AVLTree.TreeNode>();
//       将根节点加入队列中 ， 然后不断的遍历
        queue.add(root);
//   queue不为空     然后迭代
        while (queue.size() >0){
//            获取当前的队列的长度 这个长度相当于   当前这一层的节点个数
            int size = queue.size();
            ArrayList<Integer>  tmp = new ArrayList<Integer>();
//            将队列的中元素都拿出来 （也就是获取这一层的节点） 放到临时list中
//            如果节点的左/右 子树不为空 也放入队列中
            for (int i = 0; i<size;++i){
                AVLTree.TreeNode t = queue.remove();
                tmp.add(t.data);
                if (t.left != null){
                    queue.add(t.left);
                }
                if (t.right != null){
                    queue.add(t.right);
                }
            }
//           将临时的list加入最终返回结果中
            res.add(tmp);

        }
        return res;
     }
}
