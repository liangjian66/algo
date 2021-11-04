/*重建二叉树：MyBuildTree  思路： 只要我们在中序遍历中定位到根节点 ，分割 ，计算左子树 位置*/


import java.util.HashMap;
import java.util.Map;

//class  TreeNode {
//    int val;
//    int height;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(int val) {
//        this.val = val;
//        this.height = 0;
//    }
//}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }



public class MyBuildTree {
    private Map<Integer, Integer> indexMap;

    public  TreeNode myBuildTree(int[] preorder,int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right){
       if (preorder_left>preorder_right){
           return  null;
       }
//       前序遍历的第一个节点就是根节点
        int preorder_root = preorder_left;
//       在中序遍历中定位根节点位置
        int inorder_root = indexMap.get(preorder[preorder_root]);
//        先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);
//        得到左子树的节点数目
        int size_left_subtree = inorder_root - inorder_left;
//        递归的构造左子树 ，并链接到根节点
//        先序遍历中【 从左边界+1 开始 的size_left_subtree 】个元素就对应了中序遍历中【从左边界 开始到 根节点定位-1】的元素
//       前序遍历序列数组 构建左子树
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);

//    递归构造右子树 并链接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder,inorder,preorder_left+size_left_subtree+1,preorder_right,inorder_root + 1,inorder_right);
      return  root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

}
