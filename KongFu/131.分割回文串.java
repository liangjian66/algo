/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start

import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        List<List<String>> res = new ArrayList<>();
        if(len == 0){
            return res;
        }
        Deque<String> stack = new ArrayDeque<>();
        dfs(charArray,0,len,stack,res);
        return res;
    }

    public void dfs(char[] charArray,int index,int len,Deque<String> path,List<List<String>>  res){
        if(index == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i =index;i<len;i++){
              if(!checkPalindrome(charArray,index,i)){
                  continue;
              }
              path.addLast(new String(charArray,index,i+1-index));
              dfs(charArray,i+1,len,path,res);
              path.removeLast();
        }
    }


    /**
     * 这一步的时间复杂度是 O(N)，优化的解法是，先采用动态规划，把回文子串的结果记录在一个表格里
     *
     * @param charArray
     * @param left      子串的左边界，可以取到
     * @param right     子串的右边界，可以取到
     * @return
     */
    private boolean checkPalindrome(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

