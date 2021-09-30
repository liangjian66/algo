
/*反序中序遍历*/

public class ConvertBST {

    int sum = 0 ;
//    反序中序遍历
    public  TreeNode convertBST(TreeNode root){
          if (root == null){
              return  root;
          }
          convertBST(root.right);
          sum+=root.val;
          root.val = sum;
           convertBST(root.left);
           return  root;
    }
}
