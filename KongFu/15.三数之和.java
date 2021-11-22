/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len<3){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<len-2;i++){
            if(nums[i] > 0) break;
            if(i> 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = len-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum>0){
                    while(left<right&&nums[right] == nums[--right]);

                }else if(sum<0){
                    while(left<right&&nums[left] == nums[++left]);
                }else{
                        ArrayList<Integer> list =  new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        while(left < right && nums[left] == nums[++left]);
                        while(left < right && nums[right] == nums[--right]);
                }
            }
        }
        return res;

    }
}
// @lc code=end

