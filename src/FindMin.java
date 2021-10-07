public class FindMin {

    public  int findMin(int[] nums){
        int low = 0;
        int high = nums.length -1;
        while (low<high){
            int pivot = low + (high-low)/2;
            if (nums[pivot] < nums[high]){
                /*说明在左区间*/
                high = pivot;
            }else {
                /*说明在右区间*/
                low = pivot+1;

            }
        }
        return  nums[low];
    }

}
