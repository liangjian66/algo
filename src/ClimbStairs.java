public class ClimbStairs {

    public int climbStairs(int n) {
        /*dp[i] = dp[i-1]+dp[i-2]*/

        int p = 0;
        int q = 0;
        int r = 1;
        for (int i= 1; i<=n ; ++i) {
            p = q;
            q = r;
            r = p+q;
        }
        return  r;
    }
}
