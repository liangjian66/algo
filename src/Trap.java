public class Trap {

    /**
     * 接雨水
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0){
            return  0;
        }
        /*leftMaxDp[i] 表示下标i及其左边的位置中，height的最大高度*/
        /*转移方程式*/
        /*初始化 ，边界条件*/
        int[] leftMaxDp = new int[n];
        leftMaxDp[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxDp[i] = Math.max(leftMaxDp[i-1],height[i]);
        }
        int[] rightMaxDp = new int[n];
        rightMaxDp[n-1] = height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMaxDp[i] = Math.max(rightMaxDp[i+1],height[i]);
        }
//        int sum = Math.min(left,right) - height;
        int res = 0;
        for (int i = 1; i < n-1; i++) {

            int temp = Math.min(leftMaxDp[i],rightMaxDp[i]) - height[i];
            res += temp;
        }
        return  res;
    }


}
