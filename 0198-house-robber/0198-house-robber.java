class Solution {
    public int rob(int[] nums) {
        
        // constraint is to not rob 2 adj houses
        int size = nums.length;
        if(size == 1){
            return nums[0];
        }

        // used for memoization
        int[] dp = new int[size];
        dp[size - 1] = nums[size - 1];
        dp[size - 2] = Math.max(dp[size - 1], nums[size - 2]);
        for(int i = size - 3; i >=0; i-- ){
            dp[i] = Math.max((nums[i] + dp[i + 2]) , dp[i+1]);
        }

        return dp[0];
    }
}