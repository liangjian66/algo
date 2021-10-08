public class NumArray {

    int[] sums;
    public NumArray(int[] nums) {
        int n = nums.length;
        nums = new int[n+1];
        for (int i = 0; i < n; i++) {
            /*
            *       sums[i+1] = sums[i] +nums[i];
             *      sums  比nums 后移一位  要注意坐标关系
            * */

            sums[i+1] = sums[i] +nums[i];
        }

    }

    public int sumRange(int left, int right) {
           return sums[right+1] -sums[left];
    }
}
