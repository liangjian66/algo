import  java.util.*;

class FindLeaves {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        while(root != null){
            List list = new ArrayList<>();
            root = recur(root, list);
            resList.add(list);
        }
        return resList;
    }
    private TreeNode recur(TreeNode root, List<Integer> list){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
            return null;
        }
        root.left = recur(root.left, list);
        root.right = recur(root.right, list);
        return root;
    }
}

