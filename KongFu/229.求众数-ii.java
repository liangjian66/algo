/*
 * @lc app=leetcode.cn id=229 lang=java
 *
 * [229] 求众数 II
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int len = nums.length;
        if(len == 0){
            return res;
        }
        HashMap<Integer,Integer>  map = new HashMap<Integer,Integer>();

        for(int i =0;i<len;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>len/3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
// @lc code=end

