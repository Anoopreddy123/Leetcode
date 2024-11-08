class Solution {
    public int countSubstrings(String s) {
        
       int count = 0;
        
        for(int i=0; i< s.length();i++){
            for(int j=i;j<s.length();j++){
              boolean flag = isPalendrome(s.substring(i,j + 1)); 
                if (flag){
                    count++;
                }
            }        
        }
        
        return count;
        
    }
    
    public boolean isPalendrome(String st){
        
        
        StringBuilder sb = new StringBuilder(st);
      
        String reversed = sb.reverse().toString();
        
        return reversed.equals(st);
        
    }
}