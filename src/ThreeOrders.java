public class ThreeOrders {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders (TreeNode root) {
        ArrayList<TreeNode>  arr1 = new ArrayList<TreeNode>();
        frontOrders(root,arr1);
        int n = arr1.size();
        int[] ans1 = new int[n];
        for(int i= 0;i<n;i++){
            ans1[i] = arr1.get(i).val;
        }

        ArrayList<TreeNode>  arr2 = new ArrayList<TreeNode>();
        inOrders(root,arr2);
        int[] ans2 = new int[n];
        for(int i= 0;i<n;i++){
            ans2[i] = arr2.get(i).val;
        }

        ArrayList<TreeNode>  arr3 = new ArrayList<TreeNode>();
        behindOrders(root,arr3);
        int[] ans3 = new int[n];
        for(int i= 0;i<n;i++){
            ans3[i] = arr3.get(i).val;
        }
        int m = 3;
        int[][] answer = new int[][]{ans1,ans2,ans3};
        return answer;
        // write code here
    }
    public void frontOrders(TreeNode root,ArrayList<TreeNode> res){
        if(root == null){
            return;
        }
        res.add(root);
        frontOrders(root.left,res);
        frontOrders(root.right,res);

    }
    public void inOrders(TreeNode root,ArrayList<TreeNode> res){
        if(root == null){
            return;
        }
        inOrders(root.left,res);
        res.add(root);
        inOrders(root.right,res);

    }
    public void behindOrders(TreeNode root,ArrayList<TreeNode> res){
        if(root == null){
            return;
        }
        behindOrders(root.left,res);
        behindOrders(root.right,res);
        res.add(root);
    }
}
