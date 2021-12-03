/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr (String haystack, String needle) {
        // write code here
        if (needle.length() == 0){
            return  0;
        }
        int[] next = getNext(needle);
        int j = 0;
//        主循环
        for (int i = 0; i < haystack.length(); i++) {
            // 遇到坏字符
            while ((j>0)&&(haystack.charAt(i) != needle.charAt(j))){
                j = next[j];
            }
             if (haystack.charAt(i) == needle.charAt(j)){
                 j++;
             }
             if (j == needle.length()){
                 return  i - needle.length()+1;
             }
        }
        return  -1;
    }

    public  int[] getNext(String S){
        char[] arr = S.toCharArray();
        int len = arr.length;
        int[] next = new int[arr.length];
        int j = 0;
        // i 不包含 i位置
        for (int i = 2; i <len ; i++) {
            while (j>0&&(arr[j] != arr[i-1])){
                // 回溯
                j = next[j];
            }
              if (arr[j] == arr[i-1]){
                  j++;
              }
              next[i] = j;
        }
        return  next;
    }
}
// @lc code=end

