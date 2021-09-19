import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {


    public static  int findRepeatNumber(int[] nums){
        Set set = new HashSet<Integer>();
         int repeat = -1;
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                repeat = nums[i];
                break;
            }
        }

          return  repeat;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));

    }
}
