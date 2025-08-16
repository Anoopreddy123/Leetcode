class Solution {
    public int maximum69Number (int num) {
        /*
         * Replaces the first occurrence of "6" with "9" to maximize the number.
         * * Time Complexity: O(log10(num)) - for number to string conversion.
         * Space Complexity: O(log10(num)) - to store the string representation.
         */
        String numStr = Integer.toString(num);
        return Integer.parseInt(numStr.replaceFirst("6", "9"));
    }
}