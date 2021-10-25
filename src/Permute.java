import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;



public class Permute {

    public static List<List<Integer>> permute(int[] nums) {

        int len = nums.length;
//        使用一个动态数组保存所有的全排列
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0){
            return  res;
        }
        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>(len);
        dfs(nums,len,0,path,used,res);
        return  res;

    }

    private  static void dfs(int[] nums,int len,int depth,Deque<Integer> path,boolean[] used,List<List<Integer>> res){

//         递归终止条件
        if (depth == len){
            res.add(new ArrayList<>(path));
            return;
        }
         /*在非叶子节点处 产生不同的分支 这一操作的语义是 在还未选择的数中一次选择一个元素作为下一个位置的元素，这显然通过一个循环实现*/
        for (int i = 0; i < len; i++) {
            if (!used[i]){
                // 1、每一次尝试都创建新的变量表示当前的"状态"

                path.addLast(nums[i]);
                used[i] = true;
                /*递归之前*/
                dfs(nums,len,depth+1,path,used,res);
                /*递归之后*/
                used[i] = false;
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> lists = Permute.permute(nums);
        System.out.println(lists);

    }

}
