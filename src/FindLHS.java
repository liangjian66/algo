import java.util.HashMap;

public class FindLHS {
    public int findLHS(int[] nums) {
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
