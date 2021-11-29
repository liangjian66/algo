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

//   abcabc
    public int solve (String a) {
        // write code here
        if (a == null|| a == ""|| a.length()==0){
            return  0;
        }
        char[] arrC = a.toCharArray();
        int len = arrC.length;
        int maxLen = 0;
        for (int i = 0; i <=len; i+=2) {
            for (int left = 0; left <= len-i; left++) {
                  int right = left + i-1;
                  if (isMaxString(arrC,left,i)){
                      maxLen = Math.max(maxLen,i);
                  }
            }
        }
        return  maxLen;
    }


    public  boolean isMaxString(char[] arrC,int left,int len){
           int rightEnd = left+len/2;
        for (int i = left; i < rightEnd; i++) {
              int right = i+len/2;
            char leftC = arrC[i];
            char rightC = arrC[right];
            if (leftC != rightC){
                return  false;
            }
        }
        return  true;
    }


    public double maxProduct(double[] arr) {
             int len = arr.length;
             if (arr == null || len == 0){
                 return  (double) 0.0;
             }
             double[] maxDp = new double[len];
             double[] minDp  = new double[len];
             System.arraycopy(arr,0,maxDp,0,len);
              System.arraycopy(arr,0,minDp,0,len);

        for (int i = 1; i < len; i++) {
                double num = arr[i];
                maxDp[i] = Math.max(maxDp[i-1]*num,Math.max(num,minDp[i-1]*num));
                minDp[i] = Math.min(minDp[i-1]*num,Math.min(num,maxDp[i-1]*num));
        }
        double  maxProduct = maxDp[0];
        for (int i = 1; i < len; i++) {
            maxProduct = Math.max(maxProduct,maxDp[i]);
        }
        return  maxProduct;
    }



    public static void main(String[] args) {
       String S = "XDOYEZODEYXNZ";
       String T = "XYZ";
       Test test = new Test();

//       [1,2,3,3,3,3,4,5],3
       int[] matrix = new int[]{2,3};
//        System.out.println(test.combinationSum2(matrix,5));
    }


    /**
     * 输入：
     * [2,1,5,3,6,4,8,9,7]
     * 复制
     * 返回值：
     * [1,3,4,8,9]
     * @param arr
     * @return
     */
    public int[] LIS (int[] arr) {
        // write code here
        int len = arr.length;
//        先写最长递增子序列
        int[] dp  = new int[len];
        dp[0] = 1;
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j]<num){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
                maxLen = Math.max(maxLen,dp[i]);
            }
        }
        int[] ans = new int[maxLen];
        for (int i = len-1,j= maxLen; j>0; --i) {
              if (dp[i] == j){
                  ans[--j] = arr[i];
              }
        }
        return  ans;
    }

}

