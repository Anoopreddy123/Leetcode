class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(String s : words){
            hashMap.put(s, hashMap.getOrDefault(s,0) + 1);
        }

         List<String> uniqueWords = new ArrayList<>(hashMap.keySet());

       
        Collections.sort(uniqueWords, (word1, word2) -> {
           
            int freq1 = hashMap.get(word1);
            int freq2 = hashMap.get(word2);

            if (freq1 != freq2) {
                return freq2 - freq1; 
            } else {
               
                return word1.compareTo(word2);
            }
        });


    

        return uniqueWords.subList(0,k);
    }
}