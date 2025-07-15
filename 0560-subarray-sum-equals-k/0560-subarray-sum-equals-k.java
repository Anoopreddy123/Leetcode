class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(0,1);
        int currSum = 0, val = 0;
        for(int currVal : nums){

            currSum += currVal;

            int diff = currSum - k;

            if(hashMap.containsKey(diff)){
                val += hashMap.get(diff);
            }

            hashMap.put(currSum, hashMap.getOrDefault(currSum, 0) + 1);

        }

        return val;
    }
}