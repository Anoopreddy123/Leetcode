class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int diff = target - nums[i];

            if(hashMap.containsKey(diff)){
                res[0] = hashMap.get(diff);
                res[1] = i;
                break;
            }

            hashMap.put(nums[i], i);


        }

        return res;
    }
}