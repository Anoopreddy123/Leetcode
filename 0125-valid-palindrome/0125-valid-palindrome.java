class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        boolean b = false;
        if(s.trim().length() == 0 || s.length() == 1){
            return true;
        }
        for(int i = 0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                str = str + ch;
            }
        }
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        if(str.length() == 1 || str.length() == 0){
            return true;
        }
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
                b = true;
            }else{
                b = false;
                return b;
            }
            
            
        }
        return b;
    } 
}