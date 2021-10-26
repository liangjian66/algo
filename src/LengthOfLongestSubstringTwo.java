import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringTwo {

    public static int lengthOfLongestSubstring(String s) {
        /*哈希集合 ，记录每个字符是否出现过*/
        Set<Character>  occ = new HashSet<Character>();
        int n = s.length();
        /*右指针，初始值为-1，相当于在字符串的左侧 ， 还没开始移动*/
        /*rk 右边指针*/
          int rightP = -1;
          int ans = 0;
          /*i 是leftP*/
        for (int i = 0; i < n; i++) {
            if (i!=0){
                /*左指针左移动*/
                occ.remove(s.charAt(i-1));
            }
            /*右指针 右移动*/
            while (rightP+1<n &&(!occ.contains(s.charAt(rightP+1)))){
                occ.add(s.charAt(rightP+1));
                ++rightP;
            }
            ans = Math.max(ans,rightP-i+1);
        }
        return  ans;
    }

    public static void main(String[] args) {
        String temp = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(temp));
    }
}
