class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int start_index = 0;
        if (s.isEmpty()) {
            return 0;
        }
        
        // String to store the current substring characters
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Check if the character is already in the substring
            if (str.contains(String.valueOf(currentChar))) {
                // Move the start index forward to exclude the previous occurrence of the duplicate character
                start_index = s.indexOf(currentChar, start_index) + 1;
                
                // Rebuild str to reflect the updated window from start_index to i
                str = s.substring(start_index, i + 1);
            } else {
                // Append the character to the current substring
                str += currentChar;
            }
            
            // Update max_len after each character addition
            max_len = Math.max(max_len, str.length());
        }
        
        return max_len;
    }
}
