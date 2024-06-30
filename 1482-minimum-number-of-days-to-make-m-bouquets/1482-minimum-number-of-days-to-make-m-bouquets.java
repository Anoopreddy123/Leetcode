class Solution {
   public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        int start = min, end = max;
        int day = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (possible(bloomDay, mid, m, k)) {
                day = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return day;
    }

    private boolean possible(int[] arr, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }
}