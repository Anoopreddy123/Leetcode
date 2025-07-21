class LRUCache {


    private class Node{

        int key, val;
        Node prev, next;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }

    }
    HashMap<Integer, Node> cache;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head.next = tail;
tail.prev = head;
    }
    
    public int get(int key) {
        
        if(!cache.containsKey(key)){
            return -1;
        }
    
      
        Node ans = cache.get(key);
            remove(ans);
          insert(ans);
        return ans.val;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        if(cache.size() == capacity){
            remove(tail.prev);
        }

        insert(new Node(key, value));
    }

    public void remove(Node node){

        if(node == null) return;
         cache.remove(node.key);

          Node prevNode = node.prev;

          prevNode.next = node.next;
          node.next.prev = prevNode;

          

    }


    public void insert(Node node){

               cache.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */