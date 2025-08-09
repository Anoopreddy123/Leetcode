class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = 0;
        int sum = 0, count = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
         
        if(sum/k >= threshold){
            count++;
        }

        right = k;

        while(right < arr.length){

               
                    sum = sum - arr[right - k];
                    sum += arr[right];
            right++;
                
                 if(sum/k >= threshold){
                count++;
            }
           
        }

        return count;
    }
}