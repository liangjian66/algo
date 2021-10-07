

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
   * [算法题解](#算法题解)
   * [动态规划](#动态规划)
   * [剑指offer](#剑指offer)
     * [剑指offer-数据结构](#剑指offer-数据结构)
     * [剑指offer-二叉树](#剑指offer-二叉树)
     * [剑指offer-动态规划](#剑指offer-动态规划)
     * [剑指offer-查找和排序](#剑指offer-查找和排序)
     * [剑指offer-回朔法](#剑指offer-回朔法)
     * [剑指offer](#剑指offer-1)
   * [算法图书 (文件放在Book文件夹下)](#算法图书-文件放在book文件夹下)
      * [有错误勘误，可以联系我](#有错误勘误可以联系我)
# algo
## 鸡汤篇
* 创作不易，感觉有帮助到你，可以顺手star
* 用产品思维帮助更多的人学习算法 更多的为用户考虑而写的一个仓库
* 用老罗的话 彪悍的人生不需要解释 挑一点恶心的干干 先开始写算法，像打造产品一样写一个算法仓库， 帮助更多的人学习算法，同样也是自我学习的过程
* Java写的算法仓库  算法最重要的是心得

* 准备做一个长期的算法仓库 ，像阿甘一样做个傻子，不停奔跑，每天学习一个算法，复利思维

* 日拱一卒，功不唐捐

* 把人生比作公司或者游戏的话 ， 我准备长期做的事情，一个是跑步锻炼身体，一个阅读书籍（技术类，非技术类书籍），一个就是这个算法仓库了
* 纸上得来终觉浅 ，绝知此事要躬行
* 三部曲： 模仿，学习， 超越
* 高筑墙 ， 广积粮 ， 缓称王
* 天道酬勤，勤能补拙。博观而约取，厚积而薄发
* 算法： 先把一个大问题拆解成一个个小问题 ，  再解决小问题 ， 小问题解决了拼接起来解决大问题

##  排序算法
*  [冒泡排序](https://github.com/liangjian66/algo/blob/main/src/BubbleSort.java) ：BubbleSort
*  [插入排序](https://github.com/liangjian66/algo/blob/main/src/InsertSort.java) ： InsertSort   思路： 1. 每次碰到元素小的值  就往后面挪动一位  2.insertValue的值插入适当的位置
*  [选择排序](https://github.com/liangjian66/algo/blob/main/src/SelectSort.java) SelectSort  1.选择排序每次从未排序区间中最小的元素    2.首先找出数组中最小的哪个元素 ，其次，将它和数组的第一个元素交换位置 以此类推
*  [快速排序](https://github.com/liangjian66/algo/blob/main/src/QuickSort.java)   1. 递归  2 。 二分  3. 双指针的思路
*  [计数排序](https://github.com/liangjian66/algo/blob/main/src/CountSort.java)
*  [归并排序](https://github.com/liangjian66/algo/blob/main/src/mergeSort.java)  mergeSort  主要思想是递归   2. 主要是两个小的有序的数组合并成一个大的数组
*  [希尔排序](https://github.com/liangjian66/algo/blob/main/src/ShellSort.java) : ShellSort  思路 : 先分组 再使用插入排序 ，再缩小间隔d
*  [堆排序](https://github.com/liangjian66/algo/blob/main/src/HeapSort.java) ：HeapSort    题解： 1. 堆存储结构是个数组  2. 先构建一个大顶堆 3 ， 遍历取大顶堆  取最大值

##  二叉树  
*   <mark>二叉树问题大多使用递归解决  递归几大要素： 1.基线条件（终止条件） 2.子问题 3.递归参数  4. 递归返回值 、 <mark>
*   二分查找：  HalfSearch        有序序列采用二分查找
*   二叉树前序遍历题解  ：Solution   1. 根结点 ---> 左子树 ---> 右子树  2. 单层条件是先根节点，左节点 右节点 后使用递归 ，递归的基线条件是：root节点==null 终止
*   二叉树中序遍历：MiddleSolution     ： 题解：  左子树——根节点——右子树   迭代解法  ：1. while   2 .入栈 3. 出栈
*   平衡二叉搜索树 ： AVLTree            关键字1. LL 右旋  2.RR 左旋  3.LR 先左旋 再右旋  4 RL 先右旋  再左旋
*   二叉堆:BinaryHeap                数学要好 1.  父节点的下标是P 他的左孩子下标就是 2P+1 2P+2          2. 最大堆上浮，跟自己的父节点对比 ， 比父节点大上浮， 不断对比
*   优先队列： PriorityQueue   题解：插入进行上浮操作  删除进行：最后一个替换到堆顶 ， 然后进行下沉操作
*   二叉树层序遍历：LevelOrder 题解 ： 先把父节点放入队列 ，  然后遍历队列 ， 遍历子节点
*   二叉树的锯齿形层序遍历: zigzagLevelOrder   题解 ： 利用双端队列锯齿形层次遍历
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

## 动态规划

*  零钱兑换322：CoinChange 题解： 动态规划 求F(11)最优解 ，求出F(10)+1   求出F(9)+1

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





















##  算法图书 (文件放在Book文件夹下)
* 如有侵权 ， 联系删除
* 数据结构与算法分析：C语言描述_原书第2版_高清版
* 算法图解.PDF
* 数据结构 C++ .3rd_edn. 邓俊辉
* 算法4
* 算法新解
* 我的第一本算法书
* [labuladong的算法小抄官方完整版.pdf](https://github.com/labuladong/fucking-algorithm)
* 阿里P8霜神的letCode刷题手册
* 代码随想录 PDF
* 剑指OFFER  名企面试官精讲典型编程题  第2版
* 算法设计  经典算法教材 豆瓣9.4评分
* 200349  算法笔记.胡凡
*  漫画算法 小灰的算法之旅
*  2021最新版数据结构与算法面试题手册 1
*  程序员代码面试指南 IT名企算法与数据结构题目最优解


### 有错误勘误，可以联系我
* 邮箱： 2695621767@qq.com








