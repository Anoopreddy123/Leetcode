class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int size = energy.length;
        int maxEnergy = Integer.MIN_VALUE;
        int[] dp = new int[size];
        for(int i = size-1; i >= 0; i--){

            dp[i] = energy[i];

            if(i + k < size){
                dp[i] += dp[i + k];
            }
            maxEnergy = Math.max(maxEnergy, dp[i]);
        }

        return maxEnergy;
    }
}