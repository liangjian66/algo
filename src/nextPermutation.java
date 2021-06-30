

public class nextPermutation {


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;

        while (left <right){
            swap(nums,left,right);
            left++;
            right--;
        }


    }



    public static void nextPermutation(int[] nums) {


        if (nums.length <=1){
            return;
        }
        // 第一步从后往前默认是升序，找出降序的第一个数字 下标为i
        int i = nums.length -2;
        int j = nums.length -1;
        int k = nums.length -1;
        while (i>=0&&nums[i]>=nums[j]){
            i--;
            j--;
        }

        //第二步 在i->end 中升序序列找出第一个比下标i 大的数

        if ( i>= 0){
            while (nums[i]>=nums[k]){
                k--;
            }
            // 交换i 和 K
            swap(nums,i,k);
        }

        // 第三步 i ->end  重新升序排序
        reverse(nums,i+1);

    }

    public static void main(String[] args) {

        int[] myList = {1, 2, 3, 8,5,7,6,4};
        nextPermutation(myList);
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

    }

}
