import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>>  res = new ArrayList<>();
        if (len == 0){
            return  res;
        }
        Deque<Integer>  path  = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);
        return  res;
    }

    /**
     * 递归调用
     * @param candidates 候选数组
     * @param begin      搜索起点
     * @param len    沉余变量 是candidates属性 ，可以不传
     * @param target  每减去一个元素 ，目标值变小
     * @param path  从根节点到叶子节点的路径 是一个栈
     * @param res  结果集列表
     */
    private  void  dfs(int[] candidates, int begin, int len , int target, Deque<Integer> path,List<List<Integer>> res){
          /*target为负数和0 不在产生新的孩子节点*/
                if (target<0){
                    return;
                }
                if (target == 0){
                    /*path 是变化的 所以需要拷贝一下*/
                    res.add(new ArrayList<>(path));
                }
                /*重点理解这里从begin 开始搜索的语意*/
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);
            /*注意：由于每一个元素可以重复使用， 下一轮搜索的起点依然是i ，这里非常容易弄错*/
            dfs(candidates,i,len,target-candidates[i],path,res);
            /*状态重置*/
            path.removeLast();
        }
    }
}
