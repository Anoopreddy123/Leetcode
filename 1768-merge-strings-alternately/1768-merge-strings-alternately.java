class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        StringBuilder sb = new StringBuilder(result);
        int word1Pointer = 0, word2Pointer = 0;
        
        while(word1Pointer < word1.length() && word2Pointer < word2.length()){
            
           sb.append(word1.charAt(word1Pointer));
            
           sb.append(word2.charAt(word2Pointer));
            
            
            word1Pointer++;
                word2Pointer++;
        }
        
        
        if(word1Pointer < word1.length()){
            
            while(word1Pointer < word1.length() ){
                 sb.append(word1.charAt(word1Pointer));
                   word1Pointer++;
            }
            
        }
        
        
          if(word2Pointer < word2.length()){
            
            while(word2Pointer < word2.length() ){
                 sb.append(word2.charAt(word2Pointer));
                   word2Pointer++;
            }
            
        }
        
        return sb.toString();
    }
}