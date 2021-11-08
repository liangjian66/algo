/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 */

// @lc code=start
class TrieNode{
      TrieNode[] child;
      boolean is_end;
      public TrieNode(){
          child = new TrieNode[26];
          is_end = false;
      } 
}


class Trie {
    TrieNode root ;   // 记录根节点
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode ptr  =  root; // 从根出发
        for (int i = 0; i < word.length(); i++) {
              char c = word.charAt(i);  // 对于每个单词
              if(ptr.child[c-'a'] == null){  // 说明为空没有插入
                 ptr.child[c-'a'] = new TrieNode(); //存入新的节点
              }
              ptr = ptr.child[c-'a'];  // 指向下一个新的节点
            
        }
        ptr.is_end = true; // 最后的节点为单词的最后一个字符 is_end设置为true

    }
    
    public boolean search(String word) {
        TrieNode ptr = root; // 从根出发
        for(int i=0;i<word.length();i++){
            char c  = word.charAt(i);
            if(ptr.child[c-'a'] == null){
                return false;
            }
            ptr = ptr.child[c-'a'];// 移动指针 指向孩子节点
        }

        return ptr.is_end; 

    }
    
    public boolean startsWith(String prefix) {
           TrieNode ptr = root;
           for(int i=0;i<prefix.length();i++){
               char c = prefix.charAt(i);
               if(ptr.child[c-'a'] == null){
                   return false;
               }
               ptr = ptr.child[c-'a'];
           }
           return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

