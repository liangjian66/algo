/*计数排序*/

import java.util.HashMap;

public class CountSort {


    public static  int[] countSort(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }

        }
        // 根据数列的最大值确定统计数组的长度
        int[] countArray = new int[max+1];
        // 遍历数列 ， 填充统计数组f
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }

        // 遍历统计数组 ， 输出结果
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < countArray.length; i++)
        {
            // countArray 是几就添加几次
            for (int j = 0; j < countArray[i]; j++)
            {
                sortedArray[index++] = i;
            }
        }
        return  sortedArray;

    }

    public static void main(String[] args) {

//        removeKdigits("1593212",3);
        int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
        int[] newArr =  countSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]);
        }
    }
}
