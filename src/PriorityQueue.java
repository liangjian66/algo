//
///*优先队列： PriorityQueue   题解：插入进行上浮操作  删除进行：最后一个替换到堆顶 ， 然后进行下沉操作*/
//
//import java.util.Arrays;
//
//public class PriorityQueue {
//    //    不乱 于心  真正静下来学点东西 还是很重要的 不然终将被社会淘汰
//
//    private  int[] array;
//    private  int size;
//    public  PriorityQueue(){
//        // 队列初始长度为32
//        array  = new int[32];
//
//    }
//    private void resize(){
//        //队列容量 扩容 翻倍
//        int newSize = this.size*2;
//        this.array = Arrays.copyOf(this.array,newSize);
//    }
//    /*入队*/
//    public void  enQueue(int key){
////        队列长度超出范围  ， 扩容
//        if (size >= array.length){
//            resize();
//        }
//        array[size++]  = key;
//        upAdjust();
//    }
//
//    public int deQueue() throws Exception{
//        if (size <=0){
//            throw  new Exception("the quene is empty !");
//        }
////         获取堆顶元素
//        int head = array[0];
////        让最后一个元素移动到堆顶
//        array[0] = array[--size];
//        downAdjust();
//        return head;
//    }
//
//
//    /*上浮调整 */
//    private void upAdjust(){
//        int childIndex = size -1;
//        int parentIndex = childIndex/2;
//        // temp保存 插入的叶子节点值 ， 用于最后的赋值
//        int temp = array[childIndex];
//        while (childIndex>0 && temp > array[parentIndex]){
//            // 无须真正的交换  ， 单向赋值即可
//            array[childIndex]  = array[parentIndex];
//            childIndex = parentIndex;   // 改变  childIndex下标
//            parentIndex = parentIndex/2;
//
//        }
//        array[childIndex] = temp;
//    }
//    /*下沉 调整*/
//    private  void  downAdjust() {
//        int parentIndex = 0;
////        temp保存 父节点的值 ， 用于最后的赋值
//        int temp = array[parentIndex];
//        int childIndex = 1;
//        while (childIndex < size){
////            如果 有右孩子 ，且右孩子大于左孩子的值， 则定位到右孩子  目的：  让更大的上浮替代父节点
//            if (childIndex+1 < size && array[childIndex+1] > array[childIndex]){
//                childIndex++;
//            }
//            // 如果父节点 大于 任何一个孩子的值 ， 直接跳出
//            if (temp>=array[childIndex])
//                break;
////            无须真正交换 ， 单向赋值即可
//            array[parentIndex] = array[childIndex];
//            parentIndex  = childIndex;
//            childIndex = 2*childIndex +1;
//
//        }
//           array[parentIndex] = temp;
//    }
//
//    public static void main(String[] args) throws Exception {
//        PriorityQueue priorityQueue  = new PriorityQueue();
//        priorityQueue.enQueue(3);
//        priorityQueue.enQueue(5);
//        priorityQueue.enQueue(10);
//        priorityQueue.enQueue(2);
//        priorityQueue.enQueue(7);
//        System.out.println("出队元素：" + priorityQueue.deQueue());
//        System.out.println("出队元素：" + priorityQueue.deQueue());
//
//
//
//    }
//
//}
