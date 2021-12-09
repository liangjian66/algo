
/*堆排序 ：HeapSort    题解： 1. 堆存储结构是个数组  2. 先构建一个大顶堆 3 ， 遍历取大顶堆  取最大值*/

import java.util.Arrays;
import java.util.List;

public class HeapSort {



    public static  void  downAdjust(int[] array , int parentIndex , int length){
          int large = parentIndex;
          int  leftChild = 2*parentIndex+1;
          int rightChild = 2*parentIndex+2;
          if (leftChild<length&&(array[leftChild]>array[large])){
                large = leftChild;
          }
        if (rightChild<length&&(array[rightChild]>array[large])){
            large = rightChild;
        }
        if (large == parentIndex){
            return;
        }
        if (large != parentIndex){
               swap(array,parentIndex,large);
               downAdjust(array,large,length);
        }
    }

    public static  void  swap(int[] array,int parent,int child){
          int temp = array[parent];
          array[parent] = array[child];
          array[child] = temp;
    }


    public  static  void heapSort(int[] array){
        // 1. 把无序 数组构建成最大堆
//        for (int i = array.length/2; i>=0 ; i--) {
//            downAdjust(array , i, array.length-1);
//
//        }
        // 2*parent+2 = len -1 推导出 parent = (len-3)/2 ;
        for (int i = array.length/2; i>=0 ; i--) {
            downAdjust(array , i, array.length);
        }

//        System.out.println(Arrays.toString(array));
//        2. 循环删除堆顶 ，移到集合尾部 ，调整堆 产生新的堆顶
        for (int i = array.length-1; i >0 ; i--) {
            // 最后一个元素 和第一个 元素 交换
//            int temp  = array[i];
//            array[i]  = array[0];
//            array[0] = temp;
            swap(array,0,i);
//            "下沉" 调整最大堆
            downAdjust(array,0,i);

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {7,1,3,10,5,2,8,9,6};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
