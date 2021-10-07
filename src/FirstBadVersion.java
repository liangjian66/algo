public class FirstBadVersion {


    /*
    * 由于这个有隐藏函数 我先注释
    *
    * */
    /*寻找第一个错误版本*/
    /*
    public  int firstBadVersion(int n){
         int left =  1;
         int right = n;
//         迭代  循环直至区间左右端点 相同
         while (left<right){
             int mid = left + (right - left)/2;
             if (isBadVersion(mid)){
                 right = mid; // 答案在区间 [left, mid] 中

             }else {
                 left = mid + 1; // 答案在区间 [mid+1, right] 中

             }
         }
        // 此时有 left == right，区间缩为一个点，即为答案   激进的国际化
        return left;
    }
    */

}
