class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i : nums){

            sum = Math.max((i), i + sum);
            max_sum = Math.max(sum , max_sum);

        }

        return max_sum;

    }
}