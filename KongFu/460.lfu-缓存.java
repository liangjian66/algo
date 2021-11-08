/*
 * @lc app=leetcode.cn id=460 lang=java
 *
 * [460] LFU 缓存
 */

// @lc code=start
import java.util.*;
class LFUCache {
    // key 到val 的映射
    HashMap<Integer,Integer> keyToVal;
    //  key 到 freq 的映射 后面称为KF表
    HashMap<Integer,Integer> keyToFreq;
    // freq 到key列表的映射 ，后面称为FK表
    HashMap<Integer,LinkedHashSet<Integer>> freqTokeys;
    // 记录最小的频率
    int minFreq;
    // 记录LFU缓存的最大容量
    int  cap;


    public LFUCache(int capacity) {
             keyToVal = new HashMap<>();
             keyToFreq = new HashMap<>();
             freqTokeys = new HashMap<>();
             this.cap = capacity;
             this.minFreq = 0;
    }
    
    public int get(int key) {
             if(!keyToVal.containsKey(key)){
                 return -1;
             }
             // 增加K对应的freq
             increaseFreq(key);
             return keyToVal.get(key);
    }
    
    public void put(int key, int value) {
          if(this.cap <= 0) return;
          // 假设key已经存在 修改对应val 即可
          if(keyToVal.containsKey(key)){
              keyToVal.put(key,value);
              increaseFreq(key);
              return;
          }
          // key不存在 ，需要插入
          // 容量已经满的需要淘汰一个freq最小的key
          if(this.cap <= keyToVal.size()){
              removeMinFreqKey();
          }
          keyToVal.put(key,value);
          keyToFreq.put(key,1);
          // 插入FK 表 
          freqTokeys.putIfAbsent(1,new LinkedHashSet<>());
          freqTokeys.get(1).add(key);
          this.minFreq = 1;
    }

    private void removeMinFreqKey(){
        // freq最小的key列表
          LinkedHashSet<Integer>  keyList = freqTokeys.get(this.minFreq);
          int deletedKey = keyList.iterator().next();
          // 更新FK表
          keyList.remove(deletedKey);
          if(keyList.isEmpty()){
              freqTokeys.remove(this.minFreq);
          }
          keyToVal.remove(deletedKey);
          keyToFreq.remove(deletedKey);

    }
    private void increaseFreq(int key){
        int freq = keyToFreq.get(key);
        // 更新KF表
        keyToFreq.put(key,freq+1);
        // 将key 从freq对应中的列表删除
        freqTokeys.get(freq).remove(key);
        freqTokeys.putIfAbsent(freq+1,new LinkedHashSet<>());
        freqTokeys.get(freq+1).add(key);
        //如果freq对应的列表空了 移除这个freq
        if(freqTokeys.get(freq).isEmpty()){
            freqTokeys.remove(freq);
            // 如果这个freq 恰好是minFreq 更新minFreq
            if(freq == this.minFreq){
                this.minFreq++;
            }

        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

