class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0, right = p.length();  
        //StringBuilder sb = new StringBuilder();
        int[] pFreq = new int[26];
        int[] subFreq = new int[26];
        List<Integer> list = new ArrayList<>();
        for(char ch : p.toCharArray()){
            pFreq[ch - 'a']++;
        }

        if(s.length() < p.length()){
            return list;
        }

        for(int i = 0; i < p.length(); i++){
            char c = s.charAt(i);
            subFreq[c - 'a']++;
           // sb.append(c);
            if(Arrays.equals(pFreq, subFreq)){
                    list.add(0);
            }
        }    

        while(right < s.length()){
            char remove = s.charAt(right - p.length());
            //sb.deleteCharAt(left);
            subFreq[remove - 'a']--;
            char add = s.charAt(right);
            //sb.append(add);
            subFreq[add - 'a']++;

          if(Arrays.equals(pFreq, subFreq)){
                    list.add(left + 1);
            }

            right++;
            left++;

        }

        return list;
    }
}