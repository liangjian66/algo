import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if (nums == null){
            return  false;
        }
        Set set = new HashSet();
        boolean isSuccess = false;
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                isSuccess = true ;
            }
        }
        return  isSuccess;
    }
}
