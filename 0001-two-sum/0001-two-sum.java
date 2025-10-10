class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){

            int diff = target - nums[i];

            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff), i};
            }

            hashMap.put(nums[i], i);

        }

        return ans;
    }
}