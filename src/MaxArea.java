public class MaxArea {

    public int maxArea(int[] height) {
        /*穷举是所有算法的核心*/
        if (height == null || height.length ==0){
            return  0;
        }
        int m = height.length;
        int i = 0;
        int j = m-1;
        int  res = 0;
        while (i<j){
            if (height[i]<height[j]){
                int temp = height[i]*(j-i);
                res  = Math.max(res,temp);
                i++;
            }else {
                int temp = height[j]*(j-i);
                res  = Math.max(res,temp);
                j--;
            }
        }
        return  res;
    }


    /**
     * 使用 遍历 穷举 解决问题 万物算法皆是基于枚举
     * @param height
     * @return
     */
    public int maxAreaTwo(int[] height) {
         /*穷举是所有算法的核心*/
        if (height == null || height.length ==0){
            return  0;
        }
        int m = height.length;
        int sum  = 0 ;
        for (int i = 0; i < m; i++) {
            int num1 = height[i];
            for (int j = 0; j < m; j++) {
                int num2 = height[j];
                int temp =  Math.min(num1,num2)*(i-j);
                sum = Math.max(sum,temp);
            }

        }
        return  sum;
    }

}
