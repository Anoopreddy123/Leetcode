class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for(int i : nums){

                sum = Math.max(i, sum + i);
                maxSum = Math.max(sum, maxSum);

        }


        return maxSum;
        
    }
}