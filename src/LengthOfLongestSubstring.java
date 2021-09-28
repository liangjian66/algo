

/*无重复字符的最长子串:LengthOfLongestSubstring   滑动窗口   双指针  set集合*/

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
      public  static  int   lengthOfLongestSubstring(String s){
          int res = 0;
          Set<Character> set = new HashSet<>();

//    定义滑动窗口的左右边界 右边的初始值为-1  表示刚开始窗口还不存在
          int left = 0;
          int right = -1;
          while (left<s.length()){
//              如果还有元素可考察 ，且当前考察元素在set中不存在
//              同时将当前考察元素存入set ，同时扩大窗口右边界
              if (right+1<s.length() && !set.contains(s.charAt(right+1))){
                  set.add(s.charAt(right+1));
                  right++;
              }else {
//                  当前考察元素在set中有 ， 则需要缩小窗口的左边界
//                  在缩小左边界时 ， 要将对应元素从set移除
                    set.remove(s.charAt(left));
                    left++;

              }
              res = Math.max(res,right-left+1);
          }
          return  res;
      }

    public static void main(String[] args) {
        System.out.println("无重复字符的最长子串");
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

}
