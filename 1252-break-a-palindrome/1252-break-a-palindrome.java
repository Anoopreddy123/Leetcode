class Solution {
    public String breakPalindrome(String s) {
        if(s.length() == 1){
            return "";
        }

        StringBuilder sb = new StringBuilder(s);
        int size = s.length() /2;
        for(int i = 0; i < size; i++){
            
            char ch = s.charAt(i);
            if(ch != 'a'){
                sb.setCharAt(i, 'a');
                return sb.toString();
            }

        }


        sb.setCharAt(s.length() - 1, 'b');

        return sb.toString();
       
    }
}