class Solution {
    public int subarraySum(int[] nums, int k) {
        int left = 0, right = 0;
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        for(int i : nums){
            sum += i;
            int diff = sum - k;

          //  if(sum == k){count++;}

            if(hashMap.containsKey(diff)){
                int a = hashMap.get(diff);
                count+= a;
            }
            hashMap.put(sum ,hashMap.getOrDefault(sum,0) + 1);

        }
       
       System.out.println(hashMap);

        return count;
        
    }
}