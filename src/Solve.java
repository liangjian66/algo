import java.util.*;


public class Solve {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 求二叉树的右视图
     * @param xianxu int整型一维数组 先序遍历
     * @param zhongxu int整型一维数组 中序遍历
     * @return int整型一维数组
     */
    Map<Integer,Integer>  zhongxuMap = new HashMap<>();
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        for(int i=0;i<zhongxu.length;i++){
            zhongxuMap.put(zhongxu[i],i);
        }
        int m = xianxu.length-1;
        int n = zhongxu.length-1;

//         List<Integer>  res = new ArrayList<Integer>();
        TreeNode root =   sortNode(xianxu,0,m,zhongxu,0,n);
        // 层序遍历找右视图
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return new int[0];
        q.add(root);
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            for (int i = q.size()-1; i >= 0; i--) {
                TreeNode node = q.poll();
                if (i == 0) list.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public TreeNode sortNode(int[] xianxu,int xianxuLeftP,int xianxuRightP, int[] zhongxu,int zhongxuLeftP,int zhongxuRightP){
        if(xianxuLeftP>xianxuRightP ||(zhongxuLeftP>zhongxuRightP)){
            return null;
        }
        int rootVal = xianxu[xianxuLeftP];
        int zhongRootIndex = zhongxuMap.get(rootVal);
        int size =  zhongRootIndex -  zhongxuLeftP;
//         然后递归左子树
        int left_child_xianxuLeftP = xianxuLeftP+1;
        int left_child_xianxuRightP = xianxuLeftP+size;
        int left_child_zhongxuLeftP = zhongxuLeftP;
        int left_child_zhongxurightP =  zhongxuLeftP+size;

//         然后递归 右子树
        int right_child_xianxuLeftP =  xianxuLeftP+size+1;
        int right_child_xianxuRightP = xianxuRightP;
        int  right_child_zhongxuLeftP =  zhongxuLeftP+size+1;
        int  right_child_zhongxuRightP = zhongxuRightP;

        TreeNode root = new TreeNode(rootVal);

        root.left = sortNode(xianxu,left_child_xianxuLeftP,left_child_xianxuRightP,zhongxu,left_child_zhongxuLeftP,left_child_zhongxurightP);
        root.right = sortNode(xianxu,right_child_xianxuLeftP,right_child_xianxuRightP,zhongxu,right_child_zhongxuLeftP,right_child_zhongxuRightP);
        return root;
    }
}