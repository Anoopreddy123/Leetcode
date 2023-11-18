class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        
        for(int i = 0;i<nums.length;i++){
            if(duplicate.containsKey(nums[i])){
                if(i - duplicate.get(nums[i]) <= k){
                    return true;
                }
            }
            
                duplicate.put(nums[i],i);
            
        }
        return false;
    }
}