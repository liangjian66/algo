/*数组中的第k个最大元素：KthlargestNumber   题解： 1. 把数组的前K个元素构建成最小堆 2.下沉操作保持堆的有效性 */

public class KthlargestNumber {


    public  static int findKthLargestNumber(int[] array,int k ){
//        1.用前K 个元素构建最小堆
        buildHeap(array, k);

//        2. 继续遍历数组 ，和堆顶比较
        for (int i = k; i < array.length; i++) {
            if (array[i] >array[0]){
                array[0] = array[i];
                downAdjust(array,0,k);
            }

        }
//        3. 返回堆顶元素
        return  array[0];
    }

    /*构建一个最小堆*/
    private static  void  buildHeap(int[] array ,int length){
//        从最后一个非叶子节点，依次下沉调整
        for (int i = (length -2 )/2; i >= 0; i--) {
            downAdjust(array,i,length);

        }

    }

    /*下沉操作*/
    private static  void downAdjust(int[] array ,int index ,int length){
//        temp保存父节点的值， 用于最后的赋值
        int temp = array[index];
        // 子节点下标 位置
        int childIndex = (2*index) + 1;
        while (childIndex < length){
//            如果有右孩子 ，且右孩子小于左孩子的值 ，则定位到右孩子
            if ((childIndex+1) < length && (array[childIndex+1] < array[childIndex])){
                childIndex++;
            }
//            如果父节点的值 小于任何一个孩子的值 ， 直接跳出
            if (temp<array[childIndex]){
                break;
            }
            // 无须真正的交换 ， 单向赋值即可
            array[index] = array[childIndex];
            index = childIndex;
            childIndex = (2* childIndex) +1;
        }
        array[index] = temp;
    }


    public static void main(String[] args) {
        int[] array = new int[] {7,5,15,3,17,2,20,24,1,9,12,8};
        System.out.println(findKthLargestNumber(array,5));
    }
}
