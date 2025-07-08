class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i =0; i <nums.length; i++){
            hashSet.add(nums[i]);
        }
        int count = 0;
       // int prev = 0;

       for(int i : hashSet){
            if(!hashSet.contains(i - 1)){
                int currentVal = i;
                int currentStreak = 1;

                while(hashSet.contains(currentVal + 1)){
                    currentStreak++;
                    currentVal++;
                }

           count =  Math.max(currentStreak , count);

            }
       }
       return count;
    }
}