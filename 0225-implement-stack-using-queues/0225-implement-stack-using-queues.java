class MyStack {

    Queue<Integer> main;
    Queue<Integer> temp_main;
    int topElement;
    public MyStack() {
        main = new LinkedList<>();
        temp_main = new LinkedList<>();
    }
    
    public void push(int x) {
        topElement = x;
        main.add(x);

    }
    
    public int pop() {
        while(main.size() != 1){
            int x = main.remove();
            topElement = x;
            temp_main.add(x);
            
        }
        int ans = main.remove();
        main = temp_main;
        temp_main = new LinkedList<>();
        return ans;
    }
    
    public int top() {
        return topElement;
    }
    
    public boolean empty() {
        if(main.isEmpty()){
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