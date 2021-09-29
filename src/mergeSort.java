/**归并排序*/

public class mergeSort {
    public  static void mergeSort(int[] arr, int leftPtr,int rightPtr ,int rightBound){
         int mid = rightPtr-1;
         int i = leftPtr;
         int j = rightPtr;
         int k = 0;
//         开辟临时数组 保存数据
         int[] temp = new int[rightBound-leftPtr+1];
         while (i<=mid && j<=rightBound){
             temp[k++] = arr[i]<=arr[j]?arr[i++]:arr[j++];
         }
         // 1. 假设i<=mid 就是上半段有剩余
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=rightBound){
            temp[k++] = arr[j++];
        }
        for (int m = 0; m < temp.length; m++) {
            arr[leftPtr+m] = temp[m];
        }
    }
/*递归相关内容： 终止条件 单层内容*/
    public  static  void sort(int[] arr,int left ,int right){
        // 终止条件
        if (left == right) return ;
//           return   mergeSort(arr);
         //  分成两半
        int mid = left +(right-left)/2;
        //    先确保两个 有序数组 才能merge
        mergeSort(arr,left,mid+1,right);

        // 左边排序
        sort(arr, left, mid);
//        右边排序
        sort(arr,mid+1,right);


    }


    public static void main(String[] args) {
//        removeKdigits("1593212",3);
        int[] arr = new int[] { 1, 4, 7, 8, 3, 6, 9 };
        sort(arr,0,6);
//        int[] tempArr =    sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
