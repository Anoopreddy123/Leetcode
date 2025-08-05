class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int max_len = 0;
        String longer = "";
        int len = s.length();
        for(int i = 0; i < len; i++){

            String even = palendrome(i, i, s);
            String odd = palendrome(i, i+1, s);

            String temp = even.length() > odd.length() ? even : odd;

            if(temp.length() > max_len){
                max_len = temp.length();
                longer = temp;  
            }

            
        }

        return longer;

    }

    public String palendrome(int start, int end, String s){

        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }


        return s.substring(start + 1, end);

    }
}