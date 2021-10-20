import java.util.HashMap;
import java.util.Map;

public class MinEditCost {


    /**
     * min edit cost
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @param ic int整型 insert cost
     * @param dc int整型 delete cost
     * @param rc int整型 replace cost
     * @return int整型
     */
    public static int minEditCost (String str1, String str2, int ic, int dc, int rc) {
        // write code here

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int row  = arr1.length;
//        str1编辑成str2
        int col  =  arr2.length;
        int[][] dp = new int[row+1][col+1];
        dp[0][0] = 0;
        for (int i = 1; i < row+1; i++) {
            dp[i][0] = dc*i;
        }

        for (int j = 1; j < col+1; j++) {
            dp[0][j] = ic*j;
        }
        for (int i = 1; i <row+1 ; i++) {
            char c1 = arr1[i-1];
            for (int j = 1; j < col+1; j++) {
                char c2 = arr2[j-1];
                if (c1 == c2){
                    dp[i][j] = dp[i-1][j-1];
                }else {
//                    /*最后一位不相同 只需要一个替换就可以了替换*/
                    dp[i][j] = dp[i-1][j-1] + rc;
//                    /*最后一位插入 */
//                    dp[i][j] = dp[i-1][j] + ic;
//                    /*最后一位删除*/
//                    dp[i][j] = dp[i-1][j] + dc;
//                    dp[i][j] = Math.min(Math.min(dp[i][j-1] + rc,dp[i-1][j] + ic),dp[i-1][j] + dc);
                }
                /*0 到i-1 与 0 j-2 相同 要想 0到i-1 与 0 到 j-1相同 那么str1 插入即可*/
                dp[i][j] = Math.min(dp[i][j],dp[i][j-1] + ic);
                dp[i][j] = Math.min(dp[i][j],dp[i-1][j] + dc);

            }

        }
        return  dp[row][col];
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "adc";
        System.out.println(minEditCost(s1,s2,5,3,2));
    }


//    Map<Integer,Node> map  = new HashMap<Integer,Node>();
//    public LRUCache(int capacity) {
//
//    }



}
