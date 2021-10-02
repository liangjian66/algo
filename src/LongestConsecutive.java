import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums == null){
            return  0;
        }
        Set<Integer>  numSet = new HashSet<Integer>();
        for (int num: nums){
            numSet.add(num);
        }
//        Map<Integer,Integer>  map  = new HashMap<Integer ,Integer>();
        int longSize = 0;
//        for (int num :numSet){
//            map.put(num,0);
//        }
        for (int num: numSet){
            if (!numSet.contains(num-1)){
                  int curr = num ;
                  int size = 1;

                while (numSet.contains(curr+1)){
                      curr += 1;
                      size +=1;
                  }
                longSize  = Math.max(longSize ,size);
            }
        }

        return  longSize;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
      int size =   longestConsecutive(nums);
      System.out.println(size);
    }
}
