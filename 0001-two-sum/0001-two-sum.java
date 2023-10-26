class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i =0; i<nums.length;i++){
            int req = target - nums[i];
            
            if(map.containsKey(req) && map.get(req) != i){
                temp[0] = i;
                temp[1] = map.get(req);
            }
        }
        return temp;
    }
}