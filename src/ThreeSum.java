import java.util.*;

public class ThreeSum {

    /**
     * 三数之和 是基于两数之和的思路写的
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSumWithHashmap(int[] nums) {

        if (nums == null|| nums.length == 0){
            return  new  ArrayList<List<Integer>>();
        }
        Map<Integer , Integer>  hashMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            hashMap.put(nums[i],i);
        }

        HashSet set = new HashSet<List<Integer>>();
        for (int i = 0; i < n; i++) {
            int target = nums[i];
            for (int j = i+1; j < n; j++) {
                int num = -target - nums[j];
                if (hashMap.containsKey(num) && (hashMap.get(num) > j)&&(i<j)&&(hashMap.get(num)>i)){

                    int[] temp = new int[]{target , nums[j],num};
                    Arrays.sort(temp);
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(temp[0]);
                    ans.add(temp[1]);
                    ans.add(temp[2]);
                    set.add(ans);
                }
            }
        }

        return  new ArrayList<List<Integer>>(set);
    }

    /**
     * 排序加双指针
     * 注意事项  答案中不可以包含重复的三元组
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null|| nums.length == 0){
            return  new  ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        /*K 第一个固定位置*/
        int n = nums.length;
        for (int k = 0; k <n-2 ; k++) {
            if (nums[k]>0)  break;
            if (k>0 && nums[k] == nums[k-1])  continue;
            int i = k+1;
            int j = nums.length -1;

            while (i<j){
                int sum = nums[k] + nums[i] + nums[j];
                if (sum<0){
                    while (i<j && nums[i] == nums[++i]);
                }else  if (sum > 0){
                    while ( i<j && nums[j] == nums[--j]);
                }else {
                     res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                     while (i<j&&nums[i] == nums[++i]);
                     while (i<j&&nums[j] == nums[--j]);
                }
            }

        }
        return  res;
    }

}
