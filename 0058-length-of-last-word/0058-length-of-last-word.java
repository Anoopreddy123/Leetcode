class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int length = words.length;
        String last_word = words[length - 1];
        return last_word.length();
    }
}