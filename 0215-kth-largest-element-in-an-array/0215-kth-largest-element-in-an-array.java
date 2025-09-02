class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : nums){

            pq.add(i);
            System.out.println(pq);
            if(pq.size() > k){
                pq.remove();
            }


        }

        return pq.peek();
    }
}