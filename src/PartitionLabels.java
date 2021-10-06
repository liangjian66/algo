import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer>   partitionLabels(String s){
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i)-'a'] = i;
        }

        int start = 0;
        int end = 0 ;
        List<Integer> partition = new ArrayList<Integer>();

        for (int i = 0; i < s.length(); i++) {
            /*先找到最长的下标*/
            end = Math.max(end,last[s.charAt(i)-'a']);

            if (end == i){
                partition.add(end-start+1);
                start = end+1;
            }

        }

        return partition;
    }
}
