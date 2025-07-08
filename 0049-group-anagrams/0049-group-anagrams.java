class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();

            Arrays.sort(ch);
            String sorterStr = new String(ch);

            if(!hashMap.containsKey(sorterStr)){
                hashMap.put(sorterStr, new ArrayList<>());
            }
            hashMap.get(sorterStr).add(s);
        }

        return new ArrayList<>(hashMap.values());
    }
}