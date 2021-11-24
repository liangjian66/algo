/*
 * @lc app=leetcode.cn id=297 lang=java
 *
 * [297] 二叉树的序列化与反序列化
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return rserialize(root,"");
    }

    public String rserialize(TreeNode root,String str){
        if(root == null){
            str+="None,";
            return str;
        }
        str += String.valueOf(root.val)+",";
        str = rserialize(root.left,str);
        str = rserialize(root.right,str);
        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
          String[] dataArray = data.split(",");
          List<String>   dataList = new LinkedList<String>(Arrays.asList(dataArray));
          return rdeserialize(dataList);
    }

    public TreeNode  rdeserialize(List<String>  dataList){
          if(dataList.get(0).equals("None")){
              dataList.remove(0);
              return null;
          }
          TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
          dataList.remove(0);
          root.left =  rdeserialize(dataList);
          root.right = rdeserialize(dataList);
          return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end

