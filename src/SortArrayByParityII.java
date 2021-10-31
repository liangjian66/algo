public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {

        /*两次遍历*/
        if (nums==null || nums.length==0){
            return  nums;
        }
        int n = nums.length;
        int i = 0;
        int[] ans = new int[n];
        for (int j = 0; j < n&&i<n; j++) {
            if (nums[j]%2==0){
                ans[i] = nums[j];
                i+=2;
            }
        }

        i = 1;
        for (int k = 0; k < n&&i<n; k++) {
            if (nums[k]%2==1){
                ans[i] = nums[k];
                i+=2;
            }
        }
         return  ans;
    }

}
