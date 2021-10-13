public class MinDepth {

    public int minDepth(TreeNode root) {
          if (root == null){
              return  0;
          }
          int  leftDepth = minDepth(root.left);
        int    rightDepth = minDepth(root.right);
        int min =0;
        if (leftDepth==0){
            min =  rightDepth+1;
        }else if(rightDepth==0&&leftDepth != 0) {
            min = leftDepth + 1;
        }else {
             min = Math.min(leftDepth+1,rightDepth+1);
        }
        return  min;
    }
}
