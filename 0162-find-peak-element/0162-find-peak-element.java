class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length - 1;
        
        if(n < 1){
            return 0;
        }
        
        
        if(n == 1){
            
            if(arr[0] > arr[1]) return 0;
            else return 1;
        }
        
        if(arr[0] > arr[1] && arr[0] > arr[2]){
            return 0;
        }
        
        
        
        if(arr[n] > arr[n- 1] && arr[n] > arr[n-2]){
            return n;
        }
        
        for(int i =1;i<n;i++){
            
            if(arr[i-1]<arr[i] && arr[i] > arr[i+1]){
                return i;
            }
            
            
        }
        
        return 0;
    }
}