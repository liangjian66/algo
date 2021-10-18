
import java.util.HashMap;
import java.util.Map;

public class MyBuildTreeTwo {

    private Map<Integer, Integer> indexMap;


    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        /*前序遍历的第一个节点就是根节点*/
        int preorder_root = preorder_left;
        /*找到中序节点 根节点的位置*/
        int inorder_root = indexMap.get(preorder[preorder_root]);
        /*先把 根节点建立起来*/
        TreeNode rootNode = new TreeNode(preorder[preorder_root]);

        /*得到左子树的数目*/
        int left_sub_num = inorder_root - inorder_left;

        /*递归构造左子树 并链接到根节点*/
        /**/
        rootNode.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + left_sub_num, inorder_left, inorder_root - 1);
        rootNode.right = myBuildTree(preorder, inorder, preorder_left + left_sub_num + 1, preorder_right, inorder_root + 1, inorder_right);

        return rootNode;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        /*构建hashSet ，帮助我们快速定位根节点*/
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}

