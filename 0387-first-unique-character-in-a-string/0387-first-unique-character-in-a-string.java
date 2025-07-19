class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        //Arrays.fill(freq,0);
        char[] arr = s.toCharArray();
        for(char ch : arr){
               freq[ch - 'a']++;
        }

         for(int i = 0; i < s.length(); i++){
               if(freq[s.charAt(i) - 'a'] == 1){
                    return i;
               }
        }

        return -1;
    }
}