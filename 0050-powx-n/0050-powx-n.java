class Solution {
    public double myPow(double x, int n) {
        // Handle the case when n is negative
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.0;

        // Perform exponentiation by squaring
        while (N > 0) {
            // If the current bit is 1 (n is odd)
            if ((N % 2) == 1) {
                ans = ans * x;
            }
            // Square the base for the next bit
            x = x * x;
            // Move to the next bit
            N = N / 2;
        }

        return ans;
    }
}
