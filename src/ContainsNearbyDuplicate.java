import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (nums == null || len == 0){
            return true;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (map.containsKey(num)){
                List<Integer> list = map.get(num);
                list.add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num,list);
            }
        }
        for (List<Integer> list: map.values()){
            int size = list.size();
            for (int i = 0; i+1 < size; i++) {
                if (Math.abs(list.get(i+1)-list.get(i))<=k){
                    return  true;
                }
            }
        }

        return  false;
    }
}
