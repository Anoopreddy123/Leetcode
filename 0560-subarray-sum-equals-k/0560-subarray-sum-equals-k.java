class Solution {
    public int subarraySum(int[] nums, int k) {
        int diff = 0, sum = 0, count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);

        for(int i : nums){

            sum += i;

            diff = sum - k;

            if(hashMap.containsKey(diff)){
                count+= hashMap.get(diff);
            }

            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);

        }

        return count;
    }
}