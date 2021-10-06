public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s==""||s==null||t==""||t==null){
            return  false;
        }

        char[] sArr =  s.toCharArray();
        if (sArr.length==0){
            return true;
        }
        char[] tArr =  t.toCharArray();
        if (tArr.length==0){
            return false;
        }
        int i = 0;
        for (int j = 0; j < tArr.length&&i<sArr.length; j++) {

               if (sArr[i] == tArr[j]){
                   i++;
               }
        }
        if (i==sArr.length){
            return  true;
        }
        return  false;

    }
}
