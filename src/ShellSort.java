/*希尔排序: 先分组 再使用插入排序 ，再缩小间隔d*/

import java.util.Arrays;

public class ShellSort {

    public static  void  shellSort(int[] array){
        int d = array.length;
        while (d>1){
            // 使用希尔增量的方式 ， 即每次折半
            d = d/2;
            for (int x = 0; x < d; x++) {   // 先分组  分成每组排序
                for (int i = x+d; i <array.length  ; i = i+d) {
                    int temp = array[i];
                    int j ;
                    for ( j = i-d; (j>=0)&&(array[j]>temp) ; j = j-d) {
                        array[j+d] = array[j];
                    }
                    array[j+d]  = temp;

                }


            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12,1,3,46,50,-3,12,35,16};
        shellSort(array);
        System.out.print(Arrays.toString(array));
    }
}
