public class TwoArrayMerge {
    public class Solution {
        public    void merge(int A[], int m, int B[], int n) {

            int[]  res = new int[m+n];
            int i = 0;
            int j = 0;
            int k = 0;

            while((i<m)&&(j<n)){
                if(A[i]<=B[j]){
                    res[k++] = A[i++];
                }else{
                    res[k++] = B[j++];
                }
            }
            while(i<m){
                res[k++] = A[i++];
            }
            while(j<n){
                res[k++] = B[j++];
            }

            for(int x=0;x<m+n;x++){
                A[x] = res[x];
            }

        }
    }

}
