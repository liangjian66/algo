
/*冒泡算法*/

public class BubbleSort {

    public  static  void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {  // 外部循环
            boolean isSorted = true;
            for (int j = 0; j < arr.length-i-1; j++) {

                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
        }
    }

    public static void main(String[] args) {

//        removeKdigits("1593212",3);
        int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }




}
