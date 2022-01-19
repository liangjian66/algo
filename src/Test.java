
import java.util.*;

// 对人生欲望的挑战  抓住机会

// 人生 那种挑战的欲望

public class Test {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int len = nums.length;
      if (nums == null || len == 0){
          return true;
      }
      HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (map.containsKey(num)){
                List<Integer> list = map.get(num);
                list.add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num,list);
            }
        }
        for (List<Integer> list: map.values()){
              int size = list.size();
            for (int i = 0; i+1 < size; i++) {
                if (Math.abs(list.get(i+1)-list.get(i))<=k){
                    return  true;
                }
            }
        }

        return  false;
    }




    public int trap(int[] height) {
         int len = height.length;
         if (height == null || len == 0){
             return  0;
         }
         int ans = 0;
         Stack<Integer> stack = new Stack<>();
         // 单调递减栈
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()&& height[i]>height[stack.peek()]){
                int cur = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int width = i-left-1;
                int h = Math.min(height[left],height[i])-height[cur];
                ans+=width*h;
            }
            stack.push(i);
        }
         return  ans;
    }


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








