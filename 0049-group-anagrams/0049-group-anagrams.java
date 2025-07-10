class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
            HashMap<String, List<String>> map = new HashMap<>();

            for(String s : strs){

                char[]  c = s.toCharArray();
                Arrays.sort(c);
                String sorted = new String(c);

                if(map.containsKey(sorted)){
                    List<String> temp = new ArrayList<>();

                    temp = map.get(sorted);
                    temp.add(s); 
                }else{
                    List<String> temp = new ArrayList<>();
                    temp.add(s);
                    map.put(sorted, temp);
                }


            }


            return new ArrayList<>(map.values());

    }
}