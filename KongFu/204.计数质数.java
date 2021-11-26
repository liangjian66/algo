/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
import java.util.*;
class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // 将数组都初始化为true
        Arrays.fill(isPrime,true);
        // 素数从2开始算
        for(int i =2;i*i<n;i++){
            if(isPrime[i]){
                //i 的倍数不可能是素数
                for(int j = i*i;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2;i<n;i++){
            if(isPrime[i])  count++;
        }
        return count;

    }
}
// @lc code=end

