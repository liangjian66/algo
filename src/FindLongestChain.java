import java.util.Arrays;

public class FindLongestChain {

    public int findLongestChain(int[][] pairs) {

        /*最长数对链


        * 根据数对的第一个数排序所有的数对，dp[i] 存储以 pairs[i] 结尾的最长链的长度。
        * 当 i < j 且 pairs[i][1] < pairs[j][0] 时，扩展数对链，
        * 更新 dp[j] = max(dp[j], dp[i] + 1)。


        * */
        if (pairs == null){
            return 0;
        }
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for (int j =1 ;j<n;++j){
            for (int i = 0; i < j; i++) {
                if (pairs[i][1]<pairs[j][0]){
                    dp[j] = Math.max(dp[j],dp[i]+1);
                }

            }
        }

        return dp[n-1];

    }
}
