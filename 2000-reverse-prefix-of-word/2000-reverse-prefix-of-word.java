class Solution {
    public String reversePrefix(String word, char ch) {
        
        int ind = word.indexOf(ch);
        String s = word.substring(0, ind + 1);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString() + word.substring(ind + 1, word.length());
        return s;
    }
}