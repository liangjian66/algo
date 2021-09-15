
/*快速排序  分而知之    */
public class QuickSort {

    public static void quickSort(int[] arr,int low,int high) {
        int p,i,j,temp;
//递归一定要写 基线条件   退出
        if(low >= high) {
            return;
        }
        //p就是基准数,这里就是每个数组的第一个  prviot
        p = arr[low];
        i = low;
        j = high;
        while(i < j) {
            //右边当发现小于p的值时停止循环
            while(arr[j] >= p && i <j) {
                j--;
            }
            arr[i] = arr[j];

            //这里一定是右边开始，上下这两个循环不能调换（下面有解析，可以先想想）

            //左边当发现大于p的值时停止循环
            while(arr[i] <= p && i <j) {
                i++;
            }
            arr[j] = arr[i];

            /*两种思路*/
        }
//        arr[low] = arr[i];//这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
        arr[i] = p;
        quickSort(arr,low,i-1);  //对左边快排
        quickSort(arr,i+1,high); //对右边快排

    }

    public static void main(String[] args) {

//        removeKdigits("1593212",3);
        int[] arr = new int[] {9,4,6,8,3,10,6,6,6,6,7,22,11,2333,3333,4,53,90};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n");
            System.out.print(arr[i]);
        }
    }


}
