class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1))/2;

        int actualSum = 0;
        for(int i : nums){
            actualSum += i;
        }

        return sum - actualSum;
    }
}