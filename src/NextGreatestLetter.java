public class NextGreatestLetter {

    public  char nextGreatestLetter(char[] letters, char target){
        if (letters == null){
            return  ' ';
        }
//        二分查找
//        双指针
        int i = 0 ;
        int j= letters.length-1;
        char ans = ' ';
        while (i<=j){

            int mid  = i+ (j-i)/2;
            if (letters[mid]-target<=0){   //中间值较小
//                找到最后一个比target 小的字母  下一个就是比target大的字母
                 i = mid+1;
            }else {
                j= mid-1;
            }

        }
        if (i<letters.length){
            return letters[i];
        }
        else {
            return letters[0];
        }

    }
}
