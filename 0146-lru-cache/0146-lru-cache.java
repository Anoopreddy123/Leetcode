class LRUCache {

    class Node{
        int val, key;
        Node next, prev;

        Node(int key, int val){
            this.val = val;
            this.key = key;
        }

    }
    int size = 0;
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer, Node> cache = new HashMap<>();
    public LRUCache(int capacity) {
            this.size = capacity;
            head.next = tail;
            tail.prev = head;
    }
    
    public int get(int key) {

        if(!cache.containsKey(key)){
            return -1;
        }

        Node temp = cache.get(key);
        cache.remove(key);
        remove(temp);
        insert(temp);

        return temp.val;
        
    }
    
    public void put(int key, int value) {

         if(cache.containsKey(key)){
            remove(cache.get(key));
        }

        if(cache.size() == size){
            remove(head.next);
        }
        insert(new Node(key, value));
    }


    public void remove(Node node){

        if(node == null) return;
        cache.remove(node.key);
        Node beforeNode = node.prev;

        beforeNode.next = node.next;
        node.next.prev = beforeNode;   

    }

    public void insert(Node node){

        cache.put(node.key, node);

        tail.prev.next = node;
         node.prev = tail.prev ;
        node.next = tail;
       tail.prev = node;
        
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */