

* [algo](#algo)
   * [鸡汤篇](#鸡汤篇)
   * [排序算法](#排序算法)
   * [二叉树](#二叉树)
   * [哈希表](#哈希表)
   * [栈和队列](#栈和队列)
   * [数组](#数组)
   * [链表](#链表)
   * [字符串](#字符串)
   * [算法套路](#算法套路)
     * [双指针](#双指针)
     * [排序](#排序)
     * [贪心思想](#贪心思想)
     * [二分查找](#二分查找)
     * [搜索](#搜索)
     * [动态规划](#动态规划)
        * [斐波那契数列](#斐波那契数列)
        * [矩阵路径](#矩阵路径)
        * [数组区间](#数组区间)
        * [分割整数](#分割整数)
        * [最长递增子序列](#最长递增子序列)
        * [01背包](#01背包)
        * [股票交易](#股票交易)
        * [字符串编辑](#字符串编辑)
   * [算法题解](#算法题解)
   * [动态规划](#动态规划)
   * [剑指offer](#剑指offer)
     * [剑指offer-数据结构](#剑指offer-数据结构)
     * [剑指offer-二叉树](#剑指offer-二叉树)
     * [剑指offer-动态规划](#剑指offer-动态规划)
     * [剑指offer-查找和排序](#剑指offer-查找和排序)
     * [剑指offer-回朔法](#剑指offer-回朔法)
     * [剑指offer](#剑指offer-1)
   * [程序员代码面试指南左程云](#程序员代码面试指南左程云)
     * [第一章栈和队列](#第一章栈和队列)
     * [第二章链表问题](#第二章链表问题)
     * [第三章二叉树问题](#第三章二叉树问题)
     * [第四章递归和动态规划](#第四章递归和动态规划)
     * [第五章字符串问题](#第五章字符串问题)
   * [算法图书](#算法图书)
      * [有错误勘误，可以联系我](#有错误勘误可以联系我)
# algo
## 鸡汤篇
> 创作不易，感觉有帮助到你，可以顺手star

> 用产品思维帮助更多的人学习算法 更多的为用户考虑而写的一个仓库

> 用老罗的话 彪悍的人生不需要解释 挑一点恶心的干干 先开始写算法，像打造产品一样写一个算法仓库， 帮助更多的人学习算法，同样也是自我学习的过程

> Java写的算法仓库  算法最重要的是心得

> 准备做一个长期的算法仓库 ，像阿甘一样做个傻子，不停奔跑，每天学习一个算法，复利思维

> 日拱一卒，功不唐捐

> 把人生比作公司或者游戏的话 ， 我准备长期做的事情，一个是跑步锻炼身体，一个阅读书籍（技术类，非技术类书籍），一个就是这个算法仓库了

> 纸上得来终觉浅 ，绝知此事要躬行

> 三部曲： 模仿，学习， 超越

> 高筑墙 ， 广积粮 ， 缓称王

> 天道酬勤，勤能补拙。博观而约取，厚积而薄发

> 算法： 先把一个大问题拆解成一个个小问题 ，  再解决小问题 ， 小问题解决了拼接起来解决大问题

> 磨刀不误砍柴工， 磨石不误磨刀工

> 坚持下去，会有突然间成长的一天

>自顶向下 ，逐步求精

> 费曼算法： 1.将问题写下来 2. 好好思考 3.将答案写下来


##  排序算法
*  [冒泡排序](https://github.com/liangjian66/algo/blob/main/src/BubbleSort.java) ：BubbleSort
*  [插入排序](https://github.com/liangjian66/algo/blob/main/src/InsertSort.java) ： InsertSort   思路： 1. 每次碰到元素小的值  就往后面挪动一位  2.insertValue的值插入适当的位置
*  [选择排序](https://github.com/liangjian66/algo/blob/main/src/SelectSort.java) SelectSort  1.选择排序每次从未排序区间中最小的元素    2.首先找出数组中最小的哪个元素 ，其次，将它和数组的第一个元素交换位置 以此类推
*  [快速排序](https://github.com/liangjian66/algo/blob/main/src/QuickSort.java)   1. 递归  2 。 二分  3. 双指针的思路
*  [计数排序](https://github.com/liangjian66/algo/blob/main/src/CountSort.java)
*  [归并排序](https://github.com/liangjian66/algo/blob/main/src/mergeSort.java)  mergeSort  主要思想是递归   2. 主要是两个小的有序的数组合并成一个大的数组
*  [希尔排序](https://github.com/liangjian66/algo/blob/main/src/ShellSort.java) : ShellSort  思路 : 先分组 再使用插入排序 ，再缩小间隔d
*  [堆排序](https://github.com/liangjian66/algo/blob/main/src/HeapSort.java) ：HeapSort    题解： 1. 堆存储结构是个数组  2. 先构建一个大顶堆 3 ， 遍历取大顶堆  取最大值  ==  [牛客题解](https://blog.nowcoder.net/n/ccad7f6d9c164685a11f59c2a155e15d)

##  二叉树  
*   <mark>二叉树问题大多使用递归解决  递归几大要素： 1.基线条件（终止条件） 2.子问题 3.递归参数  4. 递归返回值 、 <mark>
*  [二叉树前序遍历](https://github.com/liangjian66/algo/blob/main/src/Solution.java) //  [力扣](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)
       二叉树前序遍历题解  ：Solution   1. 根结点 ---> 左子树 ---> 右子树  2. 单层条件是先根节点，左节点 右节点 后使用递归 ，递归的基线条件是：root节点==null 终止
*   [二叉树中序遍历](https://github.com/liangjian66/algo/blob/main/src/MiddleSolution.java) //  [力扣](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)
        二叉树中序遍历：MiddleSolution     ： 题解：  左子树——根节点——右子树   迭代解法  ：1. while   2 .入栈 3. 出栈
*   平衡二叉搜索树 ： AVLTree            关键字1. LL 右旋  2.RR 左旋  3.LR 先左旋 再右旋  4 RL 先右旋  再左旋
*   二叉堆:BinaryHeap                数学要好 1.  父节点的下标是P 他的左孩子下标就是 2P+1 2P+2          2. 最大堆上浮，跟自己的父节点对比 ， 比父节点大上浮， 不断对比
*   优先队列： PriorityQueue   题解：插入进行上浮操作  删除进行：最后一个替换到堆顶 ， 然后进行下沉操作
*    [二叉树层序遍历](https://github.com/liangjian66/algo/blob/main/src/LevelOrderTest.java) //  [力扣](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)
        二叉树层序遍历：LevelOrder 题解 ： 先把父节点放入队列 ，  然后遍历队列 ， 遍历子节点 加入数值
*    [二叉树的锯齿形层序遍历](https://github.com/liangjian66/algo/blob/main/src/zigzagLevelOrder.java) //  [力扣](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)
      二叉树的锯齿形层序遍历: zigzagLevelOrder   题解 ： 利用双端队列锯齿形层次遍历
*   [二叉树的深度](https://github.com/liangjian66/algo/blob/main/src/MaxDepth.java)
*   [平衡二叉树](https://github.com/liangjian66/algo/blob/main/src/TreeIsBanced.java) 思路： 左右子树 深度差超过 1  它就不是平衡二叉树
*   [翻转二叉树](https://github.com/liangjian66/algo/blob/main/src/InvertTree.java) 思路： 左右子树 深度差超过 1  它就不是平衡二叉树
*   [二叉树- 合并二叉树](https://github.com/liangjian66/algo/blob/main/src/MergeTrees.java)
*   [二叉树- 路径之和](https://github.com/liangjian66/algo/blob/main/src/HasPathSum.java)
*   [另一颗树的子树](https://github.com/liangjian66/algo/blob/main/src/IsSubtree.java)
*   [统计左叶子节点的和](https://github.com/liangjian66/algo/blob/main/src/SumOfLeftLeaves.java)
*   [二叉树中第二小的节点](https://github.com/liangjian66/algo/blob/main/src/FindSecondMinimumValue.java)
*   [非递归的前序遍历](https://github.com/liangjian66/algo/blob/main/src/PreorderTraversal.java)
*   [非递归的右序遍历](https://github.com/liangjian66/algo/blob/main/src/PostorderTraversal.java)
*   [非递归的中序遍历](https://github.com/liangjian66/algo/blob/main/src/InorderTraversal.java)

*   [ 修剪二叉搜索树](https://github.com/liangjian66/algo/blob/main/src/TrimBST.java)
*   [二叉搜索树中第K小的元素](https://github.com/liangjian66/algo/blob/main/src/KthSmallest.java)
*   [把二叉搜索树转换为累加树](https://github.com/liangjian66/algo/blob/main/src/ConvertBST.java)
*   [二叉搜索树的最近公共祖先](https://github.com/liangjian66/algo/blob/main/src/LowestCommonAncestor.java)
*   [二叉树的最近公共祖先](https://github.com/liangjian66/algo/blob/main/src/LowestCommonAncestorTwo.java)
*   [将有序数组转换成二叉搜索树](https://github.com/liangjian66/algo/blob/main/src/SortedArrayToBST.java)
*   [有序的链表转换二叉搜索树](https://github.com/liangjian66/algo/blob/main/src/SortedListToBST.java)
*   [两数之和 IV - 输入 BST](https://github.com/liangjian66/algo/blob/main/src/FindTargetInBST.java)
*   [二叉搜索树的最小绝对差](https://github.com/liangjian66/algo/blob/main/src/GetMinimumDifference.java)
*   [二叉搜索树中的众数](https://github.com/liangjian66/algo/blob/main/src/FindPublicNums.java)
*   [二叉树的镜像](https://github.com/liangjian66/algo/blob/main/src/MirrorTree.java)       //    [力扣](https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/)
*   [相同的树](https://github.com/liangjian66/algo/blob/main/src/IsSameTree.java)       //    [力扣](https://leetcode-cn.com/problems/same-tree/)
*   [二叉树的最小深度](https://github.com/liangjian66/algo/blob/main/src/MinDepth.java)       //    [力扣](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/)
*   [平衡二叉树](https://github.com/liangjian66/algo/blob/main/src/IsBalanced.java)       //    [力扣](https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/)
*   [输出二叉树的右视图](https://github.com/liangjian66/algo/blob/main/src/Solve.java)       //    [牛客](https://blog.nowcoder.net/n/8a80802fd6cf4e569c8c7a05e8b645d2)
*   [二叉树根节点到叶子节点的所有路径和](https://github.com/liangjian66/algo/blob/main/src/SumNumbers.java)       //    [牛客](https://blog.nowcoder.net/n/79ae4b4017e742ed8192212b6a71e265)
*   [验证二叉搜索树](https://github.com/liangjian66/algo/blob/main/src/IsValidBST.java)       //    [力扣](https://leetcode-cn.com/problems/validate-binary-search-tree/solution/er-cha-sou-suo-shu-by-xiao-sheng-tong-xu-urjv/)
*   [ 二叉树的完全性检验](https://github.com/liangjian66/algo/blob/main/src/IsCompleteTree.java)       //    [力扣](https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/solution/wan-quan-er-cha-shu-xiao-yan-by-xiao-she-cjr3/)
*   [ 判断一棵二叉树是否为搜索二叉树和完全二叉树](https://github.com/liangjian66/algo/blob/main/src/JudgeIt.java)       //    [牛客](https://blog.nowcoder.net/n/35ff8588448f45a89742a79d2e915f93)
*   [二叉树中的最大路径和](https://github.com/liangjian66/algo/blob/main/src/MaxPathSum.java)       //    [力扣](https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/solution/er-cha-shu-zhong-de-zui-da-lu-jing-he-by-a73z/)     //    [牛客](https://blog.nowcoder.net/n/52e744808dfb44b0840c1cf2d18ffc5e)
*   [二叉树的右视图](https://github.com/liangjian66/algo/blob/main/src/RightSideView.java)       //    [力扣](https://leetcode-cn.com/problems/binary-tree-right-side-view/solution/er-cha-shu-de-you-shi-tu-by-xiao-sheng-t-m58d/)   

*   [从前序与中序遍历序列构造二叉树](https://github.com/liangjian66/algo/blob/main/src/BuildTree.java)       //    [力扣](https://leetcode-cn.com/problems/binary-tree-right-side-view/solution/er-cha-shu-de-you-shi-tu-by-xiao-sheng-t-m58d/)

##  哈希表
*   [两数之和](https://github.com/liangjian66/algo/blob/main/src/TwoSum.java)    //    [力扣](https://leetcode-cn.com/problems/two-sum/description/)
*   [数组存在重复元素](https://github.com/liangjian66/algo/blob/main/src/ContainsDuplicate.java)    //    [力扣](https://leetcode-cn.com/problems/contains-duplicate/description/)
*   [最长和谐子序列](https://github.com/liangjian66/algo/blob/main/src/FindLHS.java)    //    [力扣](https://leetcode-cn.com/problems/longest-harmonious-subsequence/)
*   [最长连续序列](https://github.com/liangjian66/algo/blob/main/src/LongestConsecutive.java)    //    [力扣](https://leetcode-cn.com/problems/longest-consecutive-sequence/description/)



##  栈和队列
*   [用栈实现队列](https://github.com/liangjian66/algo/blob/main/src/QueuesWithStacks.java) //    [力扣](https://leetcode-cn.com/problems/implement-queue-using-stacks/description/) // [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)
*   [用队列实现栈](https://github.com/liangjian66/algo/blob/main/src/StacksWhithQueue.java)   //    [力扣](https://leetcode-cn.com/problems/implement-stack-using-queues/description/) //  [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)
*   [最小栈](https://github.com/liangjian66/algo/blob/main/src/MinStack.java)    //    [力扣](https://leetcode-cn.com/problems/min-stack/description/)
*   [用栈实现括号匹配](https://github.com/liangjian66/algo/blob/main/src/IsValid.java)    //    [力扣](https://leetcode-cn.com/problems/valid-parentheses/description/)
*   [数组中元素与下一个比它大的元素之间的距离](https://github.com/liangjian66/algo/blob/main/src/DailyTemperatures.java)    //    [力扣](https://leetcode-cn.com/problems/daily-temperatures/description/)
*   [循环数组中比当前元素大的下一个元素](https://github.com/liangjian66/algo/blob/main/src/NextGreaterElements.java)    //    [力扣](https://leetcode-cn.com/problems/next-greater-element-ii/description/)





##  数组
*  删除有序数组中的重复项 :  removeDuplicates  题解使用快慢指针
*   [把数组中的 0 移到末尾](https://github.com/liangjian66/algo/blob/main/src/MoveZeroes.java)    //    [力扣](https://leetcode-cn.com/problems/move-zeroes/description/)   // [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)
*   [改变矩阵维度](https://github.com/liangjian66/algo/blob/main/src/MatrixReshape.java)    //    [力扣](https://leetcode-cn.com/problems/reshape-the-matrix/description/) 
*   [最大连续 1 的个数](https://github.com/liangjian66/algo/blob/main/src/FindMaxConsecutiveOnes.java)    //    [力扣](https://leetcode-cn.com/problems/max-consecutive-ones/description/)
*   [有序矩阵查找](https://github.com/liangjian66/algo/blob/main/src/SearchMatrix.java)    //    [力扣](https://leetcode-cn.com/problems/search-a-2d-matrix-ii/description/)   //  [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)
*   [有序矩阵的 Kth Element](https://github.com/liangjian66/algo/blob/main/src/kthSmallestKth.java)    //    [力扣](https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/description/)   
*   [错误的集合](https://github.com/liangjian66/algo/blob/main/src/FindErrorNums.java)    //    [力扣](https://leetcode-cn.com/problems/set-mismatch/description/)   //  [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)
*   [寻找重复数](https://github.com/liangjian66/algo/blob/main/src/FindDuplicate.java)    //    [力扣](https://leetcode-cn.com/problems/find-the-duplicate-number/description/)   //  [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)
*   [对角元素相等的矩阵](https://github.com/liangjian66/algo/blob/main/src/IsToeplitzMatrix.java)    //    [力扣](https://leetcode-cn.com/problems/toeplitz-matrix/description/)   //  [手绘图解](https://github.com/liangjian66/algo/blob/main/MdSet/ImageSet.md)



## 链表
*   [找出两个链表的交点](https://github.com/liangjian66/algo/blob/main/src/GetIntersectionNode.java)
*   [反转链表](https://github.com/liangjian66/algo/blob/main/src/ReverseList.java)
*   [合并两个有序链表](https://github.com/liangjian66/algo/blob/main/src/MergeTwoLists.java)
*   [删除排序链表中的重复元素](https://github.com/liangjian66/algo/blob/main/src/DeleteDuplicates.java)
*   [删除链表的倒数第 N 个结点](https://github.com/liangjian66/algo/blob/main/src/RemoveNthFromEnd.java)
*   [两两交换链表中的节点](https://github.com/liangjian66/algo/blob/main/src/SwapPairs.java)
*   [链表的两数之和](https://github.com/liangjian66/algo/blob/main/src/AddTwoNumbers.java)
*   [回文链表](https://github.com/liangjian66/algo/blob/main/src/IsPalindrome.java)
*   [分割链表](https://github.com/liangjian66/algo/blob/main/src/SplitListToParts.java)
*   [奇偶链表](https://github.com/liangjian66/algo/blob/main/src/OddEvenList.java)


##  字符串
* 无重复字符的最长子串:LengthOfLongestSubstring   滑动窗口
*   [反转字符串](https://github.com/liangjian66/algo/blob/main/src/InversionString.java)

##  算法套路
###  双指针
*   [有序数组的 Two Sum](https://github.com/liangjian66/algo/blob/main/src/SortArrayTwoSum.java)  //    [力扣](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/description/)
*   [两数平方和](https://github.com/liangjian66/algo/blob/main/src/JudgeSquareSum.java)  //    [力扣](https://leetcode-cn.com/problems/sum-of-square-numbers/description/)
*   [反转字符串中的元音字符](https://github.com/liangjian66/algo/blob/main/src/ReverseVowels.java)  //    [力扣](https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/)
*   [回文字符串](https://github.com/liangjian66/algo/blob/main/src/ValidPalindrome.java)  //    [力扣](https://leetcode-cn.com/problems/valid-palindrome-ii/description/)
*   [归并两个有序数组](https://github.com/liangjian66/algo/blob/main/src/MergeTwoSortArray.java)  //    [力扣](https://leetcode-cn.com/problems/merge-sorted-array/description/)
*   [判断链表是否存在环](https://github.com/liangjian66/algo/blob/main/src/HasCycle.java)  //    [力扣](https://leetcode-cn.com/problems/linked-list-cycle/description/)
*   [最长子序列](https://github.com/liangjian66/algo/blob/main/src/FindLongestWord.java)  //    [力扣](https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/description/)

### 排序
*   [数组中的第K个最大元素](https://github.com/liangjian66/algo/blob/main/src/FindKthLargest.java)  //    [力扣](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/description/)
*   [出现频率最多的 k 个元素](https://github.com/liangjian66/algo/blob/main/src/TopKFrequent.java)  //    [力扣](https://leetcode-cn.com/problems/top-k-frequent-elements/description/)
*   [按照字符出现次数对字符串排序](https://github.com/liangjian66/algo/blob/main/src/FrequencySort.java)  //    [力扣](https://leetcode-cn.com/problems/top-k-frequent-elements/description/)
*   [颜色分类](https://github.com/liangjian66/algo/blob/main/src/SortColors.java)  //    [力扣](https://leetcode-cn.com/problems/sort-colors/description/)

### 贪心思想
*   [分发饼干](https://github.com/liangjian66/algo/blob/main/src/FindContentChildren.java)  //    [力扣](https://leetcode-cn.com/problems/assign-cookies/description/)
*   [不重叠的区间个数](https://github.com/liangjian66/algo/blob/main/src/EraseOverlapIntervals.java)  //    [力扣](https://leetcode-cn.com/problems/non-overlapping-intervals/description/)
*   [投飞镖刺破气球](https://github.com/liangjian66/algo/blob/main/src/FindMinArrowShots.java)  //    [力扣](https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/description/)
*   [根据身高和序号重组队列](https://github.com/liangjian66/algo/blob/main/src/ReconstructQueue.java)  //    [力扣](https://leetcode-cn.com/problems/queue-reconstruction-by-height/description/)
*   [买卖股票的最佳时机](https://github.com/liangjian66/algo/blob/main/src/MaxProfit.java)  //    [力扣](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/description/)
*   [买卖股票的最佳时机2 多时段购买](https://github.com/liangjian66/algo/blob/main/src/MaxProfitMoreTime.java)  //    [力扣](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/)
*   [判断子序列](https://github.com/liangjian66/algo/blob/main/src/IsSubsequence.java)  //    [力扣](https://leetcode-cn.com/problems/is-subsequence/description/)
*   [修改一个数成为非递减数组](https://github.com/liangjian66/algo/blob/main/src/CheckPossibility.java)  //    [力扣](https://leetcode-cn.com/problems/non-decreasing-array/description/)
*   [子数组最大的和](https://github.com/liangjian66/algo/blob/main/src/MaxSubArray.java)  //    [力扣](https://leetcode-cn.com/problems/maximum-subarray/description/)
*   [分隔字符串使同种字符出现在一起](https://github.com/liangjian66/algo/blob/main/src/PartitionLabels.java)  //    [力扣](https://leetcode-cn.com/problems/partition-labels/description/)

### 二分查找

*   [二分查找](https://github.com/liangjian66/algo/blob/main/src/HalfSearch.java)  //    [力扣](https://leetcode-cn.com/problems/binary-search/)
*   [求开方](https://github.com/liangjian66/algo/blob/main/src/MySqrt.java)  //    [力扣](https://leetcode-cn.com/problems/sqrtx/description/)
*   [大于给定元素的最小元素](https://github.com/liangjian66/algo/blob/main/src/NextGreatestLetter.java)  //    [力扣](https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/description/)
*   [有序数组的 Single Element](https://github.com/liangjian66/algo/blob/main/src/SingleNonDuplicate.java)  //    [力扣](https://leetcode-cn.com/problems/single-element-in-a-sorted-array/description/)
*   [第一个错误的版本](https://github.com/liangjian66/algo/blob/main/src/FirstBadVersion.java)  //    [力扣](https://leetcode-cn.com/problems/first-bad-version/description/)
*   [旋转数组的最小数字](https://github.com/liangjian66/algo/blob/main/src/FindMin.java)  //    [力扣](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/description/)
*   [查找区间](https://github.com/liangjian66/algo/blob/main/src/SearchRange.java)  //    [力扣](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

### 搜索
*   [计算在网格中从原点到特定点的最短路径长度](https://github.com/liangjian66/algo/blob/main/src/ShortestPathBinaryMatrix.java)  //    [力扣](https://leetcode-cn.com/problems/shortest-path-in-binary-matrix/)
*   [组成整数的最小平方数数量](https://github.com/liangjian66/algo/blob/main/src/NumSquares.java)  //    [力扣](https://leetcode-cn.com/problems/perfect-squares/description/)

### 动态规划
#### 斐波那契数列

*   [爬楼梯](https://github.com/liangjian66/algo/blob/main/src/ClimbStairs.java)  //    [力扣](https://leetcode-cn.com/problems/climbing-stairs/description/)
*   [打家劫舍](https://github.com/liangjian66/algo/blob/main/src/Rob.java)  //    [力扣](https://leetcode-cn.com/problems/house-robber/description/)
*   [强盗在环形街区抢劫-打家劫舍 II](https://github.com/liangjian66/algo/blob/main/src/RobTwo.java)  //    [力扣](https://leetcode-cn.com/problems/house-robber/description/)

#### 矩阵路径
*   [矩阵的最小路径和](https://github.com/liangjian66/algo/blob/main/src/MinPathSum.java)  //    [力扣](https://leetcode-cn.com/problems/minimum-path-sum/description/)
*   [矩阵的总路径数](https://github.com/liangjian66/algo/blob/main/src/UniquePaths.java)  //    [力扣](https://leetcode-cn.com/problems/unique-paths/description/)

#### 数组区间

*   [数组区间和](https://github.com/liangjian66/algo/blob/main/src/NumArray.java)  //    [力扣](https://leetcode-cn.com/problems/range-sum-query-immutable/description/)
*   [数组中等差递增子区间的个数](https://github.com/liangjian66/algo/blob/main/src/NumberOfArithmeticSlices.java)  //    [力扣](https://leetcode-cn.com/problems/arithmetic-slices/description/)

#### 分割整数
*   [分割整数的最大乘积](https://github.com/liangjian66/algo/blob/main/src/IntegerBreak.java)  //    [力扣](https://leetcode-cn.com/problems/integer-break/description/)
*   [按平方数来分割整数](https://github.com/liangjian66/algo/blob/main/src/NumSquares.java)  //    [力扣](https://leetcode-cn.com/problems/perfect-squares/description/)
*   [分割整数构成字母字符串](https://github.com/liangjian66/algo/blob/main/src/NumDecodings.java)  //    [力扣](https://leetcode-cn.com/problems/decode-ways/description/)

#### 最长递增子序列
*   [最长递增子序列](https://github.com/liangjian66/algo/blob/main/src/LengthOfLIS.java)  //    [力扣](https://leetcode-cn.com/problems/longest-increasing-subsequence/description/)
*   [一组整数对能够构成的最长链](https://github.com/liangjian66/algo/blob/main/src/FindLongestChain.java)  //    [力扣](https://leetcode-cn.com/problems/maximum-length-of-pair-chain/description/)
*   [最长摆动子序列](https://github.com/liangjian66/algo/blob/main/src/WiggleMaxLength.java)  //    [力扣](https://leetcode-cn.com/problems/wiggle-subsequence/description/)

#### 最长公共子序列
*   [最长公共子序列](https://github.com/liangjian66/algo/blob/main/src/LongestCommonSubsequence.java)  //    [力扣](https://leetcode-cn.com/problems/longest-common-subsequence/)

####  01背包

*   [零钱兑换322](https://github.com/liangjian66/algo/blob/main/src/CoinChange.java)  //    [力扣](https://leetcode-cn.com/problems/coin-change/) ： 题解： 动态规划 求F(11)最优解 ，求出F(10)+1   求出F(9)+1
*   [0-1背包](https://github.com/liangjian66/algo/blob/main/src/Knapsack.java)
*   [划分数组为和相等的两部分](https://github.com/liangjian66/algo/blob/main/src/CanPartition.java)  //    [力扣](https://leetcode-cn.com/problems/partition-equal-subset-sum/description/)
*   [改变一组数的正负号使得它们的和为一给定数](https://github.com/liangjian66/algo/blob/main/src/FindTargetSumWays.java)  //    [力扣](https://leetcode-cn.com/problems/target-sum/description/)
*   [01 字符构成最多的字符串](https://github.com/liangjian66/algo/blob/main/src/FindMaxForm.java)  //    [力扣](https://leetcode-cn.com/problems/ones-and-zeroes/description/)
*   [找零钱的最少硬币数](https://github.com/liangjian66/algo/blob/main/src/CoinChangeTwoVersions.java)  //    [力扣](https://leetcode-cn.com/problems/coin-change/description/)
*   [找零钱的硬币数组合](https://github.com/liangjian66/algo/blob/main/src/Change.java)  //    [力扣](https://leetcode-cn.com/problems/coin-change-2/description/)
*   [字符串按单词列表分割](https://github.com/liangjian66/algo/blob/main/src/WordBreak.java)  //    [力扣](https://leetcode-cn.com/problems/word-break/description/)
*   [组合总和](https://github.com/liangjian66/algo/blob/main/src/CombinationSum4.java)  //    [力扣](https://leetcode-cn.com/problems/combination-sum-iv/description/)

####  股票交易
*   [需要冷却期的股票交易](https://github.com/liangjian66/algo/blob/main/src/MaxProfitTwo.java)  //    [力扣](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/)
*   [需要交易费用的股票交易](https://github.com/liangjian66/algo/blob/main/src/MaxProfitFee.java)  //    [力扣](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/)
*   [只能进行两次的股票交易](https://github.com/liangjian66/algo/blob/main/src/MaxProfitTwoTime.java)  //    [力扣](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/)
*   [只能进行 k 次的股票交易](https://github.com/liangjian66/algo/blob/main/src/MaxProfitWithK.java)  //    [力扣](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/)

####  字符串编辑
*   [删除两个字符串的字符使它们相等](https://github.com/liangjian66/algo/blob/main/src/MinDistance.java)  //    [力扣](https://leetcode-cn.com/problems/delete-operation-for-two-strings/description/)
*   [删除两个字符串的字符使它们相等](https://github.com/liangjian66/algo/blob/main/src/MinDistance.java)  //    [力扣](https://leetcode-cn.com/problems/delete-operation-for-two-strings/description/)


####  接雨水
*   [接雨水](https://github.com/liangjian66/algo/blob/main/src/Trap.java)   // [力扣](https://leetcode-cn.com/problems/trapping-rain-water/solution/jie-yu-shui-by-xiao-sheng-tong-xue-gs4z/)  //    [牛客](https://blog.nowcoder.net/n/724b3c546234447d8dca14cdc597c6f9)




##  算法题解
*  三数之和:ThreeNum 主要思路： 1.先排序 2.遍历每一个元素 3. 使用双指针
*  股票问题:StockProfit  如何获得最大收益  思路： 记录最小值 ，差值较大的覆盖之前的
*  缓存淘汰算法:  LruCache  维护一个双向链表 ，一个hashMap  核心使用双链表记录最近使用和最久未使用的元素  ，若容量已满，淘汰最久未使用的key
*  最小栈的实现  ： MinStack  加一个辅助栈记录最小值  辅助很重要
*  寻找两个数之和: FindSumNumbers 先构建map 然后再遍历
*  数组中的第k个最大元素：KthlargestNumber   题解： 1. 把数组的前K个元素构建成最小堆 2.下沉操作保持堆的有效性
*  用栈实现队列 :MyQuene     解题： 将一个栈当作输入栈，用于压入 \texttt{push}push 传入的数据；另一个栈当作输出栈
*  寻找全排列的下一个数子： DictOrderAlgo 1. 从后向前查看逆序区域 ，找到逆序区域的前一位， 也就是数字置换的边界
   2. 让逆序区域的前一位和逆序区域中大于他的最小的数字交换位置
   3. 把原来的逆序区域转为顺序状态

*  删除K个数字的最小值： RemoveKDigits 题解： 简化问题：如果只删除一个数字 ，如何让新整数的值最小 找出降序数字删除
*  字符串匹配算法（RK算法）：RabinKarp 题解： 比较两个字符串的hash
*  KMP算法： Kmp  题解： KMP算法的整体思路：在已匹配的前缀当中寻找最长可匹配后缀子串和最长可匹配前缀子串 ，在下一轮直接把两者对齐，从而实现模式串的快速移动
*  迪杰斯特拉 ： Dijkstra  思路： 维护一个距离表， 标记是否最短距离 ，动态规划更新最短距离表
*   [LRU缓存机制](https://github.com/liangjian66/algo/blob/main/src/LRUCacheTwo.java)    // [力扣](https://leetcode-cn.com/problems/lru-cache/solution/lruhuan-cun-ji-zhi-by-xiao-sheng-tong-xu-2om1/)  [牛客](https://blog.nowcoder.net/n/b71f0073b13a48eeb45fe810595a4f32)
*   [合并两个有序数组](https://github.com/liangjian66/algo/blob/main/src/TwoArrayMerge.java)    // [牛客](https://blog.nowcoder.net/n/655fa33cff9f465fa5380d3d4c22afb6)



## 剑指offer
####  剑指offer-数据结构
*   [面试题3 数组中重复的数字03：FindRepeatNumber](https://github.com/liangjian66/algo/blob/main/src/FindRepeatNumber.java)
*   [面试题4   二维数组中的查找 ： TwoVeidooArrayFind   其实就是矩阵 ，以及坐标  i，j看成坐标， 用坐标系求解](https://github.com/liangjian66/algo/blob/main/src/TwoVeidooArrayFind.java)
*   [面试题5  替换空格  ReplaceSpace](https://github.com/liangjian66/algo/blob/main/src/ReplaceSpace.java)
*   [面试题06. 从尾到头打印链表 ReversePrint](https://github.com/liangjian66/algo/blob/main/src/ReversePrint.java)
*   [面试题18.  删除链表的节点：DeleteNode  题解： 双指针解法 ](https://github.com/liangjian66/algo/blob/main/src/DeleteNode.java)
*   [面试题22.  链表中倒数第K节点：KthFromEnd  题解： 双指针解法 ](https://github.com/liangjian66/algo/blob/main/src/KthFromEnd.java)
*   [面试题24.  单链表反转 ReverseList](https://github.com/liangjian66/algo/blob/main/src/ReverseList.java)
*   [面试题25：合并两个排序的链表 MergeTwoLists](https://github.com/liangjian66/algo/blob/main/src/MergeTwoLists.java)
#### 剑指offer-二叉树
*   [面试题7：重建二叉树](https://github.com/liangjian66/algo/blob/main/src/MyBuildTree.java)
*   [面试题8：二叉树的下一个节点](https://github.com/liangjian66/algo/blob/main/src/GetNext.java)

*   [面试题9：用两个栈实现队列](https://github.com/liangjian66/algo/blob/main/src/CQueue.java)
#### 剑指offer-动态规划
*   [面试题10：斐波那契数列](https://github.com/liangjian66/algo/blob/main/src/Fibonacci.java)
#### 剑指offer-查找和排序
*   [面试题11：旋转数组的最小数字](https://github.com/liangjian66/algo/blob/main/src/RevolveArray.java)

#### 剑指offer-回朔法
*   [面试题12：矩阵中的路径](https://github.com/liangjian66/algo/blob/main/src/HasPath.java)
*   [面试题14：剪绳子](https://github.com/liangjian66/algo/blob/main/src/MaxProductAfter.java)
*   [面试题15：二进制中1的个数](https://github.com/liangjian66/algo/blob/main/src/HammingWeight.java)

#### 剑指offer

*   [面试题27:二叉树的镜像](https://github.com/liangjian66/algo/blob/main/src/BinaryTreeNode.java)
*   [面试题28:对称的二叉树](https://github.com/liangjian66/algo/blob/main/src/IsSymmetrical.java)
*   [面试题30:包含min函数的栈](https://github.com/liangjian66/algo/blob/main/src/StackWithMin.java)
*   [面试题31:栈的压入，弹出序列](https://github.com/liangjian66/algo/blob/main/src/StackPushPopOrder.java)
*   [面试题32:从上到下打印二叉树](https://github.com/liangjian66/algo/blob/main/src/PrintFromToBottom.java)
*   [面试题33: 二叉搜索树的后序遍历序列](https://github.com/liangjian66/algo/blob/main/src/VerifySquenceOfBST.java)
*   [面试题34: 二叉树中和为某一值的路径](https://github.com/liangjian66/algo/blob/main/src/PathInTree.java)
*   [面试题36: 二叉搜索树与双向链表](https://github.com/liangjian66/algo/blob/main/src/TreeToDoublyList.java)
*   [面试题38: 字符串的排列](https://github.com/liangjian66/algo/blob/main/src/StringPermutation.java)

*   [面试题40: 最小的K个数](https://github.com/liangjian66/algo/blob/main/src/GetLeastNumbers.java)
*   [面试题40: 连续子数组的最大和](https://github.com/liangjian66/algo/blob/main/src/GetSumOfSubArray.java)
*   [面试题45: 把数组排成最小的数](https://github.com/liangjian66/algo/blob/main/src/PrintMinNumber.java)
*   [面试题46: 把数字翻译成字符串](https://github.com/liangjian66/algo/blob/main/src/GetTranslationCount.java)
*   [面试题47: 礼物的最大价值](https://github.com/liangjian66/algo/blob/main/src/GetMaxValue.java)
*   [面试题48: 最长不含重复字符的子字符串](https://github.com/liangjian66/algo/blob/main/src/LongestSubstringWithoutDup.java)
*   [面试题50: 第一个只出现一次的字符](https://github.com/liangjian66/algo/blob/main/src/FirstNotRepeatingChar.java)

*   [面试题51:   数组中的逆序对](https://github.com/liangjian66/algo/blob/main/src/InversePairs.java)

*   [面试题52：两个链表的第一个公共节点 ](https://github.com/liangjian66/algo/blob/main/src/GetIntersectionNode.java)
*   [面试题53：在排序数组中查找数字](https://github.com/liangjian66/algo/blob/main/src/GetFirstK.java)
*   [面试题54：二叉搜索树的第K大节点](https://github.com/liangjian66/algo/blob/main/src/KthNode.java)
*   [面试题55：二叉树的深度](https://github.com/liangjian66/algo/blob/main/src/TreeDepth.java)
*   [面试题56：数组中数字出现的次数](https://github.com/liangjian66/algo/blob/main/src/FindNumsAppearOnce.java)
*   [面试题57：和为s的数字](https://github.com/liangjian66/algo/blob/main/src/FindNumbersWithSum.java)
*   [面试题58：翻转转字符串- 翻转单词顺序](https://github.com/liangjian66/algo/blob/main/src/ReverseWordsInSentence.java)
*   [面试题59：队列的最大值  MaxQueue](https://github.com/liangjian66/algo/blob/main/src/MaxInSlidingWindow.java)
*   [面试题60：n个骰子的点数](https://github.com/liangjian66/algo/blob/main/src/DicesProbability.java)
*   [面试题61：扑克牌中的顺子](https://github.com/liangjian66/algo/blob/main/src/IsContinuous.java)
*   [面试题62：圆圈中最后剩下的数字](https://github.com/liangjian66/algo/blob/main/src/LastRemaining.java)
*   [面试题63：股票的最大利润](https://github.com/liangjian66/algo/blob/main/src/MaxDiff.java)

*   [面试题67：把字符串转换成整数](https://github.com/liangjian66/algo/blob/main/src/StrToInt.java)
*   [面试题68：树中两个节点的最低公共祖先](https://github.com/liangjian66/algo/blob/main/src/GetLastCommonParent.java)




## 程序员代码面试指南左程云
###  第一章栈和队列
*   [设计一个有getMin功能的栈](https://github.com/liangjian66/algo/blob/main/src/GetMinNumberStack.java)  //    [力扣](https://leetcode-cn.com/problems/min-stack/)
*   [由两个栈组成队列](https://github.com/liangjian66/algo/blob/main/src/CQueue.java)  //    [力扣](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/)
*   [如何仅用递归函数和栈操作逆序一个栈](https://github.com/liangjian66/algo/blob/main/src/ReverseStackWithRecursion.java)  //   
*   [用一个栈实现另一个栈的排序-栈排序](https://github.com/liangjian66/algo/blob/main/src/SortedStack.java)  //  [力扣](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/)
*   [生成窗口最大值数组](https://github.com/liangjian66/algo/blob/main/src/MaxSlidingWindow.java)  //  [力扣](https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/)

###  第二章链表问题

*   [两个链表的第一个公共节点](https://github.com/liangjian66/algo/blob/main/src/GetIntersectionNode.java)  //  [力扣](https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/)
*   [链表中倒数第k个节点](https://github.com/liangjian66/algo/blob/main/src/GetKthFromEnd.java)  //  [力扣](https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)
*   [回文链表](https://github.com/liangjian66/algo/blob/main/src/IsPalindrome.java)  //  [力扣](https://leetcode-cn.com/problems/aMhZSa/submissions/)
*   [移除重复节点](https://github.com/liangjian66/algo/blob/main/src/RemoveDuplicateNodes.java)  //  [力扣](https://leetcode-cn.com/problems/remove-duplicate-node-lcci/)
*   [在单链表中删除指定值的节点](https://github.com/liangjian66/algo/blob/main/src/DeleteNodeTwo.java)  //  [力扣](https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/)
*   [将搜索二叉树转换成双向链表](https://github.com/liangjian66/algo/blob/main/src/TreeToDoublyListTwo.java)  //  [力扣](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/)
*   [排序链表](https://github.com/liangjian66/algo/blob/main/src/SortList.java)  //  [力扣](https://leetcode-cn.com/problems/sort-list/)
*   [向有序的环形单链表中插入新节点](https://github.com/liangjian66/algo/blob/main/src/InsertNum.java)  //  
*   [删除链表的倒数第 n 个结点](https://github.com/liangjian66/algo/blob/main/src/RemoveNthFromEndTwo.java)  //  [力扣](https://leetcode-cn.com/problems/SLwz0R/)
*   [合并两个排序的链表](https://github.com/liangjian66/algo/blob/main/src/mergeTwoLists.java)  //  [力扣](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)



###  第三章二叉树问题

*   [实现二叉树先序，中序和后序遍历](https://github.com/liangjian66/algo/blob/main/src/ThreeOrders.java)    // [牛客](https://blog.nowcoder.net/n/7e9aa11dcc3841b48a5891bf572e09e5)
*   [二叉树的最小深度](https://github.com/liangjian66/algo/blob/main/src/minDepth.java)    // [力扣](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/solution/er-cha-shu-de-zui-xiao-shen-du-by-xiao-s-d8dz/)  
*   [二叉树的最大深度](https://github.com/liangjian66/algo/blob/main/src/maxDepth.java)    // [力扣](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/)   // [牛客](https://blog.nowcoder.net/n/4aef55d2d47f4908b72162424f398547)
*   [二叉树中和为某一值的路径](https://github.com/liangjian66/algo/blob/main/src/PathSum.java)    // [力扣](https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/solution/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-woxs/)   // [牛客](https://blog.nowcoder.net/n/4f4628aa0c6d4763955228ca6019d561)
*   [二叉搜索树中两个节点之和](https://github.com/liangjian66/algo/blob/main/src/FindTarget.java)    // [力扣](https://leetcode-cn.com/problems/opLdQZ/)   
*   [二叉树的锯齿形层序遍历](https://github.com/liangjian66/algo/blob/main/src/ZigzagLevelOrder.java)    // [力扣](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)
*   [平衡二叉树](https://github.com/liangjian66/algo/blob/main/src/IsBalanced.java)    // [力扣](https://leetcode-cn.com/problems/balanced-binary-tree/)    // [牛客](https://blog.nowcoder.net/n/c773b692c9924f74af981cda0baa4053)
*   [重建二叉树](https://github.com/liangjian66/algo/blob/main/src/MyBuildTreeTwo.java)    // [力扣](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/)    // [牛客](https://blog.nowcoder.net/n/befdc39215e54b25849590aed02c9ba8)
*   [二叉搜索树的后序遍历序列](https://github.com/liangjian66/algo/blob/main/src/VerifyPostorder.java)    // [力扣](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/)    // [牛客](https://blog.nowcoder.net/n/0a43680db9694eb3a3c505e031eb63a9)

*   [将有序数组转换为二叉搜索树](https://github.com/liangjian66/algo/blob/main/src/sortedArrayToBST.java)    // [力扣](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/)    

*   [后继者：设计一个算法，找出二叉搜索树中指定节点的“下一个”节点（也即中序后继）](https://github.com/liangjian66/algo/blob/main/src/inorderSuccessor.java)    

*   [二叉搜索树的后序遍历序列](https://github.com/liangjian66/algo/blob/main/src/VerifyPostorder.java)    // [力扣](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/)    // [牛客](https://blog.nowcoder.net/n/0a43680db9694eb3a3c505e031eb63a9)
*   [二叉树的最近公共祖先](https://github.com/liangjian66/algo/blob/main/src/LowestCommonAncestorTwo.java)    // [力扣](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/solution/zai-er-cha-shu-zhong-zhao-dao-liang-ge-j-6c6p/)    // [牛客](https://blog.nowcoder.net/n/000874999ec64d61828adf6b66a11095)
*   [按之字形顺序打印二叉树](https://github.com/liangjian66/algo/blob/main/src/ZigzagLevelOrderTwo.java)    // [力扣](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/solution/zai-er-cha-shu-zhong-zhao-dao-liang-ge-j-6c6p/)    // [牛客](https://blog.nowcoder.net/n/b90e81b810904fe4aaba7b02a3416ad1)
*   [二叉树的镜像](https://github.com/liangjian66/algo/blob/main/src/mirrorTree.java)    // [力扣](https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/solution/jing-xiang-by-xiao-sheng-tong-xue-zvrr/)    // [牛客](https://blog.nowcoder.net/n/e2fdf65748fc42e3b71777c9aa46c825)
*   [二叉树的层序遍历 II](https://github.com/liangjian66/algo/blob/main/src/LevelOrderBottom.java)    // [力扣](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/solution/er-cha-shu-de-ceng-xu-bian-li-ii-by-xiao-iyf5/)  
*   [二叉树的所有路径](https://github.com/liangjian66/algo/blob/main/src/BinaryTreePaths.java)    // [力扣](https://leetcode-cn.com/problems/binary-tree-paths/solution/er-cha-shu-de-suo-you-lu-jing-by-xiao-sh-uwm4/)

###  第四章递归和动态规划

####递推三部曲
```
递推三部曲
* 1. 边界条件
* 2. 递推公式
* 3. dp数组取值
* 套路 ； dp[i][j]  往往依赖  dp[i][i-1]  dp[i-1][j]  dp[i-1][j-1]  只要是动态规划就依赖这三个
```

*   [斐波那契数列](https://github.com/liangjian66/algo/blob/main/src/FibTwo.java)    // [力扣](https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/)   
*   [最小路径之和](https://github.com/liangjian66/algo/blob/main/src/MinPathSumTwo.java)    // [力扣](https://leetcode-cn.com/problems/0i0mDW/)
*   [换钱的最少货币数](https://github.com/liangjian66/algo/blob/main/src/CoinChangeTwo.java)    // [力扣](https://leetcode-cn.com/problems/coin-change/)
*   [不同路径 II  有障碍物](https://github.com/liangjian66/algo/blob/main/src/UniquePathsWithObstacles.java)    // [力扣](https://leetcode-cn.com/problems/unique-paths-ii/solution/bu-tong-lu-jing-ii-you-zhang-ai-wu-by-xi-kjz2/)
*   [零钱兑换 II](https://github.com/liangjian66/algo/blob/main/src/ChangeTwo.java)    // [力扣](https://leetcode-cn.com/problems/unique-paths-ii/solution/bu-tong-lu-jing-ii-you-zhang-ai-wu-by-xi-kjz2/)  请你计算并返回可以凑成总金额的硬币组合数
*   [最长递增子序列](https://github.com/liangjian66/algo/blob/main/src/LengthOfLISTwo.java)    // [力扣](https://leetcode-cn.com/problems/longest-increasing-subsequence/)  
*   [最长公共子序列](https://github.com/liangjian66/algo/blob/main/src/LongestCommonSubsequenceTwo.java)    // [力扣](https://leetcode-cn.com/problems/longest-common-subsequence/)
*   [最长公共子串问题](https://github.com/liangjian66/algo/blob/main/src/LCS.java)    // [牛客](https://blog.nowcoder.net/n/53f3f20588854055aafc75022387b8b9)
*   [最小编辑代价](https://github.com/liangjian66/algo/blob/main/src/MinEditCost.java)    // [牛客](https://blog.nowcoder.net/n/f8f2ac69d4804aaab1d1ee8c53df049c)
*   [字符串的交错组成](https://github.com/liangjian66/algo/blob/main/src/IsInterleave.java)    // [力扣](https://leetcode-cn.com/problems/interleaving-string/solution/zi-fu-chuan-de-jiao-cuo-zu-cheng-by-xiao-i1r1/)
*   [龙与地下城游戏问题](https://github.com/liangjian66/algo/blob/main/src/CalculateMinimumHP.java)    // [力扣](https://leetcode-cn.com/problems/dungeon-game/)
*   [把数字翻译成字符串](https://github.com/liangjian66/algo/blob/main/src/TranslateNum.java)    // [力扣](https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/solution/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-by-xi-2pe8/)
*   [跳跃游戏](https://github.com/liangjian66/algo/blob/main/src/CanJump.java)    // [力扣](https://leetcode-cn.com/problems/jump-game/solution/tiao-yue-you-xi-by-xiao-sheng-tong-xue-5yj0/)
*   [最长连续序列](https://github.com/liangjian66/algo/blob/main/src/LongestConsecutive.java)    // [力扣](https://leetcode-cn.com/problems/longest-consecutive-sequence/)

####  回溯
*   [N皇后问题](https://github.com/liangjian66/algo/blob/main/src/SolveNQueens.java)    // [力扣](https://leetcode-cn.com/problems/n-queens/)
*   [全排列](https://github.com/liangjian66/algo/blob/main/src/Permute.java)    // [力扣](https://leetcode-cn.com/problems/permutations/solution/quan-pai-lie-wen-ti-by-xiao-sheng-tong-x-s7ax/)
*   [组合总和](https://github.com/liangjian66/algo/blob/main/src/CombinationSum.java)    // [力扣](https://leetcode-cn.com/problems/combination-sum/solution/zu-he-zong-he-by-xiao-sheng-tong-xue-1l7e/)
*   [组合](https://github.com/liangjian66/algo/blob/main/src/Combine.java)    // [力扣](https://leetcode-cn.com/problems/combinations/solution/zu-he-by-xiao-sheng-tong-xue-29jh/)
*   [KMP](https://github.com/liangjian66/algo/blob/main/src/KMPTwo.java)    // [力扣](https://leetcode-cn.com/problems/implement-strstr/solution/kmp-by-xiao-sheng-tong-xue-etng/)

###  第五章字符串问题
*   [判断两个字符串是否互为变形词](https://github.com/liangjian66/algo/blob/main/src/IsDeformation.java)    
*   [判断两个字符串是否互为旋转词](https://github.com/liangjian66/algo/blob/main/src/RotateString.java)   // [力扣](https://leetcode-cn.com/problems/rotate-string/)
*   [字符串转换成整数](https://github.com/liangjian66/algo/blob/main/src/MyAtoi.java)   // [力扣](https://leetcode-cn.com/problems/string-to-integer-atoi/)
*   [比较版本号](https://github.com/liangjian66/algo/blob/main/src/CompareVersion.java)   // [力扣](https://leetcode-cn.com/problems/compare-version-numbers/solution/ban-ben-hao-bi-jiao-by-xiao-sheng-tong-x-jupf/)
*   [判断字符数组中是否所有的字符都只出现过一次](https://github.com/liangjian66/algo/blob/main/src/IsUniquel.java)   // [力扣](https://leetcode-cn.com/problems/compare-version-numbers/solution/ban-ben-hao-bi-jiao-by-xiao-sheng-tong-x-jupf/)
*   [ 翻转字符串里的单词](https://github.com/liangjian66/algo/blob/main/src/ReverseWords.java)   // [力扣](https://leetcode-cn.com/problems/reverse-words-in-a-string/solution/fan-zhuan-zi-fu-zhuan-by-xiao-sheng-tong-s13v/)
*   [最长不重复子字符串](https://github.com/liangjian66/algo/blob/main/src/LengthOfLongestSubstringTwo.java)   // [力扣](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/zui-chang-bu-zhong-fu-zi-zi-fu-chuan-by-x7m91/)  //  [牛客](https://blog.nowcoder.net/n/e69655f356c54c2d9044e978bed2ab5f)
*   [最长公共前缀](https://github.com/liangjian66/algo/blob/main/src/LongestCommonPrefix.java)   // [力扣](https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-chang-gong-gong-qian-zhui-by-xiao-sh-8j5k/)  
*   [最长回文子串](https://github.com/liangjian66/algo/blob/main/src/LongestPalindrome.java)   // [力扣](https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zui-chang-hui-wen-zi-chuan-by-xiao-sheng-9cko/)
*   [数组中两个字符串的最小距离](https://github.com/liangjian66/algo/blob/main/src/ArrayStrMinDistance.java)   // [力扣](https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zui-chang-hui-wen-zi-chuan-by-xiao-sheng-9cko/)
*   [编辑距离](https://github.com/liangjian66/algo/blob/main/src/MinDistanceTwo.java)   // [力扣](https://leetcode-cn.com/problems/edit-distance/solution/bian-ji-ju-chi-by-xiao-sheng-tong-xue-jz62/)
*   [字典树（前缀树）的实现](https://github.com/liangjian66/algo/blob/main/src/TrieTree.java)   // [力扣](https://leetcode-cn.com/problems/implement-trie-prefix-tree/)

### 第七章位运算
*   [二进制加法](https://github.com/liangjian66/algo/blob/main/src/AddBinary.java)   // [力扣](https://leetcode-cn.com/problems/JFETK5/solution/wei-yun-suan-shi-xian-jia-fa-by-xiao-she-iwcl/)
*   [不用加减乘除做加法](https://github.com/liangjian66/algo/blob/main/src/AddTwo.java)   // [力扣](https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/solution/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-by-t6in/)
*   [只出现一次的数字](https://github.com/liangjian66/algo/blob/main/src/SingleNumber.java)   // [力扣](https://leetcode-cn.com/problems/single-number/)


### 第八章数组和矩阵问题
*   [转圈打印矩阵](https://github.com/liangjian66/algo/blob/main/src/SpiralOrder.java)   // [力扣](https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/solution/zhuan-quan-da-yin-ju-zhen-by-xiao-sheng-mvq9a/)
*   [旋转图像](https://github.com/liangjian66/algo/blob/main/src/RotateMatrix.java)   // [力扣](https://leetcode-cn.com/problems/rotate-image/solution/ju-zhen-shun-shi-zhuan-dong-by-xiao-shen-a2jo/)
*   [Z字形变化](https://github.com/liangjian66/algo/blob/main/src/Convert.java)   // [力扣](https://leetcode-cn.com/problems/zigzag-conversion/solution/zzi-xing-bian-hua-by-xiao-sheng-tong-xue-ubdl/)
*   [最短无序连续子数组](https://github.com/liangjian66/algo/blob/main/src/FindUnsortedSubarray.java)   // [力扣](https://leetcode-cn.com/problems/zigzag-conversion/solution/zzi-xing-bian-hua-by-xiao-sheng-tong-xue-ubdl/)
*   [二维数组中的查找](https://github.com/liangjian66/algo/blob/main/src/FindNumberIn2DArrayTwo.java)   // [力扣](https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)
*   [长度最小的子数组](https://github.com/liangjian66/algo/blob/main/src/MinSubArrayLen.java)   // [力扣](https://leetcode-cn.com/problems/minimum-size-subarray-sum/solution/chang-du-zui-xiao-de-zi-shu-zu-by-xiao-s-cby7/)
*   [删除排序数组中的重复项](https://github.com/liangjian66/algo/blob/main/src/RemoveDuplicates.java)   // [力扣](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-4mee/)
*   [按奇偶排序数组 II](https://github.com/liangjian66/algo/blob/main/src/SortArrayByParityII.java)   // [力扣](https://leetcode-cn.com/problems/sort-array-by-parity-ii/)
*   [在数组中找到一个局部最小的位置](https://github.com/liangjian66/algo/blob/main/src/GetLessIndex.java)   // [力扣](https://leetcode-cn.com/problems/sort-array-by-parity-ii/)
*   [乘积最大子数组](https://github.com/liangjian66/algo/blob/main/src/MaxProduct.java)   // [力扣](https://leetcode-cn.com/problems/maximum-product-subarray/solution/cheng-ji-zui-da-zi-shu-zu-by-xiao-sheng-yo4u4/)
*   [盛最多水的容器](https://github.com/liangjian66/algo/blob/main/src/MaxArea.java)   // [力扣](https://leetcode-cn.com/problems/container-with-most-water/solution/rong-qi-sheng-shui-wen-ti-by-xiao-sheng-rfko7/)


##  算法通关之路 

### 第一章预备知识 

### 第二章数学之美
*   [两数之和](https://github.com/liangjian66/algo/blob/main/src/TwoSum.java)   // [力扣](https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-xiao-sheng-tong-xue-ia86/)
*   [三数之和](https://github.com/liangjian66/algo/blob/main/src/ThreeSum.java)   // [力扣](https://leetcode-cn.com/problems/3sum/solution/san-shu-zhi-he-by-xiao-sheng-tong-xue-hadc/)
*   [最大子序和](https://github.com/liangjian66/algo/blob/main/KongFu/53.最大子序和.java)   // [力扣](https://leetcode-cn.com/problems/3sum/solution/san-shu-zhi-he-by-xiao-sheng-tong-xue-hadc/)
*   [最大数](https://github.com/liangjian66/algo/blob/main/KongFu/179.最大数.java)   // [力扣](https://leetcode-cn.com/problems/largest-number/solution/zui-da-shu-by-xiao-sheng-tong-xue-zj2y/)
*   [两数相加](https://github.com/liangjian66/algo/blob/main/KongFu/2.两数相加.java)   // [力扣](https://leetcode-cn.com/problems/add-two-numbers/solution/liang-shu-xiang-jia-by-xiao-sheng-tong-x-vvbk/)
*   [368.最大整除子集](https://github.com/liangjian66/algo/blob/main/KongFu/368.最大整除子集.java)   // [力扣](https://leetcode-cn.com/problems/largest-divisible-subset/solution/zui-da-zheng-chu-zi-ji-by-xiao-sheng-ton-toqz/)
*   [7.整数反转](https://github.com/liangjian66/algo/blob/main/KongFu/7.整数反转.java)   // [力扣](https://leetcode-cn.com/problems/largest-divisible-subset/solution/zui-da-zheng-chu-zi-ji-by-xiao-sheng-ton-toqz/)

### 第三章回文的艺术
> 发现规律 算法核心   有什么条件 要达到什么目的 例如：回文字符串要求是正读反读结果都是一样的句子 隐含条件 偶数个字符的话 每个字符都是成对出现的  奇数字符的话 只有一个字符是单独一个的 ， 其他字符都是成对出现的
*   [409.最长回文串](https://github.com/liangjian66/algo/blob/main/KongFu/409.最长回文串.java)   // [力扣](https://leetcode-cn.com/problems/longest-palindrome/solution/zui-chang-hui-wen-chuan-by-xiao-sheng-to-cfgl/)
*   [234.回文链表](https://github.com/liangjian66/algo/blob/main/KongFu/234.回文链表.java)   // [力扣](https://leetcode-cn.com/problems/palindrome-linked-list/solution/hui-wen-lian-biao-by-xiao-sheng-tong-xue-lefa/)
*   [680.验证回文字符串-ⅱ.java](https://github.com/liangjian66/algo/blob/main/KongFu/680.验证回文字符串-ⅱ.java)   // [力扣](https://leetcode-cn.com/problems/valid-palindrome-ii/solution/yan-zheng-hui-wen-zi-fu-chuan-by-xiao-sh-87rl/)
*   [5.最长回文子串.java](https://github.com/liangjian66/algo/blob/main/KongFu/5.最长回文子串.java)   // [力扣-中心扩散法](https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zui-chang-hui-wen-zi-chuan-by-xiao-sheng-r6nv/) // [力扣-动态规划法](https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zui-chang-hui-wen-zi-chuan-by-xiao-sheng-k487/)
*   [516.最长回文子序列.java](https://github.com/liangjian66/algo/blob/main/KongFu/516.最长回文子序列.java)   // [力扣-动态规划法](https://leetcode-cn.com/problems/longest-palindromic-subsequence/solution/zui-chang-hui-wen-zi-xu-lie-by-xiao-shen-z11x/) 
*   [647.回文子串.java](https://github.com/liangjian66/algo/blob/main/KongFu/647.回文子串.java)   // [力扣-动态规划法](https://leetcode-cn.com/problems/palindromic-substrings/solution/hui-wen-zi-chuan-by-xiao-sheng-tong-xue-t721/)

### 第四章游戏之乐
*   [38.外观数列.java](https://github.com/liangjian66/algo/blob/main/KongFu/38.外观数列.java)   // [力扣](https://leetcode-cn.com/problems/count-and-say/solution/wai-guan-shu-lie-by-xiao-sheng-tong-xue-w92s/)


### 第五章深度优先遍历和广度优先遍历
*  [112. 路径总和](https://github.com/liangjian66/algo/blob/main/src/HasPathSum.java)    [力扣](https://leetcode-cn.com/problems/path-sum/solution/lu-jing-zhi-he-by-xiao-sheng-tong-xue-gilp/)
*   [113.路径总和-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/113.路径总和-ii.java)   // [力扣](https://leetcode-cn.com/problems/path-sum-ii/solution/lu-jing-zong-he-by-xiao-sheng-tong-xue-vov3/)
*   [124.二叉树中的最大路径和.java](https://github.com/liangjian66/algo/blob/main/KongFu/124.二叉树中的最大路径和.java)   // [力扣](https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/solution/zui-da-lu-jing-by-xiao-sheng-tong-xue-4miw/)
*   [200.岛屿数量.java](https://github.com/liangjian66/algo/blob/main/KongFu/200.岛屿数量.java)   // [力扣](https://leetcode-cn.com/problems/number-of-islands/solution/dao-yu-shu-liang-by-xiao-sheng-tong-xue-h0lw/)

### 第六章二分查找

*   [704.二分查找.java](https://github.com/liangjian66/algo/blob/main/KongFu/704.二分查找.java)  


### 第七章位运算
*   [191.位-1-的个数.java](https://github.com/liangjian66/algo/blob/main/KongFu/191.位-1-的个数.java)
*   [371.两整数之和.java](https://github.com/liangjian66/algo/blob/main/KongFu/371.两整数之和.java)
*   [136.只出现一次的数字.java](https://github.com/liangjian66/algo/blob/main/KongFu/136.只出现一次的数字.java)

### 第八章设计
*   [155.最小栈.java](https://github.com/liangjian66/algo/blob/main/KongFu/155.最小栈.java)
*   [208.实现-trie-前缀树.java](https://github.com/liangjian66/algo/blob/main/KongFu/208.实现-trie-前缀树.java)
*   [LRU缓存机制](https://github.com/liangjian66/algo/blob/main/src/LRUCacheTwo.java)    // [力扣](https://leetcode-cn.com/problems/lru-cache/solution/lruhuan-cun-ji-zhi-by-xiao-sheng-tong-xu-2om1/)  [牛客](https://blog.nowcoder.net/n/b71f0073b13a48eeb45fe810595a4f32)
*   [460.lfu-缓存.java](https://github.com/liangjian66/algo/blob/main/KongFu/460.lfu-缓存.java)  //[力扣](https://leetcode-cn.com/problems/lfu-cache/solution/lfuhuan-cun-tao-tai-suan-fa-by-xiao-shen-zffx/)

### 第九章双指针
*   [167.两数之和-ii-输入有序数组.java](https://github.com/liangjian66/algo/blob/main/KongFu/167.两数之和-ii-输入有序数组.java)
*   [11.盛最多水的容器.java](https://github.com/liangjian66/algo/blob/main/KongFu/11.盛最多水的容器.java)
*   [3.无重复字符的最长子串.java](https://github.com/liangjian66/algo/blob/main/KongFu/3.无重复字符的最长子串.java)  // [力扣题解-双指针-滑动窗口](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-vzvmc/)

### 第十章动态规划

*   [70.爬楼梯.java](https://github.com/liangjian66/algo/blob/main/KongFu/70.爬楼梯.java)
*   [198.打家劫舍.java](https://github.com/liangjian66/algo/blob/main/KongFu/198.打家劫舍.java)
*   [213.打家劫舍-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/213.打家劫舍-ii.java)     // [力扣题解-动态规划](https://leetcode-cn.com/problems/house-robber-ii/solution/da-jia-jie-she-ii-by-xiao-sheng-tong-xue-82wp/)
*   [337.打家劫舍-iii.java](https://github.com/liangjian66/algo/blob/main/KongFu/337.打家劫舍-iii.java)     // [力扣题解-动态规划](https://leetcode-cn.com/problems/house-robber-iii/solution/da-jia-jie-she-iii-by-xiao-sheng-tong-xu-l558/)
*   [322.零钱兑换.java](https://github.com/liangjian66/algo/blob/main/KongFu/322.零钱兑换.java)     // [力扣题解-动态规划](https://leetcode-cn.com/problems/coin-change/solution/ling-qian-dui-huan-by-xiao-sheng-tong-xu-w775/)

### 第十一章滑动窗口

*   [239.滑动窗口最大值.java](https://github.com/liangjian66/algo/blob/main/KongFu/239.滑动窗口最大值.java)     // [力扣题解](https://leetcode-cn.com/problems/sliding-window-maximum/solution/hua-dong-chuang-kou-zui-da-zhi-by-xiao-s-9xji/)  // [题解-双指针](https://leetcode-cn.com/problems/sliding-window-maximum/solution/hua-dong-chuang-kou-zui-da-zhi-by-xiao-s-anuy/)
*   [76.最小覆盖子串.java](https://github.com/liangjian66/algo/blob/main/KongFu/76.最小覆盖子串.java)     // [力扣题解](https://leetcode-cn.com/problems/minimum-window-substring/solution/zui-xiao-fu-gai-zi-chuan-by-xiao-sheng-t-q9k3/)    // [牛客题解](https://blog.nowcoder.net/n/16d4efa79ea8452796b871abb7595f6f)
*   [424.替换后的最长重复字符.java](https://github.com/liangjian66/algo/blob/main/KongFu/424.替换后的最长重复字符.java)     // [力扣题解](https://leetcode-cn.com/problems/minimum-window-substring/solution/zui-xiao-fu-gai-zi-chuan-by-xiao-sheng-t-utrn/)
*   [567.字符串的排列.java](https://github.com/liangjian66/algo/blob/main/KongFu/567.字符串的排列.java)     // [力扣题解](https://leetcode-cn.com/problems/permutation-in-string/solution/zi-fu-chuan-de-pai-lie-by-xiao-sheng-ton-2je9/)

### 第十二章博弈问题
*   [877.石子游戏.java](https://github.com/liangjian66/algo/blob/main/KongFu/877.石子游戏.java)     // [力扣题解](https://leetcode-cn.com/problems/stone-game/solution/shi-zi-you-xi-by-xiao-sheng-tong-xue-83ys/)
*   [486.预测赢家.java](https://github.com/liangjian66/algo/blob/main/KongFu/486.预测赢家.java)     

### 第十三章股票问题
*   [121.买卖股票的最佳时机.java](https://github.com/liangjian66/algo/blob/main/KongFu/121.买卖股票的最佳时机.java)   // [力扣题解](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/solution/)
*   [122.买卖股票的最佳时机-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/122.买卖股票的最佳时机-ii.java)  // [力扣题解](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/)
*   [714.买卖股票的最佳时机含手续费.java](https://github.com/liangjian66/algo/blob/main/KongFu/714.买卖股票的最佳时机含手续费.java)   // [力扣题解](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/solution/)
*   [309.最佳买卖股票时机含冷冻期.java](https://github.com/liangjian66/algo/blob/main/KongFu/309.最佳买卖股票时机含冷冻期.java)    // [力扣题解](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/solution/)

### 第十四章分治法
*   [23.合并k个升序链表.java](https://github.com/liangjian66/algo/blob/main/KongFu/23.合并k个升序链表.java)    // [力扣题解](https://leetcode-cn.com/problems/merge-k-sorted-lists/solution/he-bing-kge-sheng-xu-lian-biao-by-xiao-s-vnmn/)
### 第十五章贪心

*   [455.分发饼干.java](https://github.com/liangjian66/algo/blob/main/KongFu/455.分发饼干.java)    // [力扣题解](https://leetcode-cn.com/problems/assign-cookies/solution/fen-fa-bing-gan-by-xiao-sheng-tong-xue-sq7v/)
*   [55.跳跃游戏.java](https://github.com/liangjian66/algo/blob/main/KongFu/55.跳跃游戏.java)    // [力扣题解](https://leetcode-cn.com/problems/jump-game/solution/tiao-yue-you-xi-by-xiao-sheng-tong-xue-zvcu/)
*   [135.分发糖果.java](https://github.com/liangjian66/algo/blob/main/KongFu/135.分发糖果.java)    
*   [435.无重叠区间.java](https://github.com/liangjian66/algo/blob/main/KongFu/435.无重叠区间.java)    // [力扣题解](https://leetcode-cn.com/problems/non-overlapping-intervals/solution/wu-zhong-die-qu-jian-by-xiao-sheng-tong-c1qgv/)

### 第十六章回溯法
> 回溯法是一种复杂度很高的暴力算法 ，实现简单且有固定模板 。 不同于普通的暴力搜索 ，回溯法会在每一步判断状态是否合法，而不是等到状态全部生成后再进行确认

> [回溯讲的非常好的题解](https://leetcode-cn.com/problems/subsets/solution/c-zong-jie-liao-hui-su-wen-ti-lei-xing-dai-ni-gao-/)
*   [46.全排列.java](https://github.com/liangjian66/algo/blob/main/KongFu/46.全排列.java)     // [力扣题解](https://leetcode-cn.com/problems/permutations/solution/quan-pai-lie-by-xiao-sheng-tong-xue-pl2q/)   // [牛客题解](https://blog.nowcoder.net/n/a736391494ba4ad49b1db8ff891bfde9)
*   [39.组合总和.java](https://github.com/liangjian66/algo/blob/main/KongFu/39.组合总和.java)     // [力扣题解](https://leetcode-cn.com/problems/combination-sum/solution/zu-he-zong-he-by-xiao-sheng-tong-xue-a7g0/)
*   [40.组合总和-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/40.组合总和-ii.java)     // [力扣题解](https://leetcode-cn.com/problems/combination-sum-ii/solution/40-zu-he-zong-he-ii-by-xiao-sheng-tong-x-s2ie/)   
*   [78.子集.java](https://github.com/liangjian66/algo/blob/main/KongFu/78.子集.java)     // [力扣题解](https://leetcode-cn.com/problems/subsets/solution/zi-ji-by-xiao-sheng-tong-xue-bdaz/)
*   [90.子集-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/90.子集-ii.java)     // [力扣题解](https://leetcode-cn.com/problems/subsets-ii/solution/zi-ji-ii-by-xiao-sheng-tong-xue-rt4m/)

### 第十七章一些有趣的题目
> 单调栈
> [单调栈牛客题解](https://blog.nowcoder.net/n/ba1bbb0ead694fd1bbade71531a5f97b)
*   [229.求众数-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/229.求众数-ii.java)
*   [84.柱状图中最大的矩形.java](https://github.com/liangjian66/algo/blob/main/KongFu/84.柱状图中最大的矩形.java)         // [力扣题解](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/solution/zhu-zhuang-tu-zhong-zui-da-de-ju-xing-by-ejvo/)
*   [42.接雨水.java](https://github.com/liangjian66/algo/blob/main/KongFu/42.接雨水.java)         // [力扣题解](https://leetcode-cn.com/problems/trapping-rain-water/solution/jie-yu-shui-dan-diao-di-jian-zhan-jie-fa-qhpw/)
*   [739.每日温度.java](https://github.com/liangjian66/algo/blob/main/KongFu/739.每日温度.java)
*   [496.下一个更大元素-i.java](https://github.com/liangjian66/algo/blob/main/KongFu/496.下一个更大元素-i.java)

*   [25.k-个一组翻转链表.java](https://github.com/liangjian66/algo/blob/main/KongFu/25.k-个一组翻转链表.java)    // [力扣题解](https://leetcode-cn.com/problems/reverse-nodes-in-k-group/solution/kge-yi-zu-fan-zhuan-lian-biao-by-xiao-sh-m0i1/)

### 第十八章一些通用解题模板
> 

##  labuladong的算法小抄
### 第一章核心套路篇
>  数据结构的底层存储方式只有两种：数组（顺序存储）和链表（链式存储）。
> 数据结构是工具 ，算法是通过合适的工具解决特定问题的方法
> 计算机解决问题其实没有任何特殊技巧，它唯一的解决办法就是穷举
> 
**回溯算法框架：解决一个回溯问题，实际上就是一个决策树的遍历过程**
* 路径：也就是已经做出的选择
* 选择列表：也就是你当前可以做的选择
* 结束条件：也就是到达决策树底层，无法再做选择的条件
* 写backtrack函数时，需要维护走过的"路径" 和当前可以做的"选择列表"，当触发""结束条件"时，将"路劲"加入结果集

### 第二章动态规划系列
**动态规划分为一下几步**
*找到"状态"和"选择"
*明确dp数组/函数的定义
* 寻找状态之间的关系
*动态规划的通用技巧：数学归纳思想
* 动态规划最优子结构以及dp遍历方向
* 反向思考问题

> 前面多次强调过，很显然只要涉及求最值，没有任何技巧，一定是穷举所有可能的结果，然后对比得出最值

> 关于"状态"的穷举，最重要的一点就是：状态转移所依赖的状态必须被提前计算出来 

*   [354.俄罗斯套娃信封问题.java](https://github.com/liangjian66/algo/blob/main/KongFu/354.俄罗斯套娃信封问题.java)    // [力扣题解](https://leetcode-cn.com/problems/russian-doll-envelopes/solution/e-luo-si-tao-wa-by-xiao-sheng-tong-xue-jg4k/)
*   [312.戳气球.java](https://github.com/liangjian66/algo/blob/main/KongFu/312.戳气球.java)
> 经典动态规划 0-1背包问题
   [416.分割等和子集.java](https://github.com/liangjian66/algo/blob/main/KongFu/416.分割等和子集.java)
> 完全背包问题
    [518.零钱兑换-ii.java](https://github.com/liangjian66/algo/blob/main/KongFu/518.零钱兑换-ii.java)   [力扣题解](https://leetcode-cn.com/problems/coin-change-2/solution/ling-qian-dui-huan-2-by-xiao-sheng-tong-tanmz/)

> 二叉树算法的设计总路线：明确一个节点要做的事情，然后剩下的事抛给递归框架
###二叉搜索树操作集锦 
   [98.验证二叉搜索树.java](https://github.com/liangjian66/algo/blob/main/KongFu/98.验证二叉搜索树.java)
   [700.二叉搜索树中的搜索.java](https://github.com/liangjian66/algo/blob/main/KongFu/700.二叉搜索树中的搜索.java)
   [701.二叉搜索树中的插入操作.java](https://github.com/liangjian66/algo/blob/main/KongFu/701.二叉搜索树中的插入操作.java)
   [450.删除二叉搜索树中的节点.java](https://github.com/liangjian66/algo/blob/main/KongFu/450.删除二叉搜索树中的节点.java)

###  完全二叉树的节点数为什么那么难算
[297.二叉树的序列化与反序列化.java](https://github.com/liangjian66/algo/blob/main/KongFu/297.二叉树的序列化与反序列化.java)

  


##  算法图书
> 学习最笨的办法就是看书拉，也是最聪明的办法 ， 博览群书总会有不一样的收获。
* 数据结构与算法分析：C语言描述_原书第2版_高清版
* 算法图解.PDF
* 数据结构 C++ .3rd_edn. 邓俊辉
* 算法4
* 算法新解
* 我的第一本算法书
* [labuladong的算法小抄官方完整版.pdf](https://github.com/labuladong/fucking-algorithm)
* 阿里P8霜神的letCode刷题手册

*  剑指OFFER  名企面试官精讲典型编程题  第2版
*  算法设计  经典算法教材 豆瓣9.4评分
*  200349  算法笔记.胡凡
*  漫画算法 小灰的算法之旅
*  2021最新版数据结构与算法面试题手册 1
*  程序员代码面试指南 IT名企算法与数据结构题目最优解
*  程序员面试金典第六版pdf
*  对白的数据结构与算法笔记
*  对白的LeetCode笔记
*  西法的刷题秘籍-2021-04-20

###  [我的手绘图解杂集](https://github.com/liangjian66/algo/blob/main/MdSet/Myhand.md)
###  [我的故事](https://github.com/liangjian66/algo/blob/main/MdSet/MyStary.md)









