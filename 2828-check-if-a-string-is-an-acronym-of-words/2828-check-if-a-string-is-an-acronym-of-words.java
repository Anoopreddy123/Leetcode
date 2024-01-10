class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        
        if(words.size() > s.length() || words.size() < s.length() ){
            return false;
        }
        for(int i=0;i<words.size();i++){
             String str = words.get(i);
              System.out.print(s.charAt(0) + " fd" + str.charAt(0)  );
           
            if(str.charAt(0) == s.charAt(i)){
                //System.out.print(s.charAt(0) + " fd" + str.charAt(0)  );
            }else{
                return false;
            }
        
        }
        
        return true;
        
    }
}