
import com.sun.source.tree.Tree;

import java.util.*;

// 对人生欲望的挑战  抓住机会

// 人生 那种挑战的欲望  挑战和改变  这可能就是人生吧
public class Test {

    public static void main(String[] args) {
        String s = " 3/2 ";
        int[] res = new int[]{4,-2,-3,4,1};
        Test test = new Test();
      System.out.println(test.isAnagram("rat","car"));
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(nums == null || len == 0){
            return res;
        }
        Deque<Integer> path  = new  ArrayDeque<>();
        boolean[] useds = new boolean[len];
        Arrays.sort(nums);
        backtrack(nums,path,res,useds);
        return res;
    }
    public void backtrack(int[] nums,Deque<Integer> path,List<List<Integer>> res,boolean[] useds){
        int len = nums.length;
        if(path.size() == len){
            ArrayList<Integer>  temp = new ArrayList<>(path);
            res.add(temp);
            return;
        }
        for(int i=0;i<len;i++){
            int num = nums[i];
            if(useds[i]) continue;
            //去除重复元素
            if (i>0&&nums[i]==nums[i-1] && !useds[i-1]) continue;
            path.addLast(num);
            useds[i] = true;
            backtrack(nums,path,res,useds);
            path.removeLast();
            useds[i] = false;
        }
    }



    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
         int len = nums.length;
         if (nums == null || len == 0){
             return  res;
         }
         Deque<Integer> deque = new ArrayDeque<>();
//         Arrays.sort(nums);
         backTracking(nums,0,deque);
         return  res;
    }
    public  void  backTracking(int[] nums,int begin , Deque<Integer> deque){
        int len = nums.length;
        if (begin>len){
            return;
        }
        if (deque.size()>1){
            ArrayList<Integer> temp = new ArrayList<>(deque);
            if (!res.contains(temp)){
                res.add(temp);
            }
        }
         int[] used = new int[201];
        for (int i = begin; i < len; i++) {
            int num = nums[i];
//            if (i>begin&&nums[i] == nums[i-1]) continue;
            if (used[num+100] == 1) continue;
            if (!deque.isEmpty() ){
                int peek = deque.peekLast();
                 if (num<peek) continue;
            }
            used[num+100] = 1;
            deque.add(num);
            backTracking(nums,i+1,deque);
            deque.removeLast();
        }
    }


    public List<String> restoreIpAddresses(String s){
         int len = s.length();
         List<String> res = new ArrayList<>();
         if (len<4|| len>12){
             return  res;
         }
         Deque<String>  path = new ArrayDeque<>(4);
         int splitTimes = 0;
         dfs(s,len,splitTimes,0,path,res);
        return  res;
    }
    private  void  dfs(String  s,int len ,int split,int begin ,Deque<String> path,List<String> res){
          if (begin == len){
              if (split == 4){
                  res.add(String.join(".", path));
              }
              return;
          }

        if (len - begin < (4 - split) || len - begin > 3 * (4 - split)) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (begin+i>=len){
                break;
            }
            int segment = judgeIfIpSegment(s,begin,begin+i);
            if (segment != -1){
                path.addLast(segment+"");
                dfs(s,len,split+1,begin+i+1,path,res);
                path.removeLast();
            }
        }
    }

    private  int judgeIfIpSegment(String s,int left,int right){
         int  len = right -left +1;
         if (len>1&&s.charAt(left) == '0'){
             return  -1;
         }
         int res = 0;
        for (int i = left; i <= right ; i++) {
            res = res*10+s.charAt(i) - '0';
        }
        if (res>255){
            return  -1;
        }
        return  res;
    }

    public  List<List<String>> partition(String s){
         int len = s.length();
         List<List<String>> res = new ArrayList<>();
         if (len == 0){
             return  res;
         }
         Deque<String> deque = new ArrayDeque<>();
         char[] charArray = s.toCharArray();
         dfs(charArray,0,len,deque,res);
         return  res;
    }

    public  void  dfs(char[] charArray,int index ,int len ,Deque<String> path ,List<List<String>> res){
           if (index == len){
               res.add(new ArrayList<>(path));
               return;
           }
        for (int i = index; i < len; i++) {
              if (!checkPalindrome(charArray,index,i)){
                  continue;
              }
              path.add(new String(charArray,index,i+1-index));
              dfs(charArray,i+1,len,path,res);
              path.removeLast();
        }
    }

    public  boolean checkPalindrome(char[] charArray,int left,int right){
          while (left<right){
              if (charArray[left] != charArray[right]){
                  return  false;
              }
              left++;
              right--;
          }
          return  true;
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(candidates);
        backTrackingOfsum(candidates,deque,0,target,0);
        return  res;
    }

    public void backTrackingOfsum(int[] nums,Deque<Integer>  deque,int num,int target,int begin){
        if (num>target){
            return;
        }
        if (num == target){
            ArrayList<Integer> temp = new ArrayList<>(deque);
            res.add(temp);
        }
        int len = nums.length;
        for (int i = begin; i < len; i++) {
            if (nums[i]>target) break;
            if (i>begin&&nums[i] == nums[i-1]) continue;
            deque.add(nums[i]);
            num+=nums[i];
            backTrackingOfsum(nums,deque,num,target,i+1);
            int peek = deque.peekLast();
            num -= peek;
            deque.pollLast();
        }
    }


    List<String> res  = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
         int len = digits.length();
         if (digits == null || len == 0){
             return  res;
         }

        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        backtrackingOflet(digits,phoneMap,0);
        return  res;
    }
    StringBuilder sb = new StringBuilder();
    public void  backtrackingOflet(String digits,Map<Character,String> phoneMap,int start){
          int len = digits.length();
        if (sb.length() == len){
            String str = sb.toString();
              res.add(str);
              return;
        }
        char ch = digits.charAt(start);
        String tempStr = phoneMap.get(ch);
        for (int i = 0; i < tempStr.length(); i++) {
             char letter = tempStr.charAt(i);
             sb.append(letter);
             backtrackingOflet(digits,phoneMap,start+1);
             sb.deleteCharAt(start);
        }
    }


    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        Deque<Integer> deque  = new ArrayDeque<>();
        backtracking(k,deque,1,0,n);
        return  res;
    }
    public  void backtracking(int k ,Deque<Integer>  deque,int start,int num,int target){
          int size = deque.size();
          if (num>target || size>k){
              return;
          }
          if (size == k && num == target){
              ArrayList<Integer> temp = new ArrayList<>(deque);
              res.add(temp);
              return;
          }
        for (int i = start; i <=9 ; i++) {
              deque.addLast(i);
              num+=i;
              backtracking(k,deque,i+1,num,target);
              int peek = deque.peekLast();
              num -= peek;
              deque.removeLast();
        }
    }


    public TreeNode sortedArrayToBST(int[] nums) {
          int len = nums.length;
          if (nums == null || len == 0){
              return  null;
          }
          return  dfsOfSort(nums,0,len-1);
    }
    public TreeNode dfsOfSort(int[] nums,int left,int right){
        if (left>right) return  null;
        int len = nums.length;
        int mid = (right+left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfsOfSort(nums,left,mid-1);
        root.right = dfsOfSort(nums,mid+1,right);
        return  root;
    }


    public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null)  return  root;
            if (root.val <low){
                root = root.right;
               root =   trimBST(root,low,high);
            }else  if (root.val >high){
                root = root.left;
                root =  trimBST(root,low,high);
            }else {
               root.left = trimBST(root.left,low,high);
              root.right = trimBST(root.right,low,high);
            }
            return  root;
    }


    public TreeNode deleteNode(TreeNode root, int key) {
         if (root == null) return  root;
         if (root.val == key){
             if (root.left == null && root.right ==null){
                 return  null;
             }else if (root.left == null){
                  return  root.right;
             }else if (root.right == null){
                 return  root.left;
             }else if (root.left != null && root.right != null){
                 TreeNode cur = root.right;
                 while (cur.left != null){
                     cur = cur.left;
                 }
                 cur.left = root.left;
                 root = root.right;
                 return  root;
             }
         }
         root.left = deleteNode(root.left,key);
         root.right = deleteNode(root.right,key);
         return  root;
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            return  new TreeNode(val);
        }
        TreeNode ptr = root;
        while (ptr != null){
            if (val<ptr.val){
                 if (ptr.left == null){
                    ptr.left = new TreeNode(val);
                    break;
                 }else {
                     ptr = ptr.left;
                 }
            }else {
                   if (ptr.right == null){
                        ptr.right = new TreeNode(val);
                        break;
                   }else {
                         ptr = ptr.right;
                   }
            }
        }
        return  root;
    }



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         return  dfsOfpq(root,p,q);
    }

    public  TreeNode dfsOfpq(TreeNode root,TreeNode p,TreeNode q){
        if (root == null) return  root;
        if (root == p || root == q) return root;
        TreeNode leftC  =  dfsOfpq(root.left,p,q);
        TreeNode rightC = dfsOfpq(root.right,p,q);
        if (leftC == null && rightC == null){
            return  null;
        }
        else if (leftC == null) {
            return  rightC;
        }
        else  if (rightC == null) {
            return  leftC;
        }
        else if (leftC != null && rightC != null){
            return  root;
        }
        return  null;
    }


     List<Integer>  ans = new ArrayList<>();
    int base ;
    int count ;
    int maxcount ;
    public int[] findMode(TreeNode root) {
        if (root == null) return  new int[0];
        dfsfindMode(root);
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return  res;
    }

    public  void dfsfindMode(TreeNode root){
         if (root == null) return;
         dfsfindMode(root.left);
         update(root.val);
        dfsfindMode(root.right);

    }

    public  void  update(int x){
          if (x ==base){
              count++;
          }else {
              base = x;
              count = 1;
          }
          if (count == maxcount){
              ans.add(x);
          }
         else if (count>maxcount){
              maxcount = count;
              ans.clear();;
              ans.add(x);
          }
    }


    TreeNode prev = null;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        dfsOfisValidBST(root);
        return  min;
    }
    public  void dfsOfisValidBST(TreeNode root){
        if (root == null) return;
        dfsOfisValidBST(root.left);
        if ( prev != null){
              int num = root.val - prev.val;
            min = Math.min(min,num);
        }
        prev = root;
        dfsOfisValidBST(root.right);
    }







    public TreeNode searchBST(TreeNode root, int val) {
           if (root == null) return  root;
        TreeNode curr = root;
        while (curr != null){
            if (curr.val == val){
                return curr;
            }else if (val> curr.val){
                curr = curr.right;
            }else  if (val< curr.val){
                curr = curr.left;
            }
        }
        return  null;
    }



    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
           if (root1 == null && root2 == null) return  null;
            if (root1 == null) return  root2;
            if (root2 == null ) return  root1;
            TreeNode root = new TreeNode(root1.val+ root2.val);
            root.left =  mergeTrees(root1.left,root2.left);
            root.right= mergeTrees(root1.right,root2.right);
            return  root;
    }


     HashMap<Integer ,Integer> treeMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            treeMap.put(inorder[i],i);
        }
        int len1 = inorder.length;
        int len2 = postorder.length;
        return  dfsBuildTree(inorder,0,len1-1,postorder,0,len2-1);
    }



    public TreeNode dfsBuildTree(int[] inorder,int inorder_left,int inorder_right,int[] postorder,int po_left,int po_right){
         if (inorder_left>inorder_right||po_left>po_right){
             return null;
         }
         int rootVal =  postorder[po_right];
         int inorderRootIndex = treeMap.get(rootVal);
         int leftW =  inorderRootIndex - inorder_left;
         int rightW = inorder_right - inorderRootIndex;
         TreeNode leftChild = dfsBuildTree(inorder,inorder_left,inorder_left+leftW-1,postorder,po_left,po_left+leftW-1);
        TreeNode rightChild = dfsBuildTree(inorder,inorderRootIndex+1,inorderRootIndex+1+rightW-1,postorder,po_left+leftW-1+1,po_left+leftW-1+1+rightW-1);
        TreeNode root = new TreeNode(rootVal);
        root.left = leftChild;
        root.right = rightChild;
        return  root;
    }



    List<List<Integer>> res =  new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
              if (root == null) return res;
              Deque<Integer> deque = new ArrayDeque<>();
              dfsPath(root,deque,0,targetSum);
              return  res;
    }

    public  void dfsPath(TreeNode root,Deque<Integer> deque,int num,int target){
        if (root == null) return;
            num+=root.val;
            deque.addLast(root.val);
        if (root.left == null && root.right == null){
               if (num == target){
                   ArrayList<Integer> temp = new ArrayList<>(deque);
                   res.add(temp);
               }
        }
        dfsPath(root.left,deque,num,target);
        dfsPath(root.right,deque,num,target);
        deque.pollLast();
    }


    public boolean isBalanced(TreeNode root) {
          if (root == null) return true;
          int leftH = getHeight(root.left);
          int rightH = getHeight(root.right);
          if (Math.abs(leftH-rightH)>1) return false;
          boolean isBal = Math.abs(leftH-rightH)>1;
          return  isBal&&isBalanced(root.left)&&isBalanced(root.right);
    }

    public int getHeight(TreeNode root){
        if (root == null) return  0;
        int leftH =  getHeight(root.left);
        int rightH = getHeight(root.right);
        return  Math.max(leftH,rightH)+1;
    }


    public int minDepth(TreeNode root) {
         if (root == null) return 0;
         int leftH = minDepth(root.left);
         int rightH = minDepth(root.right);
         if (root.left == null && root.right != null){
             return  rightH+1;
         }
         if (root.left != null && root.right == null){
             return  leftH+1;
         }
         return  Math.min(leftH,rightH)+1;
    }


    public int maxDepth(TreeNode root) {
          if (root == null) return 0;
          int leftH =  maxDepth(root.left);
          int rightH = maxDepth(root.right);
          return  Math.max(leftH,rightH)+1;
    }



    public boolean isSymmetric(TreeNode root) {
          if (root == null) return  true;
          return  compareTreeNode(root.left,root.right);
    }

    public  boolean compareTreeNode(TreeNode left,TreeNode right){
        if (left == null && right == null) return  true;
        if (left != null && right ==null)  return  false;
        if (left == null && right != null) return  false;
        if (left.val != right.val) return  false;
        boolean outside = compareTreeNode(left.left,right.right);
        boolean inside  = compareTreeNode(left.right,right.left);
        return  outside&&inside;
    }



    public TreeNode invertTree(TreeNode root) {
             if (root == null) return  root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null ) return  res;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                   TreeNode node = deque.pollFirst();
                   temp.add(node.val);
                   if (node.left != null) {
                       deque.addLast(node.left);
                   }
                   if (node.right != null){
                       deque.addLast(node.right);
                   }
            }
            res.add(temp);
        }
        return  res;
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null )return  res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return  res;
    }


    public int trap1(int[] height) {
          int len = height.length;
          if (len == 0|| height == null){
              return 0;
          }
          int[] leftMax = new int[len];
          leftMax[0] = height[0];
        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        int[] rightMax = new int[len];
        rightMax[len-1] = height[len-1];
        for (int i = len-2; i >=0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i] );
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int num = height[i];
            ans += Math.min(leftMax[i],rightMax[i]) - num;
        }
        return ans;
    }


    public int trap1(int[] height) {
         int len = height.length;
         if (height == null || len == 0){
             return  0;
         }
         Stack<Integer> stack = new Stack<>();
         int ans = 0;
         // 栈存储的是下标
        for (int i = 0; i < len; i++) {
            int num = height[i];
            while (!stack.isEmpty()&& num>height[stack.peek()]){
                int curr = stack.pop();
                if (stack.isEmpty()){
                    continue;
                }
                int left = stack.peek();
                int w = i - left-1;
                int h = Math.min(height[left],num)-height[curr];
                ans += w*h;
            }
            stack.push(i);
        }
        return  ans;
    }




    public int[] topKFrequent(int[] nums, int k) {
           int len = nums.length;
           if (nums == null || len == 0){
               return  new int[0];
           }
           HashMap<Integer,Integer>  map = new HashMap<>();
           for (int num:nums){
               map.put(num,map.getOrDefault(num,0)+1);
           }
           PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
               @Override
               public int compare(int[] o1, int[] o2) {
                   return o1[1]-o2[1];
               }
           });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if (queue.size() == k){
                 if (queue.peek()[1]<count){
                     queue.poll();
                     queue.offer(new int[]{num,count});
                 }
            }else {
                queue.offer(new int[]{num,count});
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;
    }




    public int[] maxSlidingWindow(int[] nums, int k) {
         int len = nums.length;
         if (len == 0 || nums == null){
             return  new int[0];
         }
        Deque<Integer>  deque = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            int num = nums[i];

            while (!deque.isEmpty()&&num>nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
//       List<Integer> res = new ArrayList<>();
        int[] res = new int[len-k+1];

        for (int i = 0; i < len-k+1; i++) {
            int left = i;
            int right = left+k-1;

            while (!deque.isEmpty()&&nums[right]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(right);
            while (left>deque.peekFirst()){
                deque.pollFirst();
            }
            res[i] = nums[deque.peekFirst()];
        }
        return  res;
    }


    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        if (tokens ==null || len == 0){
            return  0;
        }
        Stack<Integer> stack  = new Stack<>();
        for (int i = 0; i < len; i++) {
            String str = tokens[i];
            if (isnum(str)){
                 stack.push(Integer.valueOf(str));
            }else {
                   int num1 = stack.pop();
                   int num2 = stack.pop();
                   if (str.equals("+")){
                       int num = num2+num1;
                       stack.push(num);
                   }else if (str.equals("-")){
                       int num = num2 - num1;
                       stack.push(num);
                   }else if (str.equals("*")){
                       int num = num2*num1;
                       stack.push(num);
                   }else if (str.equals("/")){
                       int num = num2/num1;
                       stack.push(num);
                   }
            }
        }
        return  stack.pop();
    }

    public  boolean isnum(String s) {
        boolean isFuHao=  s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/");
        return  !isFuHao;
    }


    public boolean isValid(String s) {
            char[] charArr = s.toCharArray();
            int len = charArr.length;
            if (len%2 !=0) return false;
            HashMap<Character ,Character> map  = new HashMap<>();
            map.put('(',')');
            map.put('[',']');
            map.put('{','}');
            Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
              char ch = charArr[i];
              if (map.containsKey(ch)){
                  stack.push(ch);
              }else  if (map.containsValue(ch)){
                  if (stack.isEmpty()){
                      return false;
                  }

                    char popCh = stack.pop();
                    if (ch != map.get(popCh)){
                        return false;
                    }
              }else {
                  return  false;
              }
        }
        return  stack.isEmpty();
    }


    public String reverseWords(String s){
              StringBuilder sb = trimSpaces(s);
              // 翻转字符串
        reverse(sb,0,sb.length()-1);
        reverseEachWord(sb);
        return sb.toString();
    }

    public  StringBuilder trimSpaces(String s){
        int left = 0;
        int right = s.length()-1;
        // 去除头部 空格
        while (left<=right && s.charAt(left) ==' '){
            left++;
        }
        while (left<=right&&s.charAt(right) == ' '){
            right--;
        }

        // 将字符创空白的字符删除
        StringBuilder sb  = new StringBuilder();
        while (left<=right){
             char c = s.charAt(left);
             if (c != ' '){
                 sb.append(c);
             }else if(sb.charAt(sb.length()-1)!=' '){
                 sb.append(c);
             }
             left++;
        }
        return  sb;
    }

    public void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public  void  reverseEachWord(StringBuilder sb){
         int n = sb.length();
         int start = 0 ;
         int end = 0;
         while (start<n){
             while (end<n&&sb.charAt(end)!=' '){
                 end++;
             }
             // 反转单词
             reverse(sb,start,end-1);
             start = end+1;
             end++;
         }
    }



    public String reverseStr(String s, int k) {
            char[]  arr = s.toCharArray();
            int len = arr.length;
        for (int i = 0; i < len; i+=2*k) {
            reverseString(arr,i,Math.min(i+k,len)-1);
        }
        return  new String(arr);
    }

    public void reverseString(char[] s,int i,int j) {
         int len = s.length;
         int left = i;
         int right = j;
         while (left<right){
             char temp = s[left];
             s[left] = s[right];
             s[right] = temp;
             left++;
             right--;
         }
    }


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len <4|| nums == null){
            return  res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len-3; i++) {
            int first = nums[i];
            if (i>0&&nums[i] == nums[i-1] ) continue;
            for (int j = i+1; j <len-2 ; j++) {
                  int second = nums[j];
                  if (j>i+1&&nums[j] == nums[j-1]) continue;
                  int left = j+1;
                  int right = len-1;
                  while (left<right){
                      int sum = nums[i]+nums[j]+nums[left]+nums[right];
                      if (sum == target){
                          res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                          while (left<right&&nums[left+1]==nums[left]) left++;
                          left++;

                          while (left<right&&nums[right-1] == nums[right]) right--;
                          right--;
                      }else  if (sum>target){
                            right--;
                      }else  if (sum<target){
                           left++;
                      }
                  }
            }
        }
          return res;
    }


    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || len < 3) return res;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
              int first = nums[i];
              if (first>0) break;
              if (i>0&& nums[i] == nums[i-1]) continue;
              int left = i+1;
              int right = len-1;
              while (left<right){
                  int sum = nums[i]+nums[left]+nums[right];
                  if (sum == 0){
                          res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                          while (left<right&&nums[left+1] == nums[left]) left++;
                          while (left<right&&nums[right-1]==nums[right]) right--;
                          left++;
                          right--;
                  }else if (sum>0){
                      right--;
                  }else  if (sum<0){
                      left++;
                  }
              }
        }
        return  res;
    }

    public int maximumGood(int[][] statements) {
         int len = statements.length;
         if (len == 0|| statements == null) return 0;
     int row = 0;
     int col = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (statements[i][j] == 0){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        int count = 0;
        // row 入口是好人
        boolean[] dp  = new boolean[len];
        dp[row] = true;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                 if (statements[row][j] == 0){
                     dp[i] = false;
                 }else  if (statements[row][j] == 1){
                     dp[i] = true;
                 }
            }
        }
        for (boolean isHao :dp){
            if (isHao){
                count++;
            }
        }
     // 坏人
        boolean[] dp1 = new boolean[len];
        dp1[row] = false;


        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (statements[row][j] == 0){
                    dp[i] = false;
                }else  if (statements[row][j] == 1){
                    dp[i] = true;
                }
            }
        }


        int count1 = 0;
        for (boolean isHao:dp1){
            if (isHao){
                count1++;
            }
        }

        return  Math.max(count,count1);
    }



    public List<Integer> findLonely(int[] nums) {
         int len = nums.length;
         if (len == 0|| nums == null){
             return  new ArrayList<>();
         }
         List<Integer> res = new ArrayList<>();
         HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }else {
                map.put(num,1);
            }
        }
        for (int i = 0; i < len; i++) {
              int num = nums[i];
              if (map.get(num)==1&&(!map.containsKey(num-1))&&(!map.containsKey(num+1))){
                  res.add(num);
              }
        }
        return res;
    }


    public int[] rearrangeArray(int[] nums) {
         int len = nums.length;
         if (len==0|| nums == null){
             return  new int[0];
         }
         int n = len/2;
         int[] zheng = new int[n];
         int[] fu = new int[n];
         int left = 0;
         int right = 0;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num>0){
                zheng[left++] = num;
            }else if (num<0){
                fu[right++] = num;
            }
        }
        int[] res = new int[len];
        int index = 0;
       int  left1 = 0;
       int  right1 = 0;
        while (index<len){
            if (index%2==0){
                res[index++] = zheng[left1++];
            }else {
                res[index++] = fu[right1++];
            }
        }
        return  res;
    }


    public int countElements(int[] nums) {
       int len = nums.length;
       if (nums == null || len == 0) return  0;
       Arrays.sort(nums);
       int count = 0;
       int min = nums[0];
       int max = nums[len-1];
        for (int i = 0; i < len; i++) {
            int num  = nums[i];
            if (num>min&&num<max){
                count++;
            }
        }
        return  count;
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            HashMap<Integer,Integer> map = new HashMap<>();
             for (int num1:nums1){
                 for (int num2:nums2){
                     int sum1 = num1+num2;
                     map.put(sum1,map.getOrDefault(sum1,0)+1);
                 }
             }
             int ans = 0;
             for (int num3:nums3){
                 for (int num4:nums4){
                     int sum2 = -num3-num4;
                     if (map.containsKey(sum2)){
                         ans+=map.getOrDefault(sum2,0);
                     }
                 }
             }
             return  ans;
    }


    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if (len == 0 || nums == null){
            return new int[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            map.put(num,i);
        }
        int[] res=  new int[2];
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            int  val = target - num;
            if (map.containsKey(val) && map.get(val)!=i){
                res[0] = i;
                res[1] = map.get(val);
            }
        }
        return  res;
    }


    public int[] intersection(int[] nums1, int[] nums2) {
          if (nums1 ==null || nums2 ==null){
              return new int[0];
          }
          int len1= nums1.length;
          int len2 = nums2.length;
          HashSet<Integer> set = new HashSet<>();
          HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <len1 ; i++) {
             int num = nums1[i];
             set.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < len2; i++) {
             int num = nums2[i];
             if (set.contains(num)){
                 res.add(num);
                 set.remove(num);
             }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return  ans;
    }

    public boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        int len1 = arrS.length;
        int len2 = arrT.length;
        if (len1 != len2)  return false;
        HashMap<Character,Integer> sMap = new HashMap<>();
//        HashMap<Character,Integer> tMap = new HashMap<>();
        for (int i = 0; i <len1 ; i++) {
            char c = arrS[i];
            if (!sMap.containsKey(c)){
                sMap.put(c,sMap.getOrDefault(c,0)+1);
            }else {
                sMap.put(c, sMap.get(c)+1);
            }
            char c1 = arrT[i];
            if (!sMap.containsKey(c1)){
                sMap.put(c1,sMap.getOrDefault(c1,0)-1);
            }else {
                sMap.put(c1,sMap.get(c1)-1);
            }
        }

        for (Map.Entry<Character,Integer>entry:sMap.entrySet()){
            Character c = entry.getKey();
            int num = entry.getValue();
            if (num != 0){
                return false;
            }
        }
        return true;
    }


    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                ListNode ptr = head;
                while (ptr !=slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return  slow;
            }
        }
        return  null;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
         if (head == null ) return head;
         ListNode dummy = new ListNode(0);
         dummy.next = head;
         Stack<ListNode> stack = new Stack<>();
         ListNode curr = dummy;
         while (curr != null){
             stack.push(curr);
             curr = curr.next;
         }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return  dummy.next;
    }



    public ListNode reverseList(ListNode head) {
         if (head == null || head.next == null) return head;
         ListNode newHead = reverseList(head.next);
         ListNode nextNode = head.next;
         newHead.next = head;
         head.next = null;
         return  newHead;
    }


    public ListNode removeElements(ListNode head, int val) {
           if (head == null)  return  head;
        head.next = removeElements(head.next,val);
        if (head.val == val){
            return  head.next;
        }else {
             return  head;
        }
    }



    public int[][] generateMatrix(int n) {
          int[][] res = new int[n][n];
          int max = n*n;
          int num = 0;
          int left = 0;
          int right = n-1;
          int top = 0;
          int bottom = n-1;
          while (num<max){
              for (int i = left; i <=right ; i++) {
                  num++;
                  res[top][i] = num;
              }
              top++;
              if (top>bottom) break;
              for (int i = top; i <=bottom; i++) {
                  num++;
                  res[i][right] = num;
              }
              right--;
              if (left>right) break;
              for (int i = right; i >=left ; i--) {
                  num++;
                  res[bottom][i] = num;
              }
              bottom--;
              if (top>bottom) break;
              for (int i = bottom; i >=top ; i--) {
                  num++;
                  res[i][left] = num;
              }
              left++;
              if (left>right) break;
          }
          return  res;
    }


     // 滑动窗口解法
    public int minSubArrayLen(int target, int[] nums) {
           int  len = nums.length;
           if (nums == null || len == 0){
               return  0;
           }
           int start = 0;
           int end = 0;
           int ans = Integer.MAX_VALUE;
           int sum = 0;
           while (end<len){
               int endNum = nums[end];
               sum+= endNum;
               while (sum>=target){
                   int temp = end - start+1;
                   ans = Math.min(ans,temp);
                   sum-= nums[start];
                   start++;
               }
               end++;
           }
           if (ans == Integer.MAX_VALUE)return  0;
           return ans;
    }



    public int removeElement(int[] nums, int val) {
         int len = nums.length;

         if (len == 0 || nums == null){
             return 0;
         }
         int left = 0;
        for (int right = 0; right < len; right++) {
            int num = nums[right];
            if (num != val){
                nums[left] = num;
                left++;
            }
        }
        return  left;
    }


    public int search(int[] nums, int target) {
         int len = nums.length;
         if (len == 0|| nums == null){
             return -1;
         }
         int l = 0;
         int r = len-1;
         while (l<=r){
             int mid = l+(r-l)/2;
             if (nums[mid] == target){
                 return  mid;
             }else if (target>nums[mid]){
                   l = mid+1;
             }else if (target<nums[mid]){
                 r = mid-1;
             }
         }
         return  -1;
    }



    boolean res  = true;
    int rootval = 0;
    public boolean isUnivalTree(TreeNode root) {
       if ( root == null) return  true;
       rootval = root.val;
       dfs(root);
       return  res;
    }

    public  void  dfs(TreeNode root){
         if ( root == null) return;
         if (root.val != rootval) res = false;
         dfs(root.left);
         dfs(root.right);
    }




    public TreeNode pruneTree(TreeNode root) {
      if (root == null) return  root;
      boolean isContain =    containOnes(root);
         return  isContain?root:null;
    }

    public  boolean containOnes(TreeNode root){
        if (root == null) return  false;
        boolean l = containOnes(root.left);
        boolean r = containOnes(root.right);
         if (!l) root.left = null;
         if (!r) root.right = null;
         return  root.val == 1 || l || r;

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int len = nums.length;
      if (nums == null || len == 0){
          return true;
      }
      HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (map.containsKey(num)){
                List<Integer> list = map.get(num);
                list.add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num,list);
            }
        }
        for (List<Integer> list: map.values()){
              int size = list.size();
            for (int i = 0; i+1 < size; i++) {
                if (Math.abs(list.get(i+1)-list.get(i))<=k){
                    return  true;
                }
            }
        }

        return  false;
    }




    public int trap(int[] height) {
         int len = height.length;
         if (height == null || len == 0){
             return  0;
         }
         int ans = 0;
         Stack<Integer> stack = new Stack<>();
         // 单调递减栈
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()&& height[i]>height[stack.peek()]){
                int cur = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int width = i-left-1;
                int h = Math.min(height[left],height[i])-height[cur];
                ans+=width*h;
            }
            stack.push(i);
        }
         return  ans;
    }


    public int[] MySort (int[] arr) {
        // write code here
        quick(arr,0,arr.length-1);
        return  arr;

    }

    public void  quick(int[] nums,int i,int j){
        if (i>j){
            return;
        }
        int left = i;
        int right = j ;
        int pviot = nums[left];
        while (left<right){
            while (left<right&&nums[right]>pviot) right--;
            nums[left] = nums[right];
            while (left<right&&nums[left]<=pviot)left++;
            nums[right] = nums[left];
        }
        int mid = left;
        nums[mid] = pviot;
        quick(nums,i,mid-1);
        quick(nums,mid+1,j);
    }





}








