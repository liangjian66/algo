import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer>  path = new ArrayDeque<>();
        dfs(n,k,1,path,res);
       return  res;
    }

    public  void  dfs(int n,int k ,int begin,Deque<Integer> path,List<List<Integer>> res){
        /*终止条件*/
        if (path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <=n; i++) {
             path.addLast(i);
             /*先考虑一层的情况 回溯 */
             dfs(n,k,i+1,path,res);
             path.removeLast();
        }
    }
}
