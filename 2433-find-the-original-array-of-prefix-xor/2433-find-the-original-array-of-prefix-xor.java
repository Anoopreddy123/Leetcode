class Solution {
    public int[] findArray(int[] pref) {
     
        int[] returns = new int[pref.length];
         int prev = pref[0];
        returns[0] = pref[0];
         for (int j = 1; j < returns.length; j++) {
        prev = pref[j-1];
         returns[j] = prev ^ pref[j];
       }
        return returns; 
    }
}