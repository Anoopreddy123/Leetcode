class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
       String[] words = sentences[i].split(" ");
            if(words.length>max){
                max = words.length;
            }
        System.out.print(words.length);
            }
        return max;
    }
}