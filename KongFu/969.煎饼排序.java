/*
 * @lc app=leetcode.cn id=969 lang=java
 *
 * [969] 煎饼排序
 */

// @lc code=start
import java.util.*;
class Solution {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> pancakeSort(int[] arr) {
                  sort(arr,arr.length);
                  return res;
    }

    public void sort(int[] cakes,int n){
        if(n == 1) return;
        // 寻找最大烧饼的索引
        int maxCake = 0;
        int maxCakeIndex = 0;
        for(int i=0;i<n;i++){
            if(cakes[i]>maxCake){
                maxCakeIndex = i;
                maxCake = cakes[i];
            }
        }
        // 第一次反转 ， 将最大烧饼翻到最上面
        reverse(cakes,0,maxCakeIndex);
        // 记录这一次反转 
        res.add(maxCakeIndex+1);
        // 第二次 反转 ，将最大烧饼翻到最下面
        reverse(cakes,0,n-1);
        res.add(n);
        // 递归调用 翻转剩下的烧饼
        sort(cakes,n-1);
    }
/**翻转arr[i...j]的元素**/
    private void reverse(int[] arr, int i, int j) {
        // TODO
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
// @lc code=end

