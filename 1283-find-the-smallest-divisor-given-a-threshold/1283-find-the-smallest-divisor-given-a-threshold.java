class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;  // The smallest divisor can be 1
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int value = -1;
        
        while (min <= max) {
            int mid = min + (max - min) / 2;
            
            int k = divisor(nums, mid);
            
            if (k <= threshold) {
                value = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        return value;
    }

    public static int divisor(int[] nums, int num) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += (int)Math.ceil((double)nums[i] / (double)num);
        }
        return temp;
    }
}