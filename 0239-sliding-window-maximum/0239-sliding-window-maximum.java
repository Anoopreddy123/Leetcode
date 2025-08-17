class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> d = new ArrayDeque<>();

        int left = 0, right = 0;

        while (right < n) {
            // Remove all smaller elements from back
            while (!d.isEmpty() && nums[d.getLast()] < nums[right]) {
                d.removeLast();
            }

            d.addLast(right);

            // Remove elements out of the current window from front
            if (d.getFirst() < left) {
                d.removeFirst();
            }

            // Start filling results only when window is full
            if (right - left + 1 >= k) {
                res[left] = nums[d.getFirst()];
                left++;
            }

            right++;
        }

        return res;
    }
}