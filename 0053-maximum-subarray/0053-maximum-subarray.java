class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int i : nums){
            sum = Math.max(sum + i, i);
            maxSum = Math.max(sum, maxSum);
        }


        return maxSum;
    }
}