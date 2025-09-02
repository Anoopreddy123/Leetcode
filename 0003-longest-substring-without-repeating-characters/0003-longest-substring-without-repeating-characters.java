class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int start = 0, end = 0;
        int len = 0, maxLen = 0;
        while(end < s.length()){

            char ch = s.charAt(end);

            if(hashMap.containsKey(ch)){
                start = Math.max(start, hashMap.get(ch));
              
            }

             
                len = end - start + 1;
                maxLen = Math.max(len, maxLen);
                   hashMap.put(ch, end + 1);
                end++;
        }

        return maxLen;
    }
}