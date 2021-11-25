/*
 * @lc app=leetcode.cn id=402 lang=java
 *
 * [402] 移掉 K 位数字
 */

// @lc code=start
class Solution {
    public String removeKdigits(String num, int k) {
        char[] numArr  = num.toCharArray();
        int len = numArr.length;
        if(len == 0|| len<k){
            return "";
        }
        int prevLen = len -k;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0;i<prevLen;i++){
            minVal = Math.min(minVal,numArr[i]-'0');
        }
        StringBuilder sb = new StringBuilder();
        
        if(minVal>0){
            sb.append(String.valueOf(minVal));
        }
        for(int i = len-k;i<len;i++){
            
            sb.append(numArr[i]);
        }

        return sb.toString();
    }
}
// @lc code=end

