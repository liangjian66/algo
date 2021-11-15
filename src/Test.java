import java.util.*;

public class Test {

    public  boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null){
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        HashMap<Character,Integer> s1HashMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> s2HashMap = new HashMap<Character,Integer>();
        for(int i= 0;i<s1Arr.length;i++){
            char c1 = s1Arr[i];
            s1HashMap.put(c1,s1HashMap.getOrDefault(c1,0)+1);
        }
        // 滑动窗口 双指针

        int s2Len = s2Arr.length;
        int s1Len = s1Arr.length;
        if (s1Len>s2Len){
            return  false;
        }
        int k = s1Len;
        // 初始化set
        for(int i = 0;i<k;i++){
            char c2 = s2Arr[i];
            s2HashMap.put(c2,s2HashMap.getOrDefault(c2,0)+1);
        }
        if(s1HashMap.equals(s2HashMap)){
            return true;
        }
        for(int i=0;i<s2Len-k;i++){
            int left = i;
            int right = i+k-1;
//            s2HashSet.remove(s2Arr[left]);
            if (s2HashMap.get(s2Arr[left]) == 1){
                s2HashMap.remove(s2Arr[left]);
            }else {
                s2HashMap.replace(s2Arr[left],s2HashMap.getOrDefault(s2Arr[left],0)-1);
            }

            char c2 = s2Arr[right+1];
            s2HashMap.put(c2,s2HashMap.getOrDefault(c2,0)+1);
            if(s1HashMap.equals(s2HashMap)){
                return true;
            }
        }
        return false;

    }

    public void merge(int[] A, int m, int[] B, int n) {
        int[] C =new int[m];
        for (int i = 0; i < m; i++) {
            C[i] = A[i];
        }
        int i = 0;
        int j=0;
        int k =0;
        while (i<m&&j<n){
            if (C[i]<=B[j]){
                A[k++] = C[i++];
            }else {
                A[k++] = B[j++];
            }
        }
            while (i<m){
                A[k++] = C[i++];

            }
        while (j<n){
            A[k++] = B[j++];
        }

    }


    /**
     * 深度优先遍历
     * @param nums 数据
     * @param isUsed 标记这个元素是否使用
     * @param index  标记遍历到了第几层 也可以理解成排列需要排第几个元素了
     * @param path  遍历到的元素加入队列
     * @param res  遍历完成的排列 加入结果集合
     */
    public void dfs(int[] nums,boolean[] isUsed,int index,Deque path,List<List<Integer>> res){
        int len = nums.length;
        if(path.size() == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0 ;i<len;i++){
            // if(!isUsed[i]){
            // 遇到使用过得 终止本次循环
            if(isUsed[i])  continue;
            int num = nums[i];
            path.addLast(num);
            isUsed[i] = true;
            dfs(nums,isUsed,index+1,path,res);
            isUsed[i] = false;
            path.removeLast();
            // }

        }
    }


    public int trap(int[] height) {
        int len  = height.length;
        if(height == null || len ==0){
            return 0;
        }
        int res = 0 ;
        int[] left  = new int[len];
        int[] right = new int[len];
        // stack存储的是下标
        Deque<Integer>  stack = new  ArrayDeque<Integer>();
        for(int i =  0 ;i<len;i++){
            int num = height[i];
            while(!stack.isEmpty()&&(height[stack.peekLast()]>num)){
                stack.pollLast();
            }
            left[i] = stack.isEmpty()?-1:stack.peekLast();
            stack.offerLast(i);
        }

        for(int i = len-1;i>=0;i--){
            int num = height[i];

            while(!stack.isEmpty()&&(height[stack.peekLast()]>num)){
                stack.pollLast();
            }
            right[i] = stack.isEmpty()?len:stack.peekLast();
            stack.offerLast(i);
        }
        for(int i =1;i<len-1;i++){
            int leftIndex = left[i]+1;
            int rightIndex = right[i]-1;
            int leftVal = height[leftIndex];
            int rightVal =  height[rightIndex];
            int heightVal = Math.min(leftVal,rightVal);
            int temp = heightVal- height[i];
            res +=temp;

        }
        return res;

    }


    public static void main(String[] args) {
//        String temp = "dvdf";
//        LinkedHashSet<Integer>  keyList = new LinkedHashSet<>();
//        keyList.iterator().next();
//
        Test test = new Test();
//        int[][] grid = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
//        Arrays.copyOf()    [0,1,0,2,1,0,1,3,2,1,2,1]
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(test.trap(heights));

    }
}
