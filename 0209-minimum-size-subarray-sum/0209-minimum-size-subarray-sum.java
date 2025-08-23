class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;

        int sum = nums[left];
         int len = Integer.MAX_VALUE, min_len = Integer.MAX_VALUE;

        int size = nums.length;
        while(right < size){

            if(sum >= target){
                len = right - left + 1;
                min_len = Math.min(len, min_len);

            }

            if(sum <= target){
                right++;
                if(right < size){
                    sum += nums[right];
                }
            }else{
                sum -= nums[left];
                left++;
                continue;

            }

        }

        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }
}