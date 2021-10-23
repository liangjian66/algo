public class CanJump {

    public boolean canJump(int[] nums) {
        /*贪心  每一步能到的最远距离*/
        int m  = nums.length;
        int maxLength = 0;
        for (int i=0;i<m;i++){
            if (i<=maxLength){
                maxLength = Math.max(nums[i]+i,maxLength);
                if (maxLength>=m-1){
                    return  true;
                }
            }
        }
        return  false;
    }
}
