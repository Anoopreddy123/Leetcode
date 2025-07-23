class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> cache = new HashMap();
        cache.put(0,1);
        int count = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            int diff = sum - k;

            if(cache.containsKey(diff)){
                count += cache.get(diff);
            }

            cache.put(sum, cache.getOrDefault(sum,0) + 1);

        }

        return count;

    }
}