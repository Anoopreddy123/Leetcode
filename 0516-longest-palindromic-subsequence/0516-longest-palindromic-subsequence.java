class Solution {
    public int longestPalindromeSubseq(String text1) {
        int m = text1.length(), n = text1.length();
        int ans = 0;
        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(text1, text1, 0, n-1, dp);

    }

    public int helper(String text1, String text2, int i, int j, int[][] dp) {

       if (i > j) return 0; // no valid subsequence
        if (i == j) return 1; // single char is a palindrome
        if (dp[i][j] != -1) return dp[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            return 2+ + helper(text1, text2, i + 1, j - 1, dp);
        } else {
            dp[i][j] = Math.max(helper(text1, text2, i + 1, j, dp), helper(text1, text2, i, j- 1, dp));
        }

        return dp[i][j];

    }
}
