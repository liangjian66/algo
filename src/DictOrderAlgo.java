/*寻找全排列的下一个数子： DictOrderAlgo 1. 从后向前查看逆序区域 ，找到逆序区域的前一位， 也就是数字置换的边界
   2. 让逆序区域的前一位和逆序区域中大于他的最小的数字交换位置
   3. 把原来的逆序区域转为顺序状态
*
* */

import java.util.Arrays;

public class DictOrderAlgo {


    public static  int[] findNearestNumber(int[] numbers){
        //    1. 从后向前查看逆序区域 ， 找到逆序区域的前一位 ，也就是数字置换的边界
        int index = findTransferPoint(numbers);
//        如果数字置换的边界为0 ， 说明整个数组已经逆序 ，无法得到更大的相同数字组成的整数 返回null
        if (index == 0){
            return null;
        }
//        2. 把逆序区域的前一位和逆序区域中刚刚大于他的数字交换位置
//        复制并入参 ， 避免直接修改入参
        int[] numbersCopy = Arrays.copyOf(numbers,numbers.length);
        exchangeHead(numbersCopy,index);
//        3. 把原来的逆序区域转为顺序  相互调换位置

        reverse(numbersCopy,index);
        return  numbersCopy;



    }

    private  static  int[] reverse(int[] num,int index){
        for (int i = index,j= num.length-1; i < j; i++,j--) {
            int temp = num[i];
            num[i]  = num[j];
            num[j] = temp;
        }
        return  num;
    }

    private static int[] exchangeHead(int[] numbers,int index){
//        先记录head 值
        int head = numbers[index-1];
        //head 和 第一个比head 大的值互换
        for (int i = numbers.length-1; i >0 ; i--) {
            if (head< numbers[i]){
                numbers[index-1] = numbers[i];
                numbers[i] = head;
                break;
            }

        }
        return numbers;
    }

    private  static int findTransferPoint(int[] numbers){
        for (int i = numbers.length-1;i>0;i--){
            if (numbers[i] >numbers[i-1]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        打印12345 之后的10个全排列整数
        for (int i = 0; i < 10; i++) {
            numbers = findNearestNumber(numbers);
//            System.out.print(numbers);
            outputNumbers(numbers);

        }
    }

    private  static  void outputNumbers(int[] numbers){
        for (int i:
             numbers) {
            System.out.print(i);

        }
        System.out.println();
    }


}
