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
        
    int stLen = st.length(); 
       int i = 0 , j  = stLen - 1;

       while(i < j){
            if(st.charAt(i) == st.charAt(j)){
                i++;
                j--;
                continue;
            }else{
                return false;
            }
       }

       return true;

        
    }
}