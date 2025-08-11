class Solution {
    public int findTheWinner(int n, int k) {
       Queue<Integer> queue = new LinkedList<>();
        int i = 1;
       while(i <=n){
        queue.add(i);
        i++;
       }

       while(queue.size() > 1){
        for( i = 1; i < k; i++){
            int temp = queue.poll();
            queue.add(temp);
        }
        queue.remove();
       }

       return queue.peek();
    }
}