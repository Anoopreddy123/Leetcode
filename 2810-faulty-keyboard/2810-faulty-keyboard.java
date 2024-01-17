class Solution {
    public String finalString(String s) {
        
        String result = "";
        StringBuilder sb = null;
        for(int i = 0; i< s.length();i++){
            
            if(s.charAt(i) == 'i'){
              sb = new StringBuilder(result);
                
                sb.reverse();
                
                result = sb.toString();
                
                
            }else{
                result = result+ s.charAt(i);
            }
            
        }
        
        return result;
        
    }
}