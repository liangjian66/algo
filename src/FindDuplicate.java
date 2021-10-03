public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
//        走一步
        slow = nums[slow];
//        走两步
        fast = nums[nums[fast]];
//        快慢指针不相遇  接着往下面走
        while (slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int pre1 = 0;
        int pre2 = slow;
        while (pre1 != pre2){
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }

        return  pre1;
    }

}
