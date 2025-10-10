class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans = new HashMap<>();

        for(String s : strs){

            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);

            if(ans.containsKey(sortedString)){
                ans.get(sortedString).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                ans.put(sortedString,(list));
            }


        }

         return new ArrayList<>(ans.values());   
          }
}