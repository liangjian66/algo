public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
       /*判断逆序对的情况*/
        if (nums.length == 1){
              return  true;
        }

        /*标记是否还能更改*/
        boolean flag = nums[0] <= nums[1]?true:false;

//        遍历时需要看连续的三个元素
        for (int i = 1; i < nums.length-1; i++) {
        // 出现递减 发现降序  怎么办 第一办法 把i位变小 第二 把i+1变大
            if (nums[i]>nums[i+1]){
                  if (flag){
                      /**/
                      if (nums[i+1]>=nums[i-1]){
                          nums[i] = nums[i+1];
                      }else {
                          nums[i+1] = nums[i];
                      }
                      flag = false;
                  }else {
                      return false;
                  }
            }
            
        }
        return true;
    }

    //  3  4 2 3
//    5 7 1 8
}
