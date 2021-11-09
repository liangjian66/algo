/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int len = numbers.length;
         int left = 0;
         int right = len-1;
         int[] res = new int[2];
         while(left<=right){
              int sum = numbers[left] + numbers[right];
              if(sum == target){
                  res[0] = left+1;
                  res[1] = right +1;
                  return res;
              }else if(sum>target){
                   right --;
              }else if(sum<target){
                  left++;
              }
         }
         return res;
    }
}
// @lc code=end

