/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len-1;
        while(i<=j){
            
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                 return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;

    }

    public boolean isPalindrome(String s,int low ,int high){
        while(low<=high){
            char c1 = s.charAt(low);
            char c2 = s.charAt(high);
            if(c1 != c2){
                 return false;
            }
            low++;
            high--;
        }
        return true;
    }
}

// @lc code=end

