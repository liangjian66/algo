public class ChangeTwo {

    public int change(int amount, int[] coins) {
        if (amount== 1|| coins.length==0){
            return  1;
        }
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int coin:coins){
            for (int i = coin; i < amount+1; i++) {
                /*组合数  就是累加*/
//                if (i>=coin){
                    dp[i] +=dp[i-coin];

//                }
            }

        }

        return  dp[amount];
    }
}
