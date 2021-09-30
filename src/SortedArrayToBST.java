
/*二分思想 分左半部分 右半部分 再递归*/

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }

    public TreeNode dfs(int[] nums,int low ,int high){
        if (low>high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums,low,mid-1);
        root.right = dfs(nums,mid+1,high);

        return  root;
    }
}
