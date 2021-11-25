/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>  res = new ArrayList<>();
        if(n == 0){
            return res;
        }
        dfs("",n,n,res);
        return res;

    }
    /**
     * 
     * 核心思路  右边剩余可以使用的括号数量一定得在严格大于左边剩余的数量的时候，才可以产生分支；
     * 当前递归得到的结果
     * left 左括号还有几个可以使用
     * right 右括号还有几个可以使用
     * res 结果集
     * */ 
    private void dfs(String curStr,int left,int right,List<String> res){
            if(left == 0 && right == 0){
                res.add(curStr);
                return ;
            }
            if(left>right){
                return ;
            }
            if(left>0){
                dfs(curStr+"(",left-1,right,res);
            }
            if(right>0){
                dfs(curStr+")",left,right-1,res);
            }
    }
}
// @lc code=end

