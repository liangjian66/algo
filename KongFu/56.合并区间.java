/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals ==null || intervals.length ==0){
            return  new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
          int left =   intervals[i][0];
          int right = intervals[i][1];
          int size =  merged.size();
          if (size == 0 || merged.get(size-1)[1]<left){
            merged.add(new int[]{left, right});
        }else {
              merged.get(size-1)[1] = Math.max(merged.get(size-1)[1],right);
          }
          
        }
        return  merged.toArray(new int[merged.size()][]);

    }
}
// @lc code=end

