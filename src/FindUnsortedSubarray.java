import java.util.Arrays;

public class FindUnsortedSubarray {


    public int findUnsortedSubarray(int[] nums) {
        //初始化
        int len = nums.length;
        int min = nums[len-1];
        int max = nums[0];
        int begin = 0, end = -1;
        //遍历
        for(int i = 0; i < len; i++){
            if(nums[i] < max){      //从左到右维持最大值，寻找右边界end
                end = i;
            }else{
                max = nums[i];
            }

            if(nums[len-i-1] > min){    //从右到左维持最小值，寻找左边界begin
                begin = len-i-1;
            }else{
                min = nums[len-i-1];
            }
        }
        return end-begin+1;
    }



    /*排序 + 双指针*/
    public int findUnsortedSubarraySortMethods(int[] nums) {
        if (nums ==null || nums.length == 0){
            return  0;
        }
        int m  = nums.length;
        int[] tempArr = nums.clone();
        Arrays.sort(tempArr);
        int i = 0;
        int j = m-1;
        while (i<=j&&(tempArr[i] == nums[i])) i++;
        while (i<=j&&(tempArr[j] == nums[j])) j--;
        return  j-i+1;
    }

}
