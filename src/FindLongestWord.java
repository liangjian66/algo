import java.util.List;

public class FindLongestWord {

/*  i指针指向字典里的字符串
*   j指针指向s字符串里的字符
*   i指针与j指针的数 相同 i++ ,j++ 匹配下一个字符
*   不相同 j++ 再匹配下一个字符
*   当i等于字符长度 说明匹配成功
* */
    public  String findLongestWord(String s, List<String>dictionary){
        String res = "";

//        遍历字典
        for (String t:dictionary){
            int i = 0 ;
            int j = 0;
            while (i<t.length()&& j<s.length()){
                if (t.charAt(i) == s.charAt(j)){
                    ++i;
                }
                ++j;
            }
            if (i == t.length()){
                if (t.length()>res.length()||(t.length() == res.length()&&t.compareTo(res)<0)){
                    res = t;
                }
            }
        }
        return  res;
    }
}
