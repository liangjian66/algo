public class TranslateNum {

    public int translateNum(int num) {
        String numStr  = String.valueOf(num);
        char[] arr = numStr.toCharArray();
        int m = arr.length;
        if (m<2){
            return  m;
        }
        int[] dp = new int[m];
        dp[0] = 1;
        for (int i = 1; i <m ; i++) {
            dp[i] = dp[i-1];
            if ((arr[i-1]-'0')*10+(arr[i] - '0')<26 &&(arr[i-1]-'0'>0)){
                if (i>=2){
                    dp[i] += dp[i-2];
                }else {
                    dp[i] += 1;
                }
            }

        }
        return  dp[m-1];
    }

}
