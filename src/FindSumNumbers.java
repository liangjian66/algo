import java.util.*;

/*寻找两个数之和: FindSumNumbers 先构建map 然后再遍历*/
public class FindSumNumbers {

     public  static List<List<Integer>>  twoSum(int[] nums , int target){
         Map<Integer ,Integer> map = new HashMap<>();
         List<List<Integer>> resultList = new ArrayList<>();
         for (int i = 0; i < nums.length; i++) {
             map.put(nums[i],i);

         }
         for (int i = 0; i < nums.length; i++) {
             int other = target - nums[i];
             if (map.containsKey(other) && map.get(other)!=i){
                 resultList.add(Arrays.asList(i,map.get(other)));
//                 为防止 找到重复的元素对 ， 匹配后从哈希表删除对应的元素
                 map.remove(nums[i]);
             }
         }
         return  resultList;
     }

    public static void main(String[] args) {
        int[] nums = {5,12,6,3,9,2,1,7};
        List<List<Integer>>  resultList = twoSum(nums,13);
        for (List<Integer> list : resultList){
            System.out.println(Arrays.toString(list.toArray()));
        }

    }


}
