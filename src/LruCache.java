/* 缓存淘汰算法:  LruCache  维护一个双向链表 ，一个hashMap  核心使用双链表记录最近使用和最久未使用的元素*/


import java.util.HashMap;
import java.util.LinkedHashMap;


class  Node{
    public  int key , val;
    public  Node next ,prev;
    public Node(int v){
//        this.key  = k;
        this.val = v;
    }
}

  class  MyNode{
    public  int key , val;
    public  MyNode next ,prev;
    public MyNode(int k,int v){
        this.key  = k;
        this.val = v;
    }
}
/*双链表 */
class  DoubleList{
    // 头尾虚节点 想象的
    private  MyNode head , tail;

//    链表元素数
    private  int size;
    public  DoubleList(){
//        初始化双向 链表的数据
        head = new MyNode(0,0);
        tail = new MyNode(0,0);
        head.next = tail;
        tail.prev = head;
        size = 0;

    }

    /*在链表尾部添加节点 ， 时间复杂度 O(1)   插入操作*/
    public  void  addLast(MyNode x){
        // 写x  指向
        x.prev = tail.prev;
        x.next = tail;
        tail.prev.next = x ;
        tail.prev  = x;
        size++;
    }
    /*删除链表的X节点  ， （X一定存在  ）*/
    /*由于是双链表且给的是Node 节点 ，时间复杂度 O(1)*/

    public  void  remove(MyNode x){
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }
    public  MyNode removeFirst(){

        if (head.next == tail) return null;
        MyNode first = head.next;
        remove(first);
        return  first;
    }
//    返回链表长度  时间复杂度为O(1)

    public int size() {
        return  size;
    }


}





public class LruCache {
    // key Node
    private HashMap<Integer,MyNode>  map;
//    Node  (k1, v1)  (k2,v2)
    private  DoubleList cache;
    private  int cap;
    public  LruCache(int capacity){
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }
    /*将某个key 提升为最近使用的*/
    private  void  makeRecently(int key){
        MyNode x = map.get(key);
//        先删除
        cache.remove(x);
//        再添加
        cache.addLast(x);
    }
    /*添加最近的使用的元素*/
    private  void  addRecently(int key , int val)
    {
        MyNode x = new MyNode(key,val);
//        链表尾部 就是最近使用的元素
        cache.addLast(x);
//        别忘了在map中 添加 key 的映射
        map.put(key,x);

    }

    /*删除某一个key*/
    private  void  deleteKey(int key){
        MyNode x = map.get(key);
        cache.remove(x);
        map.remove(key);
    }
    /*删除最久未使用的元素*/
    private void  removeLeastRecently(){

//        链表头部的第一个元素 就是最久未使用的
        MyNode deleteNode = cache.removeFirst();
//        同时别忘了 从map中 删除他的key
        int deletedKey  = deleteNode.key;
        map.remove(deletedKey);
    }

    public int get (int key){
        if (!map.containsKey(key)) {
            return  -1;
        }
//        将该数据 提升为最近使用
          makeRecently(key);
           return  map.get(key).val;
        }


    public  void put (int key ,int val){
      if (map.containsKey(key)){
//          删除旧的数据
          deleteKey(key);
//          新插入的数据为最近使用的数据
          addRecently(key,val);
          return;
      }
      if (cap ==  cache.size()){
//          删除最久 为使用的元素
          removeLeastRecently();
      }
//      添加为最近使用的元素
        addRecently(key,val);
    }




}
