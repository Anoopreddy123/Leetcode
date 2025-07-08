class LRUCache {
    LinkedHashMap<Integer, Integer> cache;
    int size = 0;
    public LRUCache(int capacity) {
        cache = new LinkedHashMap<>();
        size = capacity;
    }
    
    public int get(int key) {
        
        if(cache.containsKey(key)){
           int temp = cache.get(key);
           cache.remove(key);

           cache.put(key, temp);

           return temp;
        }

        return -1;
    }
    
    public void put(int key, int value) {

        if(cache.containsKey(key)){
            cache.remove(key);
        }

        if(cache.size() == size){
            Map.Entry<Integer, Integer> temp = cache.entrySet().iterator().next();
            int lru = temp.getKey();

            cache.remove(lru);
        }

        cache.put(key,value);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */