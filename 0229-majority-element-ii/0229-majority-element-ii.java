class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for(int i=0; i<nums.length;i++){
            
            if(hashMap.containsKey(nums[i])){
                
                int count = hashMap.get(nums[i]);
                count = count + 1;
                hashMap.put(nums[i],count);
            }
            else{
                hashMap.put(nums[i],1);
            }
        }
        
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()){
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
            
            if(e.getValue() > n/3){
                linkedList.add(e.getKey());
            }
            
        }
    
        
        return linkedList;
    }
}