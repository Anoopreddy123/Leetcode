class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int size = nums.length;
      // dp[size - 1] = 1;
        int max = 0;
        for(int i = size - 1; i>=0; i--){
            dp[i] = 1;
            for(int j = i + 1; j < size; j++){
                if(nums[i] < nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            max = Math.max(dp[i], max);
        }

        return max;
    }
}