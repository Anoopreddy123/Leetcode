class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = nums[left];
        int len = Integer.MAX_VALUE, min_len = Integer.MAX_VALUE;
        while(left < nums.length && right < nums.length){
            if(sum >= target){
                len = right - left + 1;
                min_len = Math.min(min_len, len);
                //sum = sum - nums[left];
                
            }
             if(sum <= target){ 
               
                right++;

                if(right < nums.length)
                 sum = sum + nums[right];
            }else{
                sum = sum - nums[left];
                left++;
                continue;
            }
           
        }

        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }
}