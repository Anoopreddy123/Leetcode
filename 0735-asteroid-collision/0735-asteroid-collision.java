class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int size = asteroids.length;

        for(int i = 0; i < size; i++){
    
            while(!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0){
                    int sum = stack.peek() + asteroids[i];
                   
                   if(sum > 0){
                     asteroids[i] = 0;
                   }else if(sum < 0){
                    stack.pop();
                   }else{
                    asteroids[i]=0;
                    stack.pop();
                   }

                }

                if(asteroids[i] !=0){
                    stack.push(asteroids[i]);
                }

            }
            

        

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;
        while(!stack.isEmpty()){
            res[i--] = stack.pop();
        }


        return res;
    }
}