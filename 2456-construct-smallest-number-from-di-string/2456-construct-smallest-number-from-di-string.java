class Solution {
    public String smallestNumber(String pattern) {
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack();

        for(int i = 0; i <= pattern.length(); i++){

            stack.push(i + 1);

            if(i < pattern.length() && pattern.charAt(i) == 'I' && !stack.isEmpty() ){

                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }

            }

        }

while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }


        return sb.toString();


    }
}