
/*最长不含重复的子字符串
*  状态定义： 设动态规划列表dp ,dp[j]代表以字符s[j]为结尾的"最长不重复子字符串"的长度
*
* */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDup {



//    状态定义： 设动态规划列表dp ,dp[j]代表以字符s[j]为结尾的"最长不重复子字符串"的长度
//    转移方程：固定右边界j , 设字符s[j]左边距离最近的相同字符s[i] , 即s[i] = s[j]
//    1. 当i<0 即s[j]左边无相同字符 则 dp[j] = dp[j-1]+1;
//    2. dp[j-1] <j-i  说明字符s[i] 在dp[j-1]区间之外 则 dp[j] = dp[j-1]+1;
//    3. dp[j-1] >= j-i 说明字符在dp[j-1]之中 ， 则dp[j]的左边界由s[i]决定  则 dp[j] = j-i ;
    public  int longestSubstringWithoutDup(String s){
        Map<Character,Integer>  dic = new HashMap<Character,Integer>();
        int res = 0 ,tmp = 0;
        for (int j = 0; j < s.length(); j++) {
//            获取索引i
            int i = dic.getOrDefault(s.charAt(j),-1);
//            更新哈希表
            dic.put(s.charAt(j),j);
            tmp = tmp<j-1? tmp+1:j-i;
            res = Math.max(res,tmp);
        }
        return  res;
    }

}
