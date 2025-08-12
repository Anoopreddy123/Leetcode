class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] count = new int[1001];
        for(int i = 0; i < trips.length; i++){

            count[trips[i][1]] += trips[i][0];
            count[trips[i][2]] -= trips[i][0];

        }

        int sum = 0;
        for(int i : count){
            sum += i;
            if( sum > capacity){
                return false;
            }
        }
        return true;
    }
}