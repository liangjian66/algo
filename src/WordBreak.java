import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null){
            return  false;
        }
        Set<String>  wordDictSet = new HashSet<String>(wordDict);
        int n = s.length();
        boolean[]  dp = new boolean[n+1];
        dp[0]  = true;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j]&&wordDictSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }

            }
        }

         return  dp[n];
    }
}
