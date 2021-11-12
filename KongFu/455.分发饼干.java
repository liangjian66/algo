/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int gPtr = 0;
            int sPtr = 0;
            int count = 0;
            int len1 = g.length;
            int len2 = s.length;

            while(gPtr<len1&&sPtr<len2){
                if(g[gPtr]>s[sPtr]){
                    sPtr++;
                }else{
                    gPtr++;
                    sPtr++;
                    count++;
                }
            }
            return count;
    }
}
// @lc code=end

