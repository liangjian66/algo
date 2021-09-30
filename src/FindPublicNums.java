import java.util.*;

public class FindPublicNums {

    public int[] findMode(TreeNode root) {
        if (root == null)
        {
            return  new int[0];
        }
        List<Integer>  res = new ArrayList<>();
        dfs(root,res);
        HashMap<Integer,Integer>  map = new HashMap<>();
        for (int i = 0; i < res.size(); i++) {
            if (map.containsKey(res.get(i))){
                map.put(res.get(i), map.get(res.get(i))+1);
            }else {
                map.put(res.get(i),1);
            }
        }
        // 迭代值
        int max = 0;

        List<Integer>  answer = new ArrayList<>();
        // 3. 使用 For-each 循环遍历 HashMap
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue()>max){
                answer.clear();
            }
            max = Math.max(max,entry.getValue());
            if (entry.getValue()==max){
                answer.add(entry.getKey());
            }
        }

        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        return  ans;

    }

    public  void dfs(TreeNode root, List<Integer> res){
        if (root  == null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
}


