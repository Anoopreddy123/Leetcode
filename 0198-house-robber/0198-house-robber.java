class Solution {
    public int rob(int[] nums) {
     // 2,7,9,3,1   
     //         12,10,10,3,1
     int size = nums.length;

     if(size == 1){
        return nums[0];
     }

     if(size == 2){
        return Math.max(nums[0], nums[1]);
     }
     int[] dp = new int[size];
     dp[0] = nums[0];
     dp[1] = Math.max(dp[0], nums[1]);

     for(int i = 2; i < size; i++){

        dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);

     }

     return dp[size-1];

    }
}