class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int size = nums.length;
        int[] dp = new int[size];

    
        int max = 0;
        for(int i = size - 1; i >= 0; i--){
                dp[i] = 1;
            for(int j = i +1; j <size; j++){

                if(nums[i] < nums[j]){
                    dp[i] =  Math.max(1 + dp[j],dp[i]);
                }

            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}