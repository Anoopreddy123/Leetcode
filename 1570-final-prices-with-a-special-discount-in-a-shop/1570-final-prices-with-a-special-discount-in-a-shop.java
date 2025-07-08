class Solution {
    public int[] finalPrices(int[] prices) {
        // we have a array of prices that can be be given a discount j such taht j > i and price[j] <= price[i]1

        // we can give brute force approach if needed using 2 for loops

        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if( prices[j] <= prices[i]){
                        prices[i] -= prices[j];
                        break;
                }
            }
        }

        return prices;
    }
}