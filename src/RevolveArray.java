
/*旋转数组的最小数字: 二分查找  双指针*/

public class RevolveArray {



    public  int minArray(int[] numbers){
        int low = 0;   // 左指针
        int high = numbers.length - 1;     //  右指针
        while (low<high){
            int pivot = low+ (high-low)/2;
            if (numbers[pivot] <numbers[high]){
                high = pivot;   //    忽略二分查找区间的右半部分
            }else if (numbers[pivot] > numbers[high]){
                 low = pivot+1;  // 忽略二分查找区间的左半部分
            }else {
                high-=1;
            }
        }
        return numbers[low];
    }
}
