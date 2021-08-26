/*二分查找*/

public class HalfSearch {

    public  static  int search(int[] nums , int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + (left + right)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid]<target){
                left = mid-1;
            }else {
                right = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        removeKdigits("1593212",3);
        int[] arr = new int[] { -1, 0, 3, 5, 9, 12 };
//        sort(arr,0,6);
//        int[] tempArr =    sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        int half  = search(arr,9);
        System.out.print(half);
    }
}
