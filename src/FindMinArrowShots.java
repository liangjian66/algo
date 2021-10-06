import java.util.Arrays;
import java.util.Comparator;

/**/
public class FindMinArrowShots {

    public static int findMinArrowShots(int[][] points){
        if (points == null){
            return 0;
        }
        /*根据右边排序*/
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1]>o2[1]){
                    return  1;
                }else if (o1[1]<o2[1]){
                    return  -1;
                }else {
                    return 0;
                }
            }
        });
//       右边界
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon:points) {
            if (balloon[0]>pos){
                pos = balloon[1];
                ++ans;
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[][]  points = new int[][] {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }


}
