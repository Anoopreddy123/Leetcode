class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            
            if(hashMap.containsKey(arr[i])){
                int temp = hashMap.get(arr[i]);
                temp = temp + 1;
                hashMap.put(arr[i],temp);
            }else{
                 hashMap.put(arr[i],1);
            }
            
        }
        
       for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
               return entry.getKey();
            }
        }
        return 0;
    }
}