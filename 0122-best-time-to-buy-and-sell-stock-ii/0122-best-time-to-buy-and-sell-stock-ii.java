class Solution {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int res = 0;

        for(int i = 1; i< prices.length; i++){

            if( prices[i] > start ){
                res += (prices[i] - start);
            }

            start = prices[i];

        }

        return res;
    }
}