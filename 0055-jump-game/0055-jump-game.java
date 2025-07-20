class Solution {
    public boolean canJump(int[] nums) {
      int size = nums.length;
      boolean dp[] = new boolean[nums.length];
        dp[size - 1] = true;
      for(int i = size - 2; i>=0;i--){
         if(nums[i] > 0 && dp[i + 1] == true){
            dp[i]=true;
         }else{
            return false;
         }
      }

      return true;
    }
}