import java.util.Arrays;


/*插入排序*/

public class InsertSort {
    public  static  void insertSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int j = i-1;
            // 每次碰到元素小的值  就往后面挪动一位
            for (; (j>=0)&&(insertValue<array[j]);j--) {
                array[j+1] = array[j];

            }
            // insertValue的值插入适当的位置
            array[j+1] = insertValue;

        }
    }
    public static void main(String[] args) {
        int[] array = {12,1,3,46,50,-3,12,35,16};
        insertSort(array);
        System.out.print(Arrays.toString(array));
    }
}
