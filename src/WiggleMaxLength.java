public class WiggleMaxLength {

    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n<2){
            return n;
        }
        /*
        * 某个序列被称为「上升摆动序列」，当且仅当该序列是摆动序列，且最后一个元素呈上升趋势。如序列 [1,3,2,4][1,3,2,4] 即为「上升摆动序列」
        *
        *
        * 某个序列被称为「下降摆动序列」，当且仅当该序列是摆动序列，且最后一个元素呈下降趋势。如序列 [4,2,3,1][4,2,3,1] 即为「下降摆动序列」
        * */


        /*建立动态规划dp
        * 上升序列 dp : up
        * 下降序列 dp : down
        * */
        int[] up = new int[n];
        int[] down = new int[n];
        up[0]  = down[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i]>nums[i-1]){
                /*上升序列 遇见大值 up 不变  down +1  */
                up[i] = Math.max(up[i - 1], down[i - 1] + 1);
                /*下降序列 遇见大值 down不变  */
                down[i] = down[i-1];

            }else if(nums[i]<nums[i-1]){
                up[i] = up[i-1];
                down[i] = Math.max(up[i-1]+1,down[i-1]);

            }else {
                up[i] = up[i-1];
                down[i] = down[i-1];
            }
            
        }
        return  Math.max(up[n-1],down[n-1]);
    }
}
