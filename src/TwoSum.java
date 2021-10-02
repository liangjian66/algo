import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null){
            return  new int[0];
        }
        Map<Integer ,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int min = target - nums[i];
            if (map.containsKey(min) && i !=map.get(min)){
                res[0] = map.get(min);
                res[1] = i;
//                return new int[]{map.get(min), i};
            }
        }

        return  res;
    }
}
