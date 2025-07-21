class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }


       HashSet<Integer> set = new HashSet<>();
        for (int freq : hashMap.values()) {
            set.add(freq);
        }
        
        return set.size() == hashMap.size();
    }
}