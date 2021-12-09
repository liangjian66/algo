
import java.util.*;

// 对人生欲望的挑战  抓住机会

public class Test {


    public int pileBox(int[][] box) {
          Arrays.sort(box, new Comparator<int[]>() {
              @Override
              public int compare(int[] o1, int[] o2) {
                  if (o1[0] !=o2[0]){
                      return  o1[0] - o2[0];
                  }else {
                   return    o2[1] - o1[1];
                  }
              }
          });
          int m = box.length;
          int max = 0;
          int[] dp = new int[m+1];
        for (int i = 1; i <m+1 ; i++) {
            dp[i] = box[i-1][2];
            for (int j = 1; j <m+1 ; j++) {
                if (box[j-1][1]<box[i-1][1]&&box[j-1][2]<box[i-1][2]){
                    dp[i] = Math.max(dp[i],dp[j]+box[i-1][2]);
                }
            }
            max   = Math.max(max,dp[i]);
        }
        return  max;
    }



    public static void main(String[] args) {

    }

}








