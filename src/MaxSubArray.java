public class MaxSubArray {
    /*贪心  求每一个i位置的子数组最大和*/
    /*贪心  2位置的子数组最大和依赖1 位置  3依赖2*/
    /*动态规划 ： 后一个结果依赖前面一个结果*/

    public int maxSubArray(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int max = nums[0] ;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(nums[i],start+nums[i]);
            max = Math.max(max,start);
        }
        return  max;
    }

}
