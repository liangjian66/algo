import java.util.*;

public class Test {



    public String minWindow (String S, String T) {
        // write code here
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        int len1 = sArr.length;
        int len2 = tArr.length;
        if (len1<len2||len1==0|| len2==0){
            return  "";
        }
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        for (int i = 0; i < len2; i++) {
            Character c = tArr[i];
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        int left = 0;
        int right = -1;
        int res = Integer.MAX_VALUE;
        int left_end =-1;
        int right_end = -1;
        while (right<len1-1){
            right++;
            Character c = sArr[right];
            if (sMap.containsKey(c)){
                sMap.put(c,sMap.getOrDefault(c,0)+1);
            }else {
                sMap.put(c,1);
            }
            while (checkContain(sMap,tMap)&&left<=right){
                     Character leftC = sArr[left];
                     sMap.put(leftC,sMap.getOrDefault(leftC,0)-1);
                     if (right-left+1<res){
                         res = right - left+1;
                         left_end = left;
                         right_end = right;
                     }
                     left++;

            }
        }
        if (right_end<0){
            return  "";
        }
        return S.substring(left_end,right_end+1);
    }

    public  boolean checkContain(HashMap<Character,Integer> sMap , HashMap<Character,Integer> tMap){
       for (Map.Entry<Character,Integer> entry :tMap.entrySet()){
             Character key = entry.getKey();
             Integer value = entry.getValue();
             Integer tMapCount = sMap.getOrDefault(key,0);
             if (value>tMapCount){
                 return  false;
             }
       }
        return  true;
    }

    public static void main(String[] args) {
       String S = "XDOYEZODEYXNZ";
       String T = "XYZ";
       Test test = new Test();
        System.out.println(test.minWindow(S,T));
    }
}

