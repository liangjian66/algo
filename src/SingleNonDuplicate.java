public class SingleNonDuplicate {

    public  int singleNonDuplicate(int[] nums){
       int low = 0;
       int high = nums.length -1;
       while (low<high){
           int mid = low + (high-low)/2;
           boolean  halvesAreEven  = (high - mid)%2 == 0;
           if (nums[mid+1] == nums[mid]){
               if (halvesAreEven){
                   low = mid +2;
               }else {
                   high = mid-1;
               }

           }else if (nums[mid-1]  == nums[mid]){
               if (halvesAreEven){
                   high = mid -2;
               }else {
                   low = mid + 1;
               }

           }else {
               return  nums[mid];
           }
       }
       return  nums[low];
    }
}
