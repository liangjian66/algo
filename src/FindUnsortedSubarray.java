import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindUnsortedSubarray {


    public int findUnsortedSubarray(int[] nums) {
        //初始化
        int len = nums.length;
        int min = nums[len-1];
        int max = nums[0];
        int begin = 0, end = -1;
        //遍历
        for(int i = 0; i < len; i++){
            if(nums[i] < max){      //从左到右维持最大值，寻找右边界end
                end = i;
            }else{
                max = nums[i];
            }

            if(nums[len-i-1] > min){    //从右到左维持最小值，寻找左边界begin
                begin = len-i-1;
            }else{
                min = nums[len-i-1];
            }
        }
        return end-begin+1;
    }



    /*排序 + 双指针*/
    public int findUnsortedSubarraySortMethods(int[] nums) {
        if (nums ==null || nums.length == 0){
            return  0;
        }
        int m  = nums.length;
        int[] tempArr = nums.clone();
        Arrays.sort(tempArr);
        int i = 0;
        int j = m-1;
        while (i<=j&&(tempArr[i] == nums[i])) i++;
        while (i<=j&&(tempArr[j] == nums[j])) j--;
        return  j-i+1;
    }

    public ListNode sortInList (ListNode head) {
        // write code here
        if (head == null){
            return  head;
        }
        List<Integer> res = new ArrayList<Integer>();
        ListNode curr =head;
        while (curr != null){
            res.add(curr.val);
            curr = curr.next;
        }
        int[]  arr =  new int[res.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(i);
        }
        Arrays.sort(arr);
        ListNode newHead = new ListNode(arr[0]);
        curr = newHead;

        int i = 1;
        while (i<arr.length){
            ListNode newNode = new ListNode(arr[i]);
            curr.next = newNode;
            curr = newNode;
            i++;


        }
        return  newHead;
    }

    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        StringBuilder builder1 = new StringBuilder();
        ListNode curr1 = head1;
        while (curr1 != null){
            builder1.append(curr1.val);
            curr1 = curr1.next;
        }
        String str1 = builder1.toString();
        int num1 = Integer.parseInt(str1);

        StringBuilder builder2 = new StringBuilder();
        ListNode curr2 = head2;
        while (curr2 != null){
            builder2.append(curr2.val);
            curr2 = curr2.next;
        }
        String str2 = builder2.toString();
        int num2 = Integer.parseInt(str2);
        int sum = num1+num2;
        String res = String.valueOf(sum);
        char[] arr = res.toCharArray();
        int firstNode = arr[0] - '0';
        ListNode head = new ListNode(firstNode);
        ListNode curr = head;
        int i = 1;
        while (i<arr.length){
            ListNode tempNode = new ListNode(arr[i] - '0');
            curr.next = tempNode;
            curr = tempNode;
            i++;

        }
        return  head;
    }


}
