
import java.util.*;

// 对人生欲望的挑战  抓住机会

// 人生 那种挑战的欲望

public class Test {
    public int[] MySort (int[] arr) {
        // write code here
        quick(arr,0,arr.length-1);
        return  arr;

    }

    public void  quick(int[] nums,int i,int j){
        if (i>j){
            return;
        }
        int left = i;
        int right = j ;
        int pviot = nums[left];
        while (left<right){
            while (left<right&&nums[right]>pviot) right--;
            nums[left] = nums[right];
            while (left<right&&nums[left]<=pviot)left++;
            nums[right] = nums[left];
        }
        int mid = left;
        nums[mid] = pviot;
        quick(nums,i,mid-1);
        quick(nums,mid+1,j);
    }



    public static void main(String[] args) {
       String s = " 3/2 ";
        int[] res = new int[]{4,-2,-3,4,1};
        Test test = new Test();
//      System.out.println(test.calculate(s));
    }

}








