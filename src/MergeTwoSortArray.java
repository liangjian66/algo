import java.util.Arrays;
/*合并两个有序数组*/
public class MergeTwoSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0,j = 0,k = 0;
        int[] numK = new int[m+n];

        while (i<m||j<n){
             if (i==m && j<n){
                 numK[k] = nums2[j];
                 k++;
                 j++;
             }
             else if(j==n&& i<m){
                 numK[k] = nums1[i];
                 k++;
                 i++;
             }
             else if (nums1[i]<=nums2[j]){
                 numK[k] = nums1[i];
                 i++;
                 k++;
             }else if(nums1[i]>nums2[j]){
                 numK[k] = nums2[j];
                 j++;
                 k++;
             }
        }


        int x = 0;
        for (int num :numK){
            nums1[x++] = num;
        }
    }

    public static void main(String[] args) {

        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        merge(num1,3,num2,3);
        for (int num: num1){
            System.out.println(num);

        }
    }
}
