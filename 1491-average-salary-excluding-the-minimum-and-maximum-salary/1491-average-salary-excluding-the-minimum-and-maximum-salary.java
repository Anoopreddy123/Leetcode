class Solution {
    public double average(int[] salary) {
       int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;

        // Single pass to calculate sum, min, and max
        for (int s : salary) {
            sum += s;
            if (s < min) min = s;
            if (s > max) max = s;
        }

        // Exclude min and max from the sum
        sum = sum - min - max;

        // Calculate average
        return (double) sum / (salary.length - 2);
    }
}