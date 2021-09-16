/*删除K个数字的最小值： RemoveKDigits 题解： 简化问题：如果只删除一个数字 ，如何让新整数的值最小 找出降序数字删除 */


/* 删除整数的K个数字 ，获得删除后的最小值
* */
public class RemoveKDigits {

      public  static  String removeKDigits(String num,int k) {

          String numNew = num;
          for (int i = 0; i < k; i++) {
              boolean hasCut = false;
//              先考虑 只有K = 1 的情况
//              从左向右遍历 ，找到比自己右侧数字大的数字并删除
              for (int j = 0; j < numNew.length() - 1; j++) {
                      if (numNew.charAt(j) > numNew.charAt((j + 1))) {
                          numNew = numNew.substring(0, j) + numNew.substring(j + 1, numNew.length());
                          hasCut = true;
                          break;
                      }
              }
              //  如果没有找到要删除的数字 ， 则删除最后的数字
              if (!hasCut) {
                  numNew = numNew.substring(0, numNew.length() - 1);

              }
//                  清除整数左侧的数字0
              numNew = removeZero(numNew);
//              如果整数的所有数字都被删除了 ， 直接返回0
              if (numNew.length() == 0) {
                  return "0";
              }
          }

          return numNew;
      }

    /*左侧 第一个数字是0的话  删除左侧数字*/

    private static String removeZero(String num) {
        for (int i = 0; i < num.length()-1; i++) {
            if (num.charAt(0) != '0'){
                break;
            }
            num = num.substring(1,num.length());
        }
        return num;

    }

    public static void main(String[] args) {
        System.out.println(removeKDigits("1593212",1));
//        System.out.println(removeKDigits("30200",1));
//        System.out.println(removeKDigits("10",2));
//        System.out.println(removeKDigits("541270936",3));
    }
}
