class LRUCache {

    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    HashMap<Integer, Node> hashMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
         head.next = tail;
        tail.next = head;
        hashMap = new HashMap<>();
    }
    
    public int get(int key) {
        
        if(!hashMap.containsKey(key)){
            return -1;
        }

        Node node = hashMap.get(key);
        remove(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        
        if(hashMap.containsKey(key)){
                remove(hashMap.get(key));
        }

        if(hashMap.size() == capacity){
            remove(tail.prev);
        }

        insert(new Node(key,value));

    }

    public void insert(Node node){

        hashMap.put(node.key, node);
    Node nextNode = head.next;
    head.next = node;
    node.prev = head;

    node.next = nextNode;
    nextNode.prev = node;

    }

    public void remove(Node node){

        hashMap.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }

    private class Node{

        int key, val;
        Node prev, next;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */