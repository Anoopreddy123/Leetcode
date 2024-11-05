class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0, max_len = 0;
        int start_index = 0;
        
        if (s.isEmpty()) {
            return 0;
        }

        // Using a StringBuilder to manage the current substring dynamically
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Check if currentChar is in str (current substring)
            if (str.indexOf(String.valueOf(currentChar)) != -1) {
                // Update max_len
                max_len = Math.max(length, max_len);
                
                // Remove characters from the start until duplicate is removed
                while (str.indexOf(String.valueOf(currentChar)) != -1) {
                    str.deleteCharAt(0);
                    start_index++;
                }
                
                length = str.length();
            }
            
            // Add the current character to the substring and increase length
            str.append(currentChar);
            length++;
        }

        // Final max_len update to capture the longest substring at the end of the loop
        return Math.max(length, max_len);
    }
}
