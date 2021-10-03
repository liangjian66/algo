public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        /*核心思想： 遇到0移除 ， 剩余的补位0*/
         int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] !=0){
                nums[slow++] = nums[fast];
            }
        }
        // 后面的元素全变成 0
        for (int j = slow; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
