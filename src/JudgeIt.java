


import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class JudgeIt {
    /**
     *
     * @param root TreeNode类 the root
     * @return bool布尔型一维数组
     */
    long pre = Long.MIN_VALUE;
    public boolean[] judgeIt (TreeNode root) {
        // write code here
        boolean[] res = new boolean[2];
        res[0] = isSearchTree(root);
        res[1] = isPerfect(root);
        return res;
    }

    public boolean isSearchTree(TreeNode root){
        if(root == null){
            return true;
        }
        if(!isSearchTree(root.left)){
            return false;
        }
        if(root.val <= pre){
            return false;
        }
        pre  = root.val;
        return isSearchTree(root.right);
    }
    int n = 0;
    int p = 0;

    public boolean isPerfect(TreeNode root){
        if(!dfs(root,1)) return false;
        return n==p;
    }

    public boolean dfs(TreeNode root,int k){
        if(root == null){
            return true;
        }
        n++;
        p=Math.max(p,k);
        return dfs(root.left,2*k)&&dfs(root.right,2*k+1);
    }


}

