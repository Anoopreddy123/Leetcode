class LRUCache {

    class Node{
        int key,val;
        Node next, prev;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    int size = 0;
    HashMap<Integer, Node> hashMap;
     Node head = new Node(0,0);
        Node tail = new Node(0,0);
    public LRUCache(int capacity) {
        hashMap = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        this.size = capacity;
    }
    
    public int get(int key) {

        int temp =  -1;
        if(hashMap.containsKey(key)){

            Node currNode = hashMap.get(key);
            temp = currNode.val; 
            remove(currNode);
            add(currNode);
        }
        
       
        return temp;
    }
    
    public void put(int key, int value) {
        
         if(hashMap.containsKey(key)){
            remove(hashMap.get(key));
        }

        if(size ==  hashMap.size()){
            remove(head.next);
        }

       // hashMap.put(key, new Node(key, value));
        add(new Node(key, value));
    }

    public void remove(Node node){

        if(node == null) return;
        hashMap.remove(node.key);
        Node beforeNode = node.prev;

        beforeNode.next = node.next;
        node.next.prev = beforeNode;   

    }

    public void add(Node node){

        hashMap.put(node.key, node);

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