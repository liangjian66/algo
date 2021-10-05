import java.util.*;
import java.util.PriorityQueue;


/*出现频率最高的K个元素*/
public class TopKFrequent {

    public List<Integer> topKFrequent(int[] nums,int k){
//          使用字典 ，统计每个元素出现的次数，元素为key    元素出现的次数为值
        HashMap<Integer ,Integer>  map = new HashMap<Integer,Integer>();
        for (int num: nums){
              if (map.containsKey(num)){
                  map.put(num, map.get(num) + 1);
//                  map.getOrDefault()
              }else {
                  map.put(num,1);
              }
        }

// 遍历map，用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });

       for (Integer key: map.keySet()){

           if (pq.size()<k){
                 pq.add(key);
           }else if (map.get(key)>map.get(pq.peek())){
                   pq.remove();
                   pq.add(key);
           }

       }
//       去除小顶堆 里面的元素
        List<Integer> res = new ArrayList<Integer>();
        while (!pq.isEmpty()){
            res.add(pq.remove());
        }
           return  res;
    }
}
