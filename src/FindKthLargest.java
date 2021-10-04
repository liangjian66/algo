public class FindKthLargest {
/*可以维护一个个数为K 小顶堆*/
    public int findKthLargest(int[] nums, int k) {
           return  sort(nums,k);
    }

    private static int  sort(int[]  arr ,int k ){
//        构造K个值的小顶堆
        int length = arr.length;
//        构建小顶堆  数组
        int[] sort = new int[k];
//        初始化小顶堆数组
        for (int l = 0; l < k; l++) {
            sort[l] = arr[l];
        }
//        先构建最初的小顶堆
        for (int t = k/2-1;t >=0 ;t--){
             downAdjust(sort,t,k);
        }

//        依次录入其他元素
        for (int i = k; i <length ; i++) {
//            小顶堆  比堆顶元素不加入
            if (sort[0]>=arr[i]) {
                continue;
            }else {
                //            否则重新排序
                sort[0] = arr[i];
                for (int j = k/2-1; j >=0 ; j--) {
                    downAdjust(sort,j,k);
                }
            }

        }
    return  sort[0];
    }
/*  下沉调整
*   要下沉的父节点
*   堆的有效大小
* */
    public static   void downAdjust(int[]  array ,int parentIndex , int length){
//        temp保存父节点的值 ，用于最后的赋值
        int temp = array[parentIndex];
//        求子节点的下标
        int childIndex = 2*parentIndex +1;
        while (childIndex<length){
//            开始下沉操作  先考虑下沉到左子节点
//            然后再考虑右子节点较小的情况
//            如果父节点小于子节点

//            现在考虑右子节点较小时
            if (childIndex+1<length&&array[childIndex+1]<array[childIndex]){
//                选择右子节点成为下沉目标值
                childIndex++;
            }
            if (temp<=array[childIndex])  break;
//            父节点  和 左子节点交换数值
            array[parentIndex] = array[childIndex];
//            再不断的向下迭代 计算父节点位置
            parentIndex = childIndex;
//            子节点位置
            childIndex = 2*childIndex+1;
//

        }
//        最后找到下沉到哪里 就是坐标 然后赋值
        array[parentIndex] = temp;

    }

    public static void main(String[] args) {
        int[] num1 = new int[]{3,2,3,1,2,4,5,6};
      int kTh =   sort(num1,4);
      System.out.println(kTh);

    }
}
