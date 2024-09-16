class MyStack {
   Queue<Integer> queue = null;

   public MyStack() {
      queue = new LinkedList<>();
   }
    
   public void push(int x) {
       queue.add(x);
       // Rotate the queue to move the newly added element to the front
       int size = queue.size();
       for (int i = 1; i < size; i++) {
           queue.add(queue.poll());
       }
   }
    
   public int pop() {
       return queue.poll();  // This will return the last added element (LIFO behavior)
   }
    
   public int top() {
       return queue.peek();  // This will return the last added element (LIFO behavior)
   }
    
   public boolean empty() {
       return queue.isEmpty();
   }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */