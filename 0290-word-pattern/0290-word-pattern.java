class Solution {
    public boolean wordPattern(String pattern, String st) {
        HashMap<Character, String> hashMap1 = new HashMap<>();
        String[] str = st.split(" ");
        System.out.println(str.length);
        if(pattern.length() != str.length){
            return false;
        }
        
        for(int i=0; i < pattern.length(); i++){
            
            if(hashMap1.containsKey(pattern.charAt(i))){
                if(hashMap1.get(pattern.charAt(i)).equals(str[i])){
                    System.out.print(pattern.charAt(i));
                    continue;
                }else{
                   return false;
                }
            }
            else{
                 if (hashMap1.containsValue(str[i])) {
                    return false;
                }
            
                hashMap1.put(pattern.charAt(i), str[i]);
            }
        }
           
           return true;
    }
}