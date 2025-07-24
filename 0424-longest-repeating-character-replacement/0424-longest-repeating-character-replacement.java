class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0, end = 0;

        int[] freq = new int[26];
        int len = 0, max_len = 0;
        int maxFreq = 0;
        while(end < s.length()){
            char c = s.charAt(end);
            freq[c - 'A']++;
           // System.out.println(c - 'A');
           maxFreq = Math.max(maxFreq, freq[c-'A']);
         
           while(end - start + 1 - maxFreq > k) {
              
                  freq[s.charAt(start) - 'A']--;
                
                start++;
            }
            max_len = Math.max(max_len, (end - start + 1));
            end++;
        }

        return max_len;



        }
    }
