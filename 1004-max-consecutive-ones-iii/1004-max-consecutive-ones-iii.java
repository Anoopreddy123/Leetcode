class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int max_len = 0;
        int zeros = 0; // Count of zeros in the current window

        while (j < nums.length) {
            // If we encounter a 0, increase the zero count
            if (nums[j] == 0) {
                zeros++;
            }

            // If zeros exceed k, shrink the window from the left
            while (zeros > k) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }

            // Calculate the maximum length of the window
            max_len = Math.max(max_len, j - i + 1);
            j++;
        }

        return max_len;
    }
}
