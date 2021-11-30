/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1  = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int len1 = arr1.length;
        int len2 = arr2.length;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<len1;i++){
            char c = arr1[i];
            if(map1.containsKey(c)){
                  map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }
        }
        for(int i =0;i<len2;i++){
            char c = arr2[i];
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }

        return map1.equals(map2);



    }
}
// @lc code=end

