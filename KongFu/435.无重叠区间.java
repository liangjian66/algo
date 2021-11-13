/*
 * @lc app=leetcode.cn id=435 lang=java
 *
 * [435] 无重叠区间
 */

// @lc code=start

import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
          if(intervals.length == 0){
              return 0;
          }
          Arrays.sort(intervals,new Comparator<int[]>(){
              @Override
              public int compare(int[] o1,int[] o2){
                   return o1[0] - o2[0];
              }
          });
          int len = intervals.length;
        //   第一个数组的右边界
        int  right = intervals[0][1];
        int ans = 1;
        for(int i=1;i<len;i++){
            // 后面数组的左边界  大于前面的右边界 说明不重合
               if(intervals[i][0]>=right){
                  ++ans;
                  right = intervals[i][1];
               }
        }
          return len - ans;
    }
}
// @lc code=end

