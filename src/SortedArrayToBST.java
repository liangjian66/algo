
/*二分思想 分左半部分 右半部分 再递归*/

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null|| nums.length==0){
          return  null;
        }
         int n = nums.length;
        return  recur(nums,0,n-1);

    }

    public  TreeNode recur(int[] nums,int left ,int right){
        if (left>right){
            return  null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = recur(nums,left,mid-1);
        root.right = recur(nums,mid+1,right);
        return  root;
    }
}
