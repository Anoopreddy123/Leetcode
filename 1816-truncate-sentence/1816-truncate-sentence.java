class Solution {
    public String truncateSentence(String s, int k) {
        
        String str = "";
        String[] st = s.split(" ");
        for(int i=0;i<k;i++){
            str = str + st[i] + " ";
        }
        return str.trim();
    }
}