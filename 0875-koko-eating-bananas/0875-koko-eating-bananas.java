class Solution {
   public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = Integer.MIN_VALUE;
        
        // Correcting the logic for finding the max pile
        for (int i = 0; i < piles.length; i++) {
            if (max < piles[i]) max = piles[i];
        }

        int start = 1, end = max;
        int ans = -1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            boolean pos = possible(piles, h, mid);

            if (pos) {
                
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static boolean possible(int[] arr, int h, int mid) {
        int hours = 0;

       for (int i = 0; i < arr.length; i++) {
            hours += Math.ceil((double)(arr[i]) / (double)(mid));
        }

        return hours <= h;
    }

}