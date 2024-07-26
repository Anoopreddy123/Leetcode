class Solution {
    public void moveZeroes(int[] nums) {
        // Initialize a pointer j to the length of the array minus 1
        int j = nums.length - 1;
        
        // Iterate over the array from the start
        for (int i = 0; i <= j; i++) {
            // If the current element is zero
            if (nums[i] == 0) {
                // Call the method to move the zero to the end
                moveIndices(nums, i, j--);
                // Adjust the index to stay in place since the current element was moved
                i--;
            }
        }
    }
    
    public static void moveIndices(int[] arr, int start, int end) {
        // If start is greater than or equal to end, swap the elements
        if (start >= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return;
        }
        
        // Shift elements to the left
        for (int i = start; i < end; i++) {
            arr[i] = arr[i + 1];
        }
        
        // Place zero at the end
        arr[end] = 0;
    }
}
