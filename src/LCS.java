public class LCS {

//    public static String LCS (String str1, String str2) {
//
//        if (str1 == null || str2 ==null|| str1.equals("")||str2.equals("")){
//            return  "";
//        }
//        char[] chs1 = str1.toCharArray();
//        char[] chs2 = str2.toCharArray();
//        int[][] dp = getdp(chs1,chs2);
//        int end = 0;
//        int max = 0;
//        for (int i = 0; i < chs1.length; i++) {
//            for (int j = 0; j < chs2.length; j++) {
//                if (dp[i][j]>max){
//                    end = i;
//                    max = dp[i][j];
//                }
//            }
//        }
//        return  str1.substring(end-max+1,end+1);
//    }
//
//    public static int[][] getdp(char[] str1,char[] str2){
//        int m = str1.length;
//        int n = str2.length;
//        int[][] dp = new int[m][n];
//          /*先考虑 边界条件*/
//           /*动态规划递推公式*/
//           /*dp数组取出结果*/
//
//        for (int i = 0; i < str1.length; i++) {
//            if (str1[i] == str2[0]){
//                dp[i][0]  = 1;
//            }
//        }
//
//        for (int j = 1; j < str2.length; j++) {
//            if (str1[0] == str2[j]){
//                dp[0][j] = 1;
//            }
//        }
//        /*str1[i] 不等于 str2[j]时， str1[i] str2[j] 说明在必须把str[i] 和str[j] 当坐公共子串最后一个字符是不可能的  ， 领 dp[i][j] = 0 */
//        for (int i = 1; i < str1.length; i++) {
//            for (int j = 1; j < str2.length; j++) {
//                if (str1[i] == str2[j]){
//                    dp[i][j] = dp[i-1][j-1]+1;
//                }
//            }
//        }
//        return  dp;
//    }

    public static void main(String[] args) {
        String str1 = "1AB2345CD";
        String str2 = "12345EF";
        System.out.println(LCS(str1,str2));

    }

    public  static String LCS (String str1, String str2) {
        if(str1==null||str2==null||str1.equals("")||str2.equals("")){
            return "";
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int[][] dp = getdp(arr1,arr2);
        int max = 0;
        int end = 0;
        int m = arr1.length;
        int n = arr2.length;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
//                 找到最大值  更新 max end
                if(dp[i][j]>max){
                    end = i;
                    max = dp[i][j];
                }
            }
        }

        return str1.substring(end-max+1,end+1);
        // write code here
    }

    public static int[][] getdp(char[] arr1,char[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++){
            if(arr1[i] == arr2[0]){
                dp[i][0] = 1;
            }
        }
        for(int j = 1;j<n;j++){
            if(arr1[0] == arr2[j]){
                dp[0][j] = 1;
            }
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(arr1[i] == arr2[j]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp;
    }
}
