/*
 * @lc app=leetcode.cn id=368 lang=java
 *
 * [368] 最大整除子集
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       int len = nums.length;
       Arrays.sort(nums);
    //    发现规律  然后求解
    // 最值问题 就是动态规划拉
    //    第一步 动态规划找出最大子集的个数 最大子集中的最大整数
    // 解决问题三部曲 第一步：把问题写下来 第二步：好好思考 第三步：把答案写下来
    int[]  dp = new int[len];
    Arrays.fill(dp,1);
    int maxSize = 1;
    int maxVal = dp[0];
    for (int i = 1; i < nums.length; i++) {
        for (int j = 0; j < i; j++) {
            if(nums[i]%nums[j] == 0){
                dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        if(dp[i]>maxSize){
            maxSize  = dp[i];
            maxVal = nums[i];
        }
    }
    // 第二步骤 倒退获得最大子集

    List<Integer> res = new ArrayList<Integer>();
    if(maxSize == 1){
        res.add(nums[0]);
        return res;
    }
    for(int i = len-1;i>=0&&maxSize>0;i--){
        if(dp[i] == maxSize && maxVal%nums[i] == 0){
            res.add(nums[i]);
            maxVal = nums[i];
            maxSize--;
        }
    }
    return res;
    }
}
// @lc code=end

