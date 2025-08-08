class MyStack {

    Queue<Integer> mainQueue;
    Queue<Integer> tempQueue;
    int topEle = 0;

    public MyStack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();    
    }
    
    public void push(int x) {   
        
        mainQueue.offer(x);
        topEle = x;

    }
    
    public int pop() {
        
        if(mainQueue.size() == 0){
            return -1;
        }

        while(mainQueue.size() != 1){
            tempQueue.offer(mainQueue.poll());
        }

        int temp = mainQueue.poll();

        mainQueue = tempQueue;
        tempQueue = new LinkedList<>();
        return temp;
    }
    
    public int top() {
        return topEle;
    }
    
    public boolean empty() {
        return mainQueue.isEmpty();
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