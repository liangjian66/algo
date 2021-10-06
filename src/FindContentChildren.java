import java.util.Arrays;

public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChildren = g.length ;
        int numOfCookies = s.length;
        int count = 0;
        for (int i = 0,j=0; i < numOfChildren&& j<numOfCookies; i++,j++) {

            while (j<numOfCookies&&g[i]>s[j]){
                  j++;
            }
                   if (j<numOfCookies){  // 这里假设 每个饼干孩子都能吃的饱
                       count++;
                   }
        }

        return   count;

    }
}
