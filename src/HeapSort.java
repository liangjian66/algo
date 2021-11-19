
/*堆排序 ：HeapSort    题解： 1. 堆存储结构是个数组  2. 先构建一个大顶堆 3 ， 遍历取大顶堆  取最大值*/

import java.util.Arrays;

public class HeapSort {



    public static  void  downAdjust(int[] array , int parentIndex , int length){
//        temp 保存父节点值 。 用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;

        while (childIndex < length){
            //默认定位到左孩子   如果有右孩子 ，且右孩子大于左孩子的值 ， 则定位右孩子
            if (childIndex+1<length && array[childIndex+1]>array[childIndex]){
                childIndex++;
            }
            // 如果 父节点小于任何一个孩子的值 ， 则直接跳出
            if (temp >=  array[childIndex]) break;
            // 无须真正交换 ， 单向赋值即可
            array[parentIndex] = array [childIndex];
            parentIndex = childIndex;
            childIndex = 2* childIndex +1 ;
        }
        array[parentIndex]  = temp;
    }


    public  static  void heapSort(int[] array){
        // 1. 把无序 数组构建成最大堆
        for (int i = array.length/2; i>=0 ; i--) {
            downAdjust(array , i, array.length-1);

        }
//        System.out.println(Arrays.toString(array));
//        2. 循环删除堆顶 ，移到集合尾部 ，调整堆 产生新的堆顶
        for (int i = array.length-1; i >0 ; i--) {
            // 最后一个元素 和第一个 元素 交换
            int temp  = array[i];
            array[i]  = array[0];
            array[0] = temp;
//            "下沉" 调整最大堆
            downAdjust(array,0,i);

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,2,6,5,7,8,9,10,0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }


}
