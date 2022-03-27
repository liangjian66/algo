import java.util.*;

public class Test {
    public static void main(String[] args) {
       Test test = new Test();
        System.out.print("测试提交1111");
        System.out.print("测试提交22222");



    }

    public List<Integer> findAnagrams(String s, String p) {
           int sLen = s.length();
           int pLen = p.length();
        List<Integer> ans = new ArrayList<>();
        if (sLen <pLen){
             return  ans;
            }
           int[] sCount = new int[26];
           int[] pCount = new int[26];

        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i)-'a'];
            ++pCount[p.charAt(i)-'a'];
        }
        if (Arrays.equals(sCount,pCount)){
            ans.add(0);
        }
        for (int i = 0; i < sLen-pLen; i++) {
            --sCount[s.charAt(i)-'a'];
            ++sCount[s.charAt(i+pLen)-'a'];
            if (Arrays.equals(sCount,pCount)){
                ans.add(i+1);
            }
        }
        return  ans;
    }

    public int lengthOfLongestSubstring(String s) {
       char[] arr = s.toCharArray();
       int len = arr.length;
       int right = -1;
       int ans = 0;
       // i是起点
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (i!=0){
                set.remove(arr[i-1]);
            }
            while (right+1<len && !set.contains(arr[right+1]) ){
                set.add(arr[right+1]);
                right++;
            }
            ans = Math.max(ans,right-i+1);
        }
        return ans;
    }


    public String longestPalindrome(String s) {
          int len = s.length();
          if (len<2)  return  s;
          int maxLen = 1;
          int begin  = 0;
          boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        for (int l = 0; l <=len; l++) {

            for (int i = 0; i < len; i++) {
                int j  = l+i-1;
                if (j>=len){
                    break;
                }
                if (charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                    if (j-i<3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return  s.substring(begin,begin+maxLen);
    }
    public  boolean isPalindrome(String s){
        int len = s.length();
        if (len<2) return  true;
        int left = 0;
        int right = len-1;
        while (left<=right){
            if (s.charAt(left)!=s.charAt(right)){
                return  false;
            }
            left++;
            right++;
        }
        return  true;
    }
}