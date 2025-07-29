class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(0,1);
        int diff = 0, count = 0, sum = 0;

        for(int i = 0; i < nums.length; i++){

                sum += nums[i];
                diff = sum - k;

                if(hashMap.containsKey(diff)){
                    count += hashMap.get(diff);
                }

                hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
                
        }

        return count;
    }
}