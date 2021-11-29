/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n-1;
        while(left<=right){
            int mid = left + (right -left)/2;
            int midVal = matrix[mid/n][mid%n];
            if(midVal == target){
                return true;
            }else if(midVal<target){
                left = mid+1;
            }else if(midVal>target){
                right  = mid-1;
            }
        }
        return false;


    }
}
// @lc code=end

