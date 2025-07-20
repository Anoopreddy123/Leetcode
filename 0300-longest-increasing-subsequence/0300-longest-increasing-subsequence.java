class Solution {
    public int lengthOfLIS(int[] nums) {
        int size = nums.length;
        int[] dp = new int[size];
        dp[size - 1] = 1;
        int max = 1;
        for(int i = size - 1; i >= 0; i--){
            dp[i] = 1;
            for(int j = i + 1; j <size; j++){
            if(nums[i] < nums[j]){
               dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            }
            max = Math.max(max, dp[i]);

        }

        return max;
    }
}