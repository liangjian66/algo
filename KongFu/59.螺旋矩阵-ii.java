/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int[][] res = new int[n][n];
        int start = 1;
        while(true){
            for(int i = left;i<=right;i++){
                   res[top][i] =  start++;
            }
            if(++top>bottom) break;
            for(int i = top;i<=bottom;i++ ){
                res[i][right] = start++;
            }
            if(--right<left) break;
            for(int i = right ;i>=left;i--){
                res[bottom][i] = start++;
            }
            if(--bottom<top) break;
            for(int i = bottom;i>=top;i--){
                res[i][left] = start++;
            }
            if(++left>right) break;

        }

        return res;

    }
}
// @lc code=end

