import java.util.Arrays;

public class FindErrorNums {

    public int[] findErrorNums(int[] nums) {
        if (nums == null){
            return  new int[0];
        }
        Arrays.sort(nums);
        int slow = 0 ;
        int fast = 1;
        int[] errorNums = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
              if (nums[fast] == nums[slow]){
                  errorNums[0] = nums[slow];
              }else if (nums[fast]-nums[slow]>1){
                  errorNums[1] = nums[slow] +1;
              }
            fast++;
            slow++;
        }
//        考虑缺尾
        int n = nums.length;
        if (nums[n-1] != n ){
            errorNums[1] = n;
        }
//        考虑 缺第一位数
        if (nums[0] !=1){
            errorNums[1] = 1;
        }
        return  errorNums;
    }
}
