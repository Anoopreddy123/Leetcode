class Solution {
    public int climbStairs(int n) {
   
        if(n == 1 || n == 0) return 1;
        int i = fib(n);
        return i;
   
    }
    
    public static int fib(int n){
        
     
        
        int arr[] = new int[n + 1];
        
         arr[0] = 1; 
         arr[1] = 1;
        for(int i = 2; i<=n; i++){
            
            arr[i] = arr[i - 1] + arr[i-2];
            
        }
        
        return arr[n];
        
    }
}