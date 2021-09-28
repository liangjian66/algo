
/*股票的最大利润:   只要求 ，最值 就用动态规划*/

public class MaxDiff {

     public  int maxDiff(int[] nums){
         if (nums.length==0){
             return  0 ;
         }

         int min = nums[0];
         int maxDiffValue = 0;
         for (int num: nums){
             min = Math.min(min,num);
             maxDiffValue = Math.max(maxDiffValue,num-min);
         }

         return maxDiffValue;
     }
}
