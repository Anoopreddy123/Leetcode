class Solution {
    public int maxProfit(int[] prices) {
            int size = prices.length;
            int[] dp = new int[size];
            dp[size - 1 ] = 0;
            int profit = 0;
            
            for(int i = size - 2; i >=0; i--){

                dp[i] = dp[i+1] +  Math.max(0, prices[i + 1] - prices[i]);
                 


            }

            return dp[0];


    }
}