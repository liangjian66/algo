public class KMPTwo {

    /*KMP算法的整体思路 ：在已匹配的前缀当中寻找到最长可匹配后缀子串和最长可匹配前缀子串 ， 在下一轮直接把两者对齐，从而实现模式串的快速移动
    *我们设置两个变量i 和j
    * i 表示：  已匹配前缀的下一个位置
    * j表示：  最长可匹配前缀子串的下一个位置
    * */
    /*生成next数组*/
    private  static  int[] getNexts(String pattern){
        int[] next = new int[pattern.length()];
        /*那么 next[0] = 0  next[1] = 0*/
        int j = 0;
        for (int i = 2; i <pattern.length(); i++) {

            /*匹配失败 回溯*/
            while (j!=0 && (pattern.charAt(j) != pattern.charAt(i-1))){
                /*从next[i+1] 的求解回溯到next[j]*/
                j = next[j];
            }
            /*这个地方很重要  j  与 i-1 比较 */
            if (pattern.charAt(j) == pattern.charAt(i-1)){
                /*匹配成功 ++*/
                j++;
            }
            next[i] = j;
        }

        return  next;
    }

    public  static  int kmp(String str,String pattern){
        /*预处理 生成next数组*/
        int[] next = getNexts(pattern);
        int j = 0;
        if (pattern.length() == 0){
            return  0;
        }
        /*主循环 遍历主串字符*/
        for (int i = 0; i < str.length(); i++) {
            /*假设匹配失败*/
            while ((j>0)&&(str.charAt(i) != pattern.charAt(j))){
                /*假设没有KMP  暴力求解的话 */
                /*遇到坏字符 ，查询next数组并改变模式串的起点*/
                j = next[j];
            }

            /*先考虑 可以匹配*/
            if (str.charAt(i) == pattern.charAt(j)){
                j++;
            }
            /*匹配成功  abcdd  dd i=5 len = 2 下标 5-2+1 =4 */
            if (j==pattern.length()){
               return  i-pattern.length()+1;
            }
        }
        return  -1;
    }


    public static void main(String[] args) {
//        "mississippi"
//        "issip"
        String txt = "mississippi";
        String pattern = "issip";
        System.out.println(kmp(txt,pattern));
    }


    /*穷举 时间复杂度 整体复杂度为 O((n - m) * m))*/
    public int strStrExhaustion(String ss, String pp) {
        int n = ss.length(), m = pp.length();
        char[] s = ss.toCharArray(), p = pp.toCharArray();
        // 枚举原串的「发起点」
        for (int i = 0; i <= n - m; i++) {
            // 从原串的「发起点」和匹配串的「首位」开始，尝试匹配
            int a = i, b = 0;
            while (b < m && s[a] == p[b]) {
                a++;
                b++;
            }
            // 如果能够完全匹配，返回原串的「发起点」下标
            if (b == m) return i;
        }
        return -1;
    }


}
