/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
import java.util.*;
class Solution {
    

    public String minWindow(String s, String t) {

     HashMap<Character,Integer>  hs = new HashMap<Character,Integer>();
     HashMap<Character,Integer>   ht = new HashMap<Character,Integer>();

        for(int i=0;i<t.length();i++){
            ht.put(t.charAt(i),ht.getOrDefault(t.charAt(i),0)+1);
        }
        String ans = "";
        int len = Integer.MAX_VALUE;
        // 有多少个元素符合
        int cnt = 0;
        // j表示左指针  i表示右指针
        for(int right = 0,left=0;right<s.length();right++){
            hs.put(s.charAt(right),hs.getOrDefault(s.charAt(right),0)+1);
            if(ht.containsKey(s.charAt(right))&&hs.get(s.charAt(right))<=ht.get(s.charAt(right))) cnt++;
            while(left<right&&(!ht.containsKey(s.charAt(left))|| hs.get(s.charAt(left))>ht.get(s.charAt(left)))){
                int count = hs.get(s.charAt(left))-1;
                hs.put(s.charAt(left),count);
                left++;
            }
            if(cnt == t.length()&&right-left+1<len){
                len = right-left+1;
                ans = s.substring(left,right+1);
            }
        }

          return ans;
    }
}
// @lc code=end

