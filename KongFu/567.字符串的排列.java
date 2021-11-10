/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start
import java.util.*;
class Solution {
    public  boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null){
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        HashMap<Character,Integer> s1HashMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> s2HashMap = new HashMap<Character,Integer>();
        for(int i= 0;i<s1Arr.length;i++){
            char c1 = s1Arr[i];
            s1HashMap.put(c1,s1HashMap.getOrDefault(c1,0)+1);
        }
        // 滑动窗口 双指针

        int s2Len = s2Arr.length;
        int s1Len = s1Arr.length;
        if (s1Len>s2Len){
            return  false;
        }
        int k = s1Len;
        // 初始化set
        for(int i = 0;i<k;i++){
            char c2 = s2Arr[i];
            s2HashMap.put(c2,s2HashMap.getOrDefault(c2,0)+1);
        }
        if(s1HashMap.equals(s2HashMap)){
            return true;
        }
        for(int i=0;i<s2Len-k;i++){
            int left = i;
            int right = i+k-1;
//            s2HashSet.remove(s2Arr[left]);
            if (s2HashMap.get(s2Arr[left]) == 1){
                s2HashMap.remove(s2Arr[left]);
            }else {
                s2HashMap.replace(s2Arr[left],s2HashMap.getOrDefault(s2Arr[left],0)-1);
            }

            char c2 = s2Arr[right+1];
            s2HashMap.put(c2,s2HashMap.getOrDefault(c2,0)+1);
            if(s1HashMap.equals(s2HashMap)){
                return true;
            }
        }
        return false;

    }

    
}
// @lc code=end

