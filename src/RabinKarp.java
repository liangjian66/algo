
/*字符串匹配算法（RK算法）：RabinKarp 题解： 比较两个字符串的hash */
public class RabinKarp {

        public  static  int rabinkarp(String str,String pattern){



//            主串长度
            int m = str.length();
//           模式串的长度
            int n = pattern.length();
//            安全判断
            if (m<n){
                return -1;
            }
//            计算模式串的hash值
            int patternCode = hash(pattern);
//            计算主传串当中第一个和模式串的局部hash值比较
            int strCode = hash(str.substring(0,n));

//            如果匹配 。则进行精确比较 ， 如果不匹配，计算珠串中相邻子串的hash值
            for (int i = 0; i < (m-n+1); i++) {
                    if ((strCode == patternCode) && compareString(i,str,pattern)){
                        return i;
                }

//       如果不是最后一轮 ，更新主串从i到i+n的hash值
                  if (i<(m-n)){
                       strCode = nextHash(str,strCode,i,n);
                }

            }
            return  -1;
        }

        private static  int nextHash(String str,int hash,int index,int n){
            hash -= (str.charAt(index) - 'a');
            hash += (str.charAt(index+n)-'a');
            return hash;

        }

        private  static  int hash(String str){
            int hashcode = 0;
//            这里采用最简单的hashcode 计算方式
//            把a当做1 把b当做2  把c当做3 。。。然后按位相加
            for (int i = 0; i < str.length(); i++) {
                hashcode+=(str.charAt(i)-'a');
            }
            return  hashcode;
        }

        private  static  boolean compareString(int i, String str ,String pattern){
            String strSub  = str.substring(i,i+pattern.length());
            return  strSub.equals(pattern);
        }

    public static void main(String[] args) {
        String str = "aacdesadsdfer";
        String pattern = "adsd";
        System.out.println("第一次出现的位置：" + rabinkarp(str,pattern));
    }




}
