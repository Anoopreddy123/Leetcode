class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        
        int firstPos = findFirst(nums, start, end, target);
        if (firstPos == -1) {
            return new int[]{-1, -1}; // target not found
        }
        
        int lastPos = findLast(nums, start, end, target);
        
        return new int[]{firstPos, lastPos};
    }
    
    private int findFirst(int[] nums, int start, int end, int target) {
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
    
    private int findLast(int[] nums, int start, int end, int target) {
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

}
