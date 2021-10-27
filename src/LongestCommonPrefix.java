public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length == 0){
            return "";
        }
        int m = strs.length;
        String firstStr = strs[0];
        int n  = firstStr.length();
        int numP =  0;
        for (int i = 0; i < n; i++) {
            char c = firstStr.charAt(i);
            for (int j=1; j < m; j++) {
                if (i == strs[j].length()||strs[j].charAt(i) != c){
                    return  firstStr.substring(0,i);
                }
            }
        }
        return strs[0];
    }

}
