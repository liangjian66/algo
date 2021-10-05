import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {


    public static   String frequencySort(String s){
        Map<Character ,Integer> map = new HashMap<Character,Integer>();
        int maxFreq = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int frequency = map.getOrDefault(c, 0) + 1;
            map.put(c, frequency);
            maxFreq = Math.max(maxFreq, frequency);
        }
// 根据出现频率 建立桶
        StringBuffer[] buckets = new StringBuffer[maxFreq+1];

        for (int i = 0; i <= maxFreq; i++) {
            buckets[i] = new StringBuffer();
        }
//        根据出现频率 放进桶里
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int frequency  =entry.getValue();
            buckets[frequency].append(c);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = maxFreq; i > 0; i--) {
            StringBuffer bucket = buckets[i];
            int size = bucket.length();
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < i; k++) {
                    sb.append(bucket.charAt(j));
                }
            }
        }
        return  sb.toString();
    }

    public static void main(String[] args) {
      String temp =   frequencySort("tree");
      System.out.println(temp);
    }
}
