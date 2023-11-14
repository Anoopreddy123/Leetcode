class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> hashmaps = new HashMap<>();
        
        int[] temp  = Arrays.copyOf(nums, nums.length);
        
        Arrays.sort(temp);
        
         hashmaps.put(temp[0],0);
        for(int i = 1;i<nums.length;i++){
            if(!hashmaps.containsKey(temp[i]))
            hashmaps.put(temp[i],i);
        }
        int[] result = new int[nums.length];
        for (Map.Entry<Integer, Integer> entry : hashmaps.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
       
        for(int i=0;i<nums.length;i++){
            result[i] = hashmaps.get(nums[i]);
            System.out.println(nums[i]);
        }
        
        return result;
    }
}