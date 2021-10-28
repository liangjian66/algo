class Trie{

    private  TrieTree root;
    public  Trie(){
        root = new TrieTree();
    }
    public  void insert(String word){
        if (word == null){
            return;
        }
        char[] chs = word.toCharArray();
        TrieTree node = root;
        node.path++;
        int index = 0;
        for (int i = 0; i < chs.length; i++) {
            index = chs[i] -'a';
            if (node.map[index] == null){
                node.map[index] = new TrieTree();
            }
            node = node.map[index];
            node.path++;
        }
        node.end++;
    }

    public  void  delete(String word){
        if (search(word)){
            char[] chs = word.toCharArray();
            TrieTree node = root;
            node.path++;
            int index = 0;
            for (int i = 0; i < chs.length; i++) {
                index = chs[i] -'a';
                if (node.map[index].path-- == 1){
                    node.map[index] = null;
                    return;
                }
                node = node.map[index];
            }
            node.end--;
        }
    }

    public  boolean search(String word){
        if (word == null){
            return  false;
        }
        char[] chs = word.toCharArray();
        TrieTree node = root;
        int index = 0;
        for (int i = 0; i < chs.length; i++) {
            index = chs[i]-'a';
            if (node.map[index] == null){
                return  false;
            }
            node  = node.map[index];
        }
        return  node.end != 0;
    }

    public  int prefixNumber(String pre){
        if (pre == null){
            return  0;
        }
        char[] chs = pre.toCharArray();
        TrieTree node = root;
        int index = 0;
        for (int i = 0; i < chs.length; i++) {
            index = chs[i]-'a';
            if (node.map[index] == null){
                return  0;
            }
            node = node.map[index];
        }
        return  node.path;
    }
}


public class TrieTree{
    public  int path;
    public  int end;
    public  TrieTree[] map;
    public  TrieTree(){
        path = 0;
        end = 0;
        map = new TrieTree[26];
    }
}
