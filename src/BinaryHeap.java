import java.util.Arrays;

/*二叉堆:BinaryHeap 数学要好 1.  父节点的下标是P 他的左孩子下标就是 2P+1 2P+2   2. 最大堆上浮，跟自己的父节点对比 ， 比父节点大上浮， 不断对比 */
public class BinaryHeap {
    public  static  void upAdjust(int[] array){

        //  1 3 2 10  5 7 8 9 6

        int childIndex = array.length-1; // = 8
        int parentIndex = (childIndex-1)/2;  // = 3
        // temp保存插入的叶子节点值 ，用于最后的赋值
        int temp = array[childIndex];  // 6
        // s
        while (childIndex > 0 && temp < array[parentIndex]){
            // 无须真正交换 ， 单向赋值即可
            array[childIndex] = array[parentIndex];  //  array[childIndex] = array[parentIndex] = 10
            childIndex = parentIndex;  // childIndex = parentIndex = 3
            parentIndex = (parentIndex -1 )/2;  // 1
        }
//          单向赋值  改变了坐标位置   然后再把临时变量赋值给他
        array[childIndex] = temp;

    }
    // 最小堆  做下沉
    public  static  void downAdjust(int[]  array ,int parentIndex , int length){
        //下沉
        // temp 保存父节点的值 ，用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2*parentIndex+1;
        while (childIndex < length){
//             如果有右孩子 ，且右孩子 小于 左孩子的值 则定位到右孩子
            if (childIndex+1<length && array[childIndex+1] < array[childIndex]){
                childIndex++;
            }
            // 如果父节点小于任何一个孩子的值 ， 则直接退出
            if (temp < array[childIndex]) break;
            // 无须真正交换 ， 单向赋值即可
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2* childIndex + 1;

        }
        array[parentIndex]  = temp;
    }

    public static  void  buildHeap(int[] array){
        // 从最后一个非叶子节点开始 ， 依次做下沉操作
        for (int i = (array.length-2)/2; i >=0 ; i--) {
            downAdjust(array , i ,array.length);

        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,6,5,7,8,9,10,0};
        upAdjust(array);
        System.out.print(Arrays.toString(array));

        int[] arrayTwo = new int[] {7,1,3,10,5,2,8,9,6};
        buildHeap(arrayTwo);
        System.out.print(Arrays.toString(arrayTwo));

    }



}
