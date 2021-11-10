/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows<=0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res  = new ArrayList<List<Integer>>();
        for(int i= 0;i<numRows;++i){
            List<Integer> row = new ArrayList<Integer>();
              for(int j = 0;j<=i;++j){
                  if(j==0|| j==i){
                       row.add(1);
                  }else{
                      int left = res.get(i-1).get(j-1);
                      int right = res.get(i-1).get(j);
                      row.add(left+right);
                  }
              }
              res.add(row);
        }
        return res;

    }
}
// @lc code=end

