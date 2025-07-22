class KthLargest {

    PriorityQueue<Integer> pq;
    int capacity;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        capacity = k;

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > capacity) {
                pq.remove();
            }
        }

    }
    
    public int add(int val) {

       pq.add(val);
if (pq.size() > capacity) {
    pq.remove();
}
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */