class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 0, max_count = 0;
        int start = 0, end = 0;


        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(hashMap.containsKey(ch)){
                start = Math.max(start, hashMap.get(ch) + 1);
               
            }
             hashMap.put(ch, i);
            end = i;
            count = (end - start + 1);
            
            max_count = Math.max(count, max_count);


        }

        return max_count;

    }
}