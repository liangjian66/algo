/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
import java.util.*;
class Solution {
    public  int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        int len = s.length();
        Map<Integer,Character> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int res = 0;
        while(left<len &&right<len){
//            Character rightC = new Character(s.charAt(right));
            while(right<len &&(!map.containsValue(s.charAt(right)))){
                map.put(right,s.charAt(right));
                right++;
                int temp = right-left;
                res = Math.max(res,temp);
            }
//            Character leftC = new Character(s.charAt(left));
            if (left<len &&map.containsValue(s.charAt(left))){
                map.remove(left);
                left++;
            }
        }
        return res;

    }
}
// @lc code=end

