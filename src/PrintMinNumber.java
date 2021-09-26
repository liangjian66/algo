public class PrintMinNumber {

    public  static  String  printMinNumber(int[]  nums){

        String[] strs = new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs,0,strs.length-1);
        StringBuilder res = new StringBuilder();
        for (String s: strs){
            res.append(s);
        }

        return res.toString();
    }
//快速排序
   static void  quickSort(String[] strs,int l ,int r){
        if (l>=r)return;
        int i=l , j= r;
        String tmp = strs[i];
        while (i<j){
// 判断规则  掌握清楚
//          若拼接字符串 x + y > y + x ，则 x “大于” y ；
//            反之，若 x + y < y + x，则 x “小于” y ；
            while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;

            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;

        }
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs,l,i-1);
        quickSort(strs,i+1,r);


    }


}
