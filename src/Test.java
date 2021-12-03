import java.util.*;

public class Test {



    public static void main(String[] args) {
        String S = ")(()())";
        Test test = new Test();

//       [1,2,3,3,3,3,4,5],3
        int[] matrix = new int[]{2, 3};
//        System.out.println(test.longestValidParentheses(S));
    }

    public int goodNodes(TreeNode root) {
        if (root == null){
            return  0;
        }
        Deque<Integer> path = new ArrayDeque<>();
        List<ArrayList<Integer>> res = new ArrayList<>();
        dfs(root,path,res);
        int count  = 0 ;
        for (int i = 0; i < res.size() ; i++) {
            ArrayList<Integer> temp =  res.get(i);
            boolean isgoodNodes = true;
            for (int j = 0; j < temp.size(); j++) {
                   int num = temp.get(j);
                   if (num>temp.get(temp.size()-1)){
                       isgoodNodes = false;
                   }
            }
            if (isgoodNodes){
                count++;
            }
        }
        return  count;
    }
    public void dfs(TreeNode root,Deque<Integer> path,List<ArrayList<Integer>> res){
        if (root == null){
            return;
        }
        path.addLast(root.val);
        ArrayList<Integer> temp =  new ArrayList<>(path);
        
        res.add(temp);
        dfs(root.left,path,res);
        dfs(root.right,path,res);
        path.removeLast();
    }
}




