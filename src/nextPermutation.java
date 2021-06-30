// leetcode 31 下一个排列
// 题解：
//第一步 从后面前面排，默认是升序列 ，找出第一个降序下标i
//第二步 i 跟i+1 到end 对比 ，从后面到前面 找出比i大的数 ，然后交换两个位置的数
//第三步 重新排序 i+1 到end 从小往大排序



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
