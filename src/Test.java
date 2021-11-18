import java.util.*;

public class Test {


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
              merged.add(new int[]{left,right});
          }else {
              merged.get(size-1)[1] = Math.max(merged.get(size-1)[1],right);
          }

          return  merged.toArray(new int[][]);
        }

    }


    public static void main(String[] args) {
//        String temp = "dvdf";
//        LinkedHashSet<Integer>  keyList = new LinkedHashSet<>();
//        keyList.iterator().next();
//
        Test test = new Test();
//        int[][] grid = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
//        Arrays.copyOf()    [0,1,0,2,1,0,1,3,2,1,2,1]
//        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
      String num = "10200";

        Stack<TreeNode> stack = new


//                System.out.println(test.removeKdigits(num,1));

    }
}
