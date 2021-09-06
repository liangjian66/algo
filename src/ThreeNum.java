

/*三数之和:ThreeNum 主要思路： 1.先排序 2.遍历每一个元素 3. 使用双指针*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNum {
    public static List<List<Integer>>threeNumsV2(int[] nums , int target){
//        Arrays.stream(nums).sorted();

        List<List<Integer>>  resultList = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int d = target - nums[i];
            //j和K 双指针 循环定位，j在左端 ， K 在右端
            for (int j = i+1,k=nums.length-1; j <nums.length ; j++) {
                //K  指针向左移动    什么时候K 右移
                while(j<k && (nums[j]+nums[k])>d){
                    k--;
                }
                if (j==k){
                    break;
                }
                if (nums[j]+nums[k] == d){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    resultList.add(list);
                }
            }
        }
        return  resultList;
    }

    public static void main(String[] args) {
//        List<Integer>  nums = Arrays.asList(5,12,6,3,9,2,1,7);
        int[] intArr;
        intArr = new int[]{5,12,6,3,9,2,1,7};

        List<List<Integer>> arr =   threeNumsV2(intArr,13);
        System.out.print(arr);
    }
}
