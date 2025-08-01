class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE , profit = 0;

        for(int i : prices){

            min = Math.min(i , min);
            profit = Math.max(profit, ( i -  min));

        }

        return profit;
    }
}