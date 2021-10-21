import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRUCacheTwo {

    private HashMap<Integer ,DictNode>  map;
    private   DoubleList cache;
    private  int cap;
    public  LRUCacheTwo(int capacity){



        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }
    /*提升为最近使用*/
    private  void  makeReently(int key){
        DictNode node = map.get(key);
        cache.remove(node);
        cache.addLast(node);
    }
    /*添加最近使用元素*/
    private  void  addRecently(int key ,int val){
        DictNode x =  new DictNode(key,val);
        cache.addLast(x);
        map.put(key,x);
    }

    /*删除某一个key*/
    private  void  deleteKey(int key){
        DictNode x = map.get(key);
        cache.remove(x);
        map.remove(key);
    }
    /*删除最久未使用的元素*/

    private  void  removeLeastRecently(){
        DictNode first = cache.removeFirst();
        /*last  和map 一定是同步操作的*/
        int deletekey = first.key;
        map.remove(deletekey);
    }

    public  int get(int key){
        if (!map.containsKey(key)){
            return  -1;
        }
        DictNode node = map.get(key);
        /*设置为最近使用*/
        makeReently(key);
        return  node.val;
    }

    public  void  put(int key ,int val){
        if (map.containsKey(key)){
            deleteKey(key);
            addRecently(key,val);
            return;
        }
        if (cap == cache.size()){
            removeLeastRecently();
        }
        /*最后添加*/
        addRecently(key,val);
    }

}

class  DoubleList{
     private  DictNode head,tail;
      /*链表的元素数*/
      private  int size;

      public  DoubleList(){
          head = new DictNode(0,0);
          tail = new DictNode(0,0);
          head.next = tail;
          tail.prev= head;
      }
      /*在链表尾部添加节点x*/
    public  void  addLast(DictNode x){
        x.prev = tail.prev;
        x.next = tail;
        tail.prev.next = x;
        tail.prev = x;
        size++;

    }

    /*删除链表中的X节点  （X节点一定存在）*/

    public  void  remove(DictNode x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    /*删除链表中的第一个节点*/
    public  DictNode removeFirst(){
        if (head.next == tail){
            return  null;
        }
        DictNode first = head.next;
        remove(first);
        return  first;
    }

    public  int size(){
        return  size;
    }


}

class DictNode{
    public  int key,val;
    public  DictNode next,prev;
    public  DictNode(int k,int v){
        this.key = k;
        this.val = v;
    }
}

