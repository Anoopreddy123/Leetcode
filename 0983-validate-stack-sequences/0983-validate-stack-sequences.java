class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pushing = new Stack();

        int k = 0;
        for(int i = 0; i < pushed.length; i++){
            pushing.push(pushed[i]);
            while(!pushing.isEmpty() && popped[k] == pushing.peek()){
                pushing.pop();
                k++;
            }
        }
        System.out.print(k);
        while(k < popped.length && popped[k] == pushing.peek()){
            pushing.pop();
            k++;
        }

        return pushing.isEmpty();

        
    }
}