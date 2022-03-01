import java.util.*;
public class Test {




    public static void main(String[] args) {
        Test test = new Test();
        System.out.print(test.test(10));
    }

    public  int  test(int n){
         if (n<=0){
             return  0;

         }
         int[] dp = new int[n+1];
         dp[0] = 0;
         dp[1] = 1;
         dp[2] = 2;
         if (n<=2){
             return  dp[n];
         }
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return  dp[n];
    }




}