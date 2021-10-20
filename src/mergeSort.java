/**归并排序*/

public class mergeSort {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort (int[] arr) {
//         return  quickSort(arr,0,arr.length-1);
        sort(arr,0,arr.length-1);
        // write code here
        return arr;
    }

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
        // 左边排序
        sort(arr, left, mid);
//        右边排序
        sort(arr,mid+1,right);
        //    先确保两个 有序数组 才能merge
        mergeSort(arr,left,mid+1,right);

    }


    public static void main(String[] args) {
//        removeKdigits("1593212",3);
//        int[] arr = new int[] { 1, 4, 7, 8, 3, 6, 9 };
//        sort(arr,0,6);
////        int[] tempArr =    sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
     int[] a = new int[]{1};
        int[] b = new int[]{2};

        mergeTwo(a,1,b,1);

    }


    public  static  void mergeTwo(int A[], int m, int B[], int n) {
        if(m==0){
            for(int i = 0;i<n;i++){
                A[i] = B[i];
            }
            return ;
        }
        if(n==0){

            return ;
        }
        int[]  res = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while((i<m)&&(j<n)){
            if(A[i]<=B[j]){
                res[k++] = A[i++];
            }else{
                res[k++] = B[j++];
            }
        }
        while(i<m){
            res[k++] = A[i++];
        }
        while(j<n){
            res[k++] = B[j++];
        }

        for(int x=0;x<m+n;x++){
            A[x] = res[x];
        }

    }

}
