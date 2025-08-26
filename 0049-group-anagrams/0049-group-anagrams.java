class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();

        for(String s : strs){
           
            char[] c = s.toCharArray();

            Arrays.sort(c);

            String sortedString = new String(c);

            if(hashMap.containsKey(sortedString)){
               hashMap.get(sortedString).add(s);
            }else{
                 ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                hashMap.put(sortedString, temp);
            }

        }   

        return new ArrayList<>(hashMap.values());
    }
}