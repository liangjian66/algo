public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        if (s ==  null){
            return false;
        }
        char[] chars = s.toCharArray();
//        先考虑不删字符的情况
        int i = 0;
        int j = chars.length-1;

     boolean isFirst = true;
        while (i<=j){
            if (chars[i] != chars[j]){

              return validPalindrome(s,i+1,j)|| validPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
      return true;

    }

    public boolean validPalindrome(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }



}
