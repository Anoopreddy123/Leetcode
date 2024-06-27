class Solution {
    public int singleNonDuplicate(int[] arr) {
        
        int n = arr.length-1;
       
        if(arr.length == 1){
            return arr[0];
        }

    
            if(arr[0] != arr[1]) return arr[0];
        

         
            if(arr[ n] != arr[n- 1]) return arr[n];
        

        
       int start = 1, end = n - 1;
        
        while(start <= end){
             
            int mid = (start + end) / 2;
            
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid + 1]) return arr[mid];
            
            if(( mid %2 == 1 && arr[mid] == arr[mid - 1]) || 
                 (mid % 2 == 0 && arr[mid] == arr[mid + 1])
              
              ){
               start = mid + 1;
                
            }else{
                 end = mid - 1;
            }
        }
        
        return -1;
    }
}