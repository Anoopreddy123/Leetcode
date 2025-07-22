class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, currMax = 0;
        int l = 0, r = 0;
        int size = nums.length - 1;

       for(int i = 0; i <= size; i++)
{
            currMax = Math.max(nums[i], nums[i] + currMax);
            max = Math.max(currMax, max);

        }
        return max;
    }
}