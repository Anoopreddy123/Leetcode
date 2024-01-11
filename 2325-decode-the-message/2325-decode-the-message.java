class Solution {
    public String decodeMessage(String key, String message) {
        
        String noSpace = key.replaceAll(" ","");
        HashMap<Character,Character> hashMap = new HashMap<>();
        
        for(int i=0, j=97;i<noSpace.length();i++){
            
            if(hashMap.containsKey(noSpace.charAt(i))){
                continue;
            }
            
            hashMap.put(noSpace.charAt(i),(char)j);
            j++;
          
        }
        
        String str = "";
        for(int i=0;i<message.length();i++){
            
            if(message.charAt(i) == ' '){
                str = str + " ";
            }
            else{
                str = str + hashMap.get(message.charAt(i));
            }
        }
         
        return str;
    }
}