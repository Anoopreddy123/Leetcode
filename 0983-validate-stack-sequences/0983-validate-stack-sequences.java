class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int pushLen = pushed.length, popLen = popped.length;
        int i = 0, j = 0;
        Stack<Integer> stack = new Stack<>();

        while(i < pushLen && j < popLen){
        stack.push(pushed[i++]);
            while(!stack.isEmpty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }

           
        }


        return stack.isEmpty();
        
    }
}