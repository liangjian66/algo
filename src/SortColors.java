public class SortColors {
/*双指针解法*/
    public static void sortColors(int[] nums){
           int n = nums.length;
           int p0 = 0;
           int p1 = 0;
        for (int i = 0; i < n; i++) {
                if (nums[i] == 1){
                    swap(nums,i,p1);
                    ++p1;

                }else  if (nums[i] == 0){
                    swap(nums,i,p0);
                    if (p0 < p1) {
                        swap(nums,i,p1);
                    }
                    ++p0;
                    ++p1;
                }

        }

    }

/*单指针解法*/
    public static void sortColorsSinglePtr(int[] nums) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                swap(nums,i,ptr);
                ptr++;
            }
        }

        for (int j = ptr; j < nums.length; j++) {
            if (nums[j] == 1){
                swap(nums,j,ptr);
                ptr++;
            }
        }

    }

    public static void swap(int[] nums,int left ,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
