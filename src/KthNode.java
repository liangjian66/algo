import java.util.ArrayList;

public class KthNode {

//    ArrayList<TreeNode> res;

//    {
//        res = new ArrayList<TreeNode>();
//    }

    //    中序遍历 的倒序列
    public  void middleSort(TreeNode rootNode ,ArrayList res ){
        if (rootNode == null){
            return;
        }
        middleSort(rootNode.right,res);
        res.add(rootNode);
        middleSort(rootNode.left,res);
    }

    public  int kthNode(TreeNode root,int k){
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        middleSort(root,res);
        for (int i = 0; i < res.size(); i++) {
            if (i == k-1){
                TreeNode kNode = res.get(i);
                return kNode.val;
            }
        }

        return 0;

    }

}
