

/*选择排序*/
public class SelectSort {

    public static void select(int[] nums) {


        for (int i = 0; i <nums.length-1; i++) {

            int minIndex = i ;
            int min = nums[minIndex];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<nums[minIndex]){
                    minIndex = j;
                }

            }
            // 下标不相等  互换
            if (i!=minIndex){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }



    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
        select(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
