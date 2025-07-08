class LRUCache {

    // capacity of the LRUCache > 0 
    // return key if exists if not return -1
    // put 2 conditions 
        //if update key if it exists 
        //else add both key-value pair
    // if capacity is exceeded evict the least used key

    // get and put should be O(1)

   LinkedHashMap<Integer, Integer> cache;
    int size = 0; 

    public LRUCache(int capacity) {
        cache = new LinkedHashMap<>();
        size = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            int temp =  cache.get(key);
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
           Map.Entry<Integer,Integer> temp = cache.entrySet().stream().findFirst().get();

            cache.remove(temp.getKey());
        }


        cache.put(key, value);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */