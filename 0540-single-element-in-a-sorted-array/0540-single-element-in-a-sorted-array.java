class Solution {
    public int singleNonDuplicate(int[] arr) {
        
            if(arr.length == 1){
                return arr[0];
            }
        
        for(int i = 0; i<arr.length;i++){
            
            if(i == 0){
                if(arr[i] != arr[i+1]) return arr[0];
            }
            
             if(i == arr.length-1){
                if(arr[i - 1] != arr[arr.length-1]) return arr[arr.length-1];
            }
            
            if(i>0 && arr[i-1] != arr[i] && arr[i] != arr[i+1]){
                return arr[i];
            }
            
            
        }
        
        return -1;
    }
}