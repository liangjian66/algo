import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.*;


/*字符串的全排列 :有点饶人  有时间再看一下*/
public class StringPermutation {

//    List<String>  res = new LinkedList<>();
//    char[]  c;
//    public  String[] permutation(String s){
//        c = s.toCharArray();
//
//    }
//    核心 思想还是回溯
     private ArrayList<String> ret = new ArrayList<>();

     public  ArrayList<String> permutation(String str){
         if (str.length() == 0){
             return  ret;
         }
         char[] chars = str.toCharArray();
         Arrays.sort(chars);
         backTracking(chars, new boolean[chars.length], new StringBuilder());
         return ret;
     }

    private  void  backTracking(char[] chars,boolean[] hasUsed,StringBuilder s){
//  递归 终止条件  字符串拼接完成
        if (s.length()==chars.length){
            ret.add(s.toString());
            return;
        }
//   长得不好看  就没事多写写代码
        for (int i = 0; i < chars.length; i++) {
            if (hasUsed[i]){
                continue;
            }
            if (i != 0 && chars[i] == chars[i - 1] && !hasUsed[i - 1]) /* 保证不重复 */
                continue;
                hasUsed[i] = true;
            s.append(chars[i]);
            backTracking(chars,hasUsed,s);
            s.deleteCharAt(s.length()-1);
            hasUsed[i] = false;
        }
    }
}


/*根据字符串排列的特点，
考虑深度优先搜索所有排列方案。即通过字符交换，
先固定第 11 位字符（ nn 种情况）、再固定第 22 位字符（ n-1n−1 种情况）、... 、最后固定第 nn 位字符（ 11 种情况）。
*/

class  Permutation{
    List<String>  res = new LinkedList<>();
    char[]  c;

    void  dfs(int x){
        if (x == c.length-1){
//            添加排列方案
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i <c.length; i++) {
//            重复的 因此去除
            if (set.contains(c[i])) continue;
            set.add(c[i]);
//           交换，将C[i]固定到在第x位
            swap(i,x);
//            开始固定第x+1位字符
            dfs(x+1);
//            恢复交换
            swap(i,x);
        }
    }

    void  swap(int a , int b){
        char temp = c[a];
        c[a]= c[b];
        c[b] = temp;
    }
}
