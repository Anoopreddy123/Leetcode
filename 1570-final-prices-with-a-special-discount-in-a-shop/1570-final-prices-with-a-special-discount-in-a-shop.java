class Solution {
    public int[] finalPrices(int[] prices) {
        // Using the monotonic stack and trying to change it in place

        Stack<Integer> stack = new Stack<>();
        //stack.push(prices[0]);
        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int indx = stack.pop();
                prices[indx] -= prices[i];
            }
            stack.push(i);
        }

        return prices;
    }
}