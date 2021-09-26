
/*数组中的逆序对   利用归并思想*/

public class InversePairs {

    public static int reversePairs(int[] nums){
        int len = nums.length;
        if (len<2){
            return 0;
        }
        int[] copy  = new  int[len];
        for (int i = 0; i <len ; i++) {
            copy[i] = nums[i];
        }
        int[] temp = new int[len];
        return reversePairs(copy, 0, len - 1, temp);

    }

    private static int reversePairs(int[] nums, int left ,int right,int[] temp){
        if (left == right){
            return 0;

        }
        int mid = left + (right-left)/2;
        int leftPairs = reversePairs(nums,left,mid,temp);
        int rightPairs  = reversePairs(nums,mid+1,right,temp);
//        if (nums[mid] <= nums[mid + 1]) {
//            return leftPairs + rightPairs;
//        }
//        int res  =
        if (nums[mid] <= nums[mid + 1]) {
            return leftPairs + rightPairs;
        }
        int crossPairs = merge(nums, left, mid, right, temp);

        return leftPairs + rightPairs + crossPairs;

    }

    private static int merge(int[] nums,int left ,int mid ,int right,int[] temp){
        for (int i = left; i <= right ; i++) {
            temp[i] = nums[i];
        }
        int i = left;
        int j = mid+1;
        int count = 0;
        for (int k = left; k <= right ; k++) {
            //            还剩余 右对
            if (i==mid+1){
                nums[k] = temp[j];
                j++;
            }
            // 还剩余 左对
            else if (j==right+1){
                nums[k] = temp[i];
                i++;
            }

           else if (temp[i]<=temp[j]){
                nums[k] = temp[i];
                i++;
            }else  {
                  nums[k] = temp[j];
                  j++;
//                  剩余左对个数 就是逆序对个数
                  count+= mid-i+1;
            }

        }

        return  count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 5, 6, 4 };
        System.out.println(reversePairs(arr));
    }
}
