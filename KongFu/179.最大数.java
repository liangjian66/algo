/*
 * @lc app=leetcode.cn id=179 lang=java
 *
 * [179] 最大数
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return "";
        }
        int n = nums.length;
        String[] ss = new String[n];
        for (var i = 0; i < nums.length; i++) {
            var each = nums[i];
            ss[i] = ""+ nums[i];
        }
        Arrays.sort(ss,(a,b) -> {
            String sa  = a +b;
            String sb = b+a;
            return sb.compareTo(sa);
        });
        StringBuilder sb = new StringBuilder();
        for(String s:ss){
            sb.append(s);
        }
        int len = sb.length();
        int k = 0;
        while(k<len-1&& sb.charAt(k) == '0')k++;
        return sb.substring(k);
    }
}
// @lc code=end

