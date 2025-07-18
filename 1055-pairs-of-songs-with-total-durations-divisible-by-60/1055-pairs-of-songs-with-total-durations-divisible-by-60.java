class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        // i < j and it has to be in pairs
        // brute force is running 2 for loops and seeing if the total is divisble by 60.
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
       

         for(int i = 0; i < time.length; i++){
              int rem = time[i] % 60;
              int temp = (60 - rem) % 60;
              if(hashMap.containsKey(temp)){
                count+= hashMap.get(temp);
              }
               hashMap.put(rem, hashMap.getOrDefault(rem,0) + 1);
        }



        return count;

    }
}