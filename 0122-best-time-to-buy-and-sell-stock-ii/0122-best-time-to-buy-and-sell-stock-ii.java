class Solution {
    public int maxProfit(int[] prices) {
        int start = 0, end  = 0;

        int max_profit = 0, profit =0;
        int size = prices.length;

        while(end < size){

            int diff = prices[end] - prices[start];

            if(diff >= profit){
                profit = diff;
                end++;
            }else{
                start = end;
                end++;
                max_profit += profit;
                profit= 0;

            }
        }

        return Math.max(max_profit + profit, profit);
    }
}