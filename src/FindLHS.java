import java.util.HashMap;

public class FindLHS {
    public int findLHS(int[] nums) {
        /*分析问题的能力 条件是什么：两个差值是1 还有 这个数的数量   要得到什么 ： 两个差值为1的数的加起来的数量*/
         if (nums == null){
             return 0;
         }
        HashMap<Integer,Integer> map  = new HashMap<Integer ,Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int res  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]+1)){
                res = Math.max(res,map.get(nums[i])+ map.get(nums[i]+1));
            }
        }
        return  res;
    }
}
