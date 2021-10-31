
/* 删除有序数组中的重复项 :  removeDuplicates  题解使用快慢指针*/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        /*边界判断*/
        int n  = nums.length;
        if (n==0){
            return  0;
        }
        int fast = 1;
        int slow = 1;
        while (fast<n){
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return  slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int  a =  removeDuplicates(nums);
        System.out.println("删除有序数组中的重复项:"+a);
    }
}
