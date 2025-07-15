class Solution {
    public int maxProfit(int[] prices) {
        
        int size = prices.length;
        int profit = 0, max_profit = 0;
        int left = 0, right = 1;

        while(right < size){

            profit = prices[right] - prices[left];
            if(profit > 0)
                max_profit = Math.max(profit, max_profit + profit);
            right++;
            left++;
        }


        return max_profit;

    }
}