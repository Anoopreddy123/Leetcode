class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int peek = -1;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {

        queue1.add(x);
        peek = x;

    }
    
    public int pop() {
            int ele = 0;
        while(queue1.size() != 1){
             ele = queue1.remove();
             peek = ele;
            queue2.offer(ele);
        }
        ele = queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList();
        return ele;


    }
    
    public int top() {
        

        return peek;
    }
    
    public boolean empty() {
        
      if(queue1.isEmpty()){
            return true;
        }else{
            return false;
        }

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