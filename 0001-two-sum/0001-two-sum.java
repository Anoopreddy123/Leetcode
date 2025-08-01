class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0; i < nums.length;i++){

            int diff = target - nums[i];
            if(hashMap.containsKey(diff)){
                res[0] = hashMap.get(diff);    
                res[1] = i;
            }

            hashMap.put(nums[i], i);


        }

        return res;
    }
}