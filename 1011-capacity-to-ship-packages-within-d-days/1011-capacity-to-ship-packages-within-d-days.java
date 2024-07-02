class Solution {
    public int shipWithinDays(int[] arr, int days) {
        
        int min = 1, max = 0;;
        
        for(int i=0;i< arr.length;i++){
            
            max = max + arr[i];
            
        }
        int ans = 0;
        
        while(min <= max){
            
            int mid = (min + max) / 2;
            
            boolean possible = calculate(arr, days, mid);
            
            if(possible){
                ans = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
            
        }
        return ans;
    }
    
    public static boolean calculate(int[] arr, int days, int mid){
        
        int i = 1, weight = 0, k=0;
        
        while( i<= days){
         
            weight = 0;
            
            while(weight+arr[k]<=mid && k< arr.length){
                
                if(k < arr.length){
                    weight = arr[k++] + weight;
                }
                
                if(k == arr.length) return true;
                
            }
            i++;
            
        }
        return false;
    }
}