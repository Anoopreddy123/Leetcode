class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> left = new HashSet<>();
        HashMap<Character, Integer> right = new HashMap<>();
        HashSet<String> result = new HashSet<>();  

      
        for (char c : s.toCharArray()) {
            right.put(c, right.getOrDefault(c, 0) + 1);
        }

        int mid = 0;
        while (mid < s.length()) {
            char midChar = s.charAt(mid);

           
            if (right.containsKey(midChar)) {
                right.put(midChar, right.get(midChar) - 1);
                if (right.get(midChar) == 0) {
                    right.remove(midChar);
                }
            }

            
            for (char ch : left) {
                if (right.containsKey(ch)) {
                    result.add("" + ch + midChar + ch); 
                }
            }

            // add midChar to left side
            left.add(midChar);
            mid++;
        }

        return result.size(); 
    }
}