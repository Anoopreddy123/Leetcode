class Solution {
    public int lengthOfLongestSubstring(String s) {
        // s = abcabcbb
        // Edge case s.length() = 0 -> ""
        // Sliding window + hashMap

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0, right = 0;
        int length = s.length();
        int len = 0, max_len = 0;
        while(right < length){
            char ch = s.charAt(right);
            if(hashMap.containsKey(ch)){
                left = Math.max(left, hashMap.get(ch));
               
            }
            len = right - left + 1;
            max_len = Math.max(len, max_len);
            hashMap.put(ch, right + 1);

            right++;
        }

        return max_len;
    }
}