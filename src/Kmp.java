
/*KMP算法： Kmp   有的复杂
 *当出现字符串不匹配时，可以记录一部分之前已经匹配的文本内容，利用这些信息避免从头再去做匹配
 *https://leetcode-cn.com/problems/implement-strstr/solution/dai-ma-sui-xiang-lu-kmpsuan-fa-xiang-jie-mfbs/
 */
public class Kmp {
//    KMP算法主体逻辑  str是主串  pattern是模式串
    public  static  int kmp(String str,String pattern){
//        预处理 ，生成next数组
        int[] next = getNexts(pattern);
        int j = 0;
//        主循环 。遍历主字符串
        for (int i = 0; i < str.length(); i++) {
            while ((j>0)&&(str.charAt(i) != pattern.charAt(j))){
//                遇到坏字符时 ， 查询next 数组并改变模式串的起点
                j = next[j];
            }
            if (str.charAt(i) == pattern.charAt(j)){
                j++;
            }
            if (j == pattern.length()){
//                匹配成功 ，返回下标
                return i-pattern.length()+1;
            }
        }
          return  -1;
    }


//    生成next数组
        private  static  int[] getNexts(String pattern){
        int[] next = new int[pattern.length()];
        int j = 0;
//      i: 已经匹配前缀的下一个位置，也就是 代填充的数组下标
//      j: 最长可匹配前缀子串的下一个位置 也就是next数组元素对应的元素值 ：最后一个匹配字符的下标+1   ababa
            for (int i = 2; i < pattern.length(); i++) {
                while ((j !=0 ) &&(pattern.charAt(j) != pattern.charAt(i-1))){
//                    从next[i+1] 的求解回溯到 next[j]
                    j = next[j];

                }
                if (pattern.charAt(j)  == pattern.charAt(i-1)){
                    j++;
                }
                next[i] = j;

            }
           return  next;
        }

    public static void main(String[] args) {
        String str = "ATGTGAGCTGGTGTGTGCFAA";
        String pattern = "GTGTGCF";
        int index = kmp(str,pattern);
        System.out.println(("首次出现位置："+index));
    }
}
