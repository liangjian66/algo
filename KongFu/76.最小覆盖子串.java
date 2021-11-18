/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
import java.util.*;
class Solution {
    Map<Character,Integer> orign=new HashMap<>();
    Map<Character,Integer>window=new HashMap<>(); //记录滑动窗口中的character及频率
    int ansL=-1;//全局的左指针
    int ansR=-1;//全局的右指针
    int len=Integer.MAX_VALUE; //记录每次匹配符合时子串的长度
    public String minWindow(String s, String t) {
        for (int i = 0; i < t.length() ; i++) {
            char c=t.charAt(i);
            orign.put(c,orign.getOrDefault(c,0)+1);
        }
        //左、右指针
        int l=0;
        int r=-1;
        while (r<s.length()){
            r++;
            //可能window中一个字符出现的次数要多于我们要比对的那个字符串中字符的个数
            if(r<s.length()&&orign.containsKey(s.charAt(r))){
                window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
            }
            while (check()&&l<=r){ //这里检查左指针是否可以收缩窗口，注意左指针可以收缩窗口的条件在于：窗口中包含了字符t
                //能够走到这里就说明已经符合要求了,但是要找到全局最小的子串，所以每次都要判断一下
                if(r-l+1<len){
                    ansL=l;
                    ansR=r;
                    len=r-l+1;
                }
                //如果window中的左边出现了t中的字符，直接减1，然后看是否还能满足完全覆盖的要求
                if(orign.containsKey(s.charAt(l))){
                    window.put(s.charAt(l),window.getOrDefault(s.charAt(l),0)-1);
                }
                l++;
            }
        }
        return ansR==-1?"":s.substring(ansL,ansR+1); //ansR==-1 说明没有符合的，就返回空字符串
    }

   //用于检测是否窗口中是否完全覆盖了子串
    public boolean check(){
        for (Map.Entry e:orign.entrySet()){
             int val= (int) e.getValue();
             if(window.getOrDefault(e.getKey(), 0)<val){
                 return false;
             }
        }
        return true;
    }

}


// @lc code=end

