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


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  res = new  ArrayList<List<Integer>>();
        if (root == null){
            return  res;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            int len = deque.size();
            Deque<Integer>  rowData = new LinkedList<>();

            for (int i = 0; i < len; i++) {
                TreeNode node = deque.pollFirst();
                if (node != null){
                    if(res.size() %2 ==0){
                        rowData.addLast(node.val);
                    }else{
                        rowData.addFirst(node.val);
                    }
                }
                if (node.left != null){
                    deque.addLast(node.left);
                }
                if (node.right != null){
                    deque.addLast(node.right);
                }
            }
            res.add(new ArrayList<>(rowData));
        }
        return  res;
    }


    public static void main(String[] args) {
//        String temp = "dvdf";
//        LinkedHashSet<Integer>  keyList = new LinkedHashSet<>();
//        keyList.iterator().next();
//
        Test test = new Test();
//        int[][] grid = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
//        Arrays.copyOf()
        int[] temp = new int[]{2};

        String s1 = "ab";
        String s2 = "a";
        int[] A = new int[]{1,2,3,0,0,0};
        int[] B = new int[]{2,5,6};
        test.merge(A,3,B,3);
        System.out.println();

    }
}
