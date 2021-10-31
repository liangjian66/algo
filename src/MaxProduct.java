public class MaxProduct {



    public  int maxProduct(int[] nums){
        int length = nums.length;
        /*维护一个存储最大值的dp*/
        int[] maxDp = new int[length];
        /*维护一个存储最小值的dp*/
        int[] minDp = new int[length];
        System.arraycopy(nums,0,maxDp,0,length);
        System.arraycopy(nums,0,minDp,0,length);

        for (int i = 1; i < length; i++) {
            maxDp[i] = Math.max(maxDp[i-1]*nums[i],Math.max(nums[i],minDp[i-1]*nums[i]));
            minDp[i] = Math.min(minDp[i-1]*nums[i],Math.min(nums[i],maxDp[i-1]*nums[i]));
        }
        int res = maxDp[0];
        for (int i = 1; i < maxDp.length; i++) {
            res = Math.max(res,maxDp[i]);
        }
        return  res;
    }


    public static int maxProductCustom(int[] nums) {
        if (nums == null || nums.length == 0){
            return  0;
        }
        /*2 3 -2 4*/
        int len = nums.length;
        if (len == 1){
            return  nums[0];
        }
        int res  = Integer.MIN_VALUE;

        for (int l = 1; l <= len; l++) {
            /*起点*/
            for (int i = 0; i <len-l+1 ; i++) {
                /* j - i +1 = len;*/
                /*终点*/
                int temp = 1;
                for (int k = i; k < i+l; k++) {
                    temp = temp*nums[k];
                }
                res = Math.max(res,temp);

            }

        }

        return  res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4,-3};
        System.out.println(maxProductCustom(arr));
    }


}
