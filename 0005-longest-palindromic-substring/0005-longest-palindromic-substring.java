class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String result = "";
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);      // odd-length
            String even = expand(s, i, i + 1); // even-length

            String longer = odd.length() > even.length() ? odd : even;

            if (longer.length() > max_len) {
                max_len = longer.length();
                result = longer;
            }
        }
        return result;
    }

    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // After loop breaks, left and right have gone one step too far
        return s.substring(left + 1, right);
    }
}