import java.util.Arrays;
import java.util.LinkedHashSet;

public class Test {

    public static String longestPalindromeCenter(String s) {
        //  中心扩散法
        if(s == null || s.length() == 0){
            return s;
        }
//        int len = s.length();
        int start = 0;
        int end = 0;
        int resLen =0;
        for (int i = 0; i < s.length(); i++) {
            int singleCenter = centerFiffuse(s,i,i);
            int coupleCenter = centerFiffuse(s,i,i+1);
            resLen  = Math.max(singleCenter,coupleCenter);
            if(resLen>end-start){
                start = i - (resLen-1)/2;
                end = i+ resLen/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int centerFiffuse(String s,int left,int right){
        int len = s.length();
        while(left>=0&&right<len&&(s.charAt(left)== s.charAt(right))){
            --left;
            ++right;
        }
        return right-left-1;
    }


    public  static String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        // 求最值 尝试用动态规划
        // 建立数组 i j  i表示起点start j 表示结束点 end
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        // 边界条件 初始化dp
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        int maxLen  = 0;
        // 先遍历长度  再遍历起点
        int start = 0;
        int end = 0;
        for (int l = 2; l <= len; l++) {
            for (var i = 0; i <= len-l; i++) {
                // i+l-1 = j
                // j 结束点
                int   j = i+l-1;
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if(l<=3){
                    if(c1 == c2){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(c1 == c2){
                        dp[i][j] = dp[i+1][j-1];
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]&&l>maxLen){
                    maxLen = l;
                    start = i;
                    end = j;
                }



            }
        }
        return s.substring(start,end+1);

    }


    public static int longestPalindromeSubseq(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int len = s.length();
        //
        int[][] dp = new int[len][len];


        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
//        for(int[] nums:dp){
//            Arrays.fill(nums,1);
//        }
        //  i  起点  j 结束点
        int maxLen = 0;

        for (int l = 1; l <= s.length(); l++) {
            for (int i = 0; i < s.length()-l+1; i++) {
//                j 是结束点
                int  j = i+l-1;
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if(j==0){
                    dp[0][0] = 1;
                }else if(j>0&&i+1<s.length()){
                    if(c1 == c2){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }else{
                        dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                    }
                }else if(i==s.length()-1){
                    dp[i][j] = 1;
                }
                if (i==j){
                    dp[i][j] = 1;
                }

                if(dp[i][j]>maxLen){
                    maxLen = dp[i][j];
                }

            }
        }
        return maxLen;
    }

    public static int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int len = s.length();
        boolean[][]  dp = new boolean[len][len];
        int  res = 0;
        for(int l =1;l<=len;l++){
            for(int i=0;i<=len-l;i++){
                int j = i+l-1;
                if(i ==j){
                    dp[i][j] = true;
                }
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if (l<=3){
                    if(c1 == c2){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else {
                    if(c1 == c2){
                        dp[i][j] = dp[i+1][j-1];
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]){
                    res++;
                }
            }
        }
        return res;
    }

    int row ;
    int col ;
    //  int count = 0;
    public  int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        row = grid.length;
        col = grid[0].length;
        int sum  = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    int count =  countTest(grid,i,j);
                    sum +=count;
                }

            }

        }
        return sum;


    }




    public static void main(String[] args) {
        String temp = "abc";
        LinkedHashSet<Integer>  keyList = new LinkedHashSet<>();
        keyList.iterator().next();

        Test test = new Test();
        int[][] grid = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};


        System.out.println(test.islandPerimeter(grid));

    }
}
