class Solution {
    public int maxProfit(int[] prices) {
        int dp[] = new int[prices.length];
        int size = prices.length;
        dp[size - 1] = 0;
        
        for(int i = size - 2; i >= 0; i--){
           // System.out.println(dp[i + 1] + " " + (dp[i + 1] - prices[i]));
            dp[i] = dp[i + 1] + Math.max(0, prices[i + 1] - prices[i]);

        }

        return dp[0];
    }
}