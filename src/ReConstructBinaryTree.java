import java.util.HashMap;
import java.util.Map;

public class ReConstructBinaryTree {
     Map<Integer,Integer> indexMap ;
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        int n = pre.length;
        indexMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < n; i++) {
            indexMap.put(vin[i],i);
        }
        return  myBuild(pre,vin,0,n-1,0,n-1);
    }

    public  TreeNode myBuild(int[] preOrder ,int[] inOrder,int preOrder_left,int preOrder_right,int inOrder_left,int inOrder_right){
        if (preOrder_left>preOrder_right){
            return  null;
        }
        int preOrder_root =  preOrder_left;
        int inOrder_root = indexMap.get(preOrder[preOrder_root]);
        TreeNode root = new TreeNode(preOrder[preOrder_root]);
        /*左子树 长度*/
        int left_child_length = inOrder_root- inOrder_left;
        /*递归 左子树*/
        root.left = myBuild(preOrder,inOrder,preOrder_left+1,preOrder_left+left_child_length,inOrder_left,inOrder_root-1);
        root.right = myBuild(preOrder,inOrder,preOrder_left+left_child_length+1,preOrder_right,inOrder_root+1,inOrder_right);
        return  root;
    }

}
