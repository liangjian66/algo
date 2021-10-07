public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {

       int first =  findFirst(nums,target);
       int last =  findFirst(nums,target+1)-1;
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        } else {
            return new int[]{first, Math.max(first, last)};
        }


    }

    private static   int findFirst(int[] nums,int target){
        int l = 0;
        int h = nums.length;
        while (l<h){
            int mid = l+(h-l)/2;
            if (nums[mid] >= target){
                h = mid;
            }else {
                l = mid+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        for (int num: searchRange(nums,8)){
            System.out.println(num);

        }
    }
}
