import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*快速排序  分而知之    */
public class QuickSort {

    public static void quickSort(int[] arr,int low,int high) {
        int p,i,j,temp;
//递归一定要写 基线条件   退出
        if(low >= high) {
            return;
        }
        //p就是基准数,这里就是每个数组的第一个  prviot
        p = arr[low];
        i = low;
        j = high;
        while(i < j) {
            //右边当发现小于p的值时停止循环
            while(arr[j] >= p && i <j) {
                j--;
            }
            arr[i] = arr[j];

            //这里一定是右边开始，上下这两个循环不能调换（下面有解析，可以先想想）

            //左边当发现大于p的值时停止循环
            while(arr[i] <= p && i <j) {
                i++;
            }
            arr[j] = arr[i];

            /*两种思路*/
        }
//        arr[low] = arr[i];//这里的arr[i]一定是停小于p的，经过i、j交换后i处的值一定是小于p的(j先走)
        arr[i] = p;
        quickSort(arr,low,i-1);  //对左边快排
        quickSort(arr,i+1,high); //对右边快排

    }

    public boolean isSameAfterReversals(int num) {
          if (num == 0){
              return  true;
          }
          String str = String.valueOf(num);
          int len = str.length();
          char c = str.charAt(len-1);
          if (c == '0'){
              return  false;
          }
          return  true;
    }


    /**
     * 输入：arr = [2,1,3,1,2,3,3]
     * 输出：[4,2,7,2,4,4,5]
     * 解释：
     * - 下标 0 ：另一个 2 在下标 4 ，|0 - 4| = 4
     * - 下标 1 ：另一个 1 在下标 3 ，|1 - 3| = 2
     * - 下标 2 ：另两个 3 在下标 5 和 6 ，|2 - 5| + |2 - 6| = 7
     * - 下标 3 ：另一个 1 在下标 1 ，|3 - 1| = 2
     * - 下标 4 ：另一个 2 在下标 0 ，|4 - 0| = 4
     * - 下标 5 ：另两个 3 在下标 2 和 6 ，|5 - 2| + |5 - 6| = 4
     * - 下标 6 ：另两个 3 在下标 2 和 5 ，|6 - 2| + |6 - 5| = 5
     * @param arr
     * @return
     */
    public long[] getDistances(int[] arr) {
              int len = arr.length;
              if (arr == null || len ==0){
                  return  new long[0];
              }
        HashMap<Integer, List<Integer>>  map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            if (map.containsKey(num)){
                List<Integer> index = map.get(num);
                index.add(i);
                map.put(num,index);
            }else {
                List<Integer> index = new ArrayList<>();
                index.add(i);
                map.put(num,index);
            }
        }
        long[] res = new long[len];
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            List<Integer> indexList = map.get(num);
            if (indexList.size() == 1) {
                res[i] = 0;
            }else {
                int ans = 0;
                for (int j = 0; j < indexList.size(); j++) {
                    int index = indexList.get(j);
                    ans+= Math.abs(i-index);
                }
                res[i] = ans;
            }
        }
        return  res;
    }

    public long[] getDistances1(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], t -> new ArrayList<>()).add(i);
        }
        long[] result = new long[arr.length];
        for (ArrayList<Integer> list : map.values()) {
            for (int i : list) {
                result[list.get(0)] += i - list.get(0);
            }
            for (int i = 1; i < list.size(); i++) {
                result[list.get(i)] = result[list.get(i - 1)] + (2 * i - list.size()) * (list.get(i) - list.get(i - 1));
            }
        }
        return result;
    }


    public void  dfsOfExecute(int n,int row,int col,char ch){

    }


    public int[] recoverArray(int[] nums) {
          int len = nums.length;
          int n = len/2;
        Arrays.sort(nums);
        int[] res = new int[n];
        for (int i = 0; i <n ; i++) {
            int right = i+n;
            int mid = (nums[i] + nums[right])/2;
            res[i] = mid;
        }
        return  res;
    }


    public static void main(String[] args) {

//        removeKdigits("1593212",3);
//         知名应用  知名公司  镀金
        int[] arr = new int[] {9,4,6,8,3,10,6,6,6,6,7,22,11,2333,3333,4,53,90};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n");
            System.out.print(arr[i]);
        }
    }

    // 乐视超级电视  出现新的情况


}
