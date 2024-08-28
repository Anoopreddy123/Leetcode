class Solution {
    public int minBitFlips(int start, int goal) {
        
       int num = start ^ goal;
            int count = 0;
     
       while(num>0)
       {
           int temp = num%2;
            System.out.print(temp);
           num = num/2;
           if(temp == 1){
               count++;
           }
       }
        
        // System.out.print(num);
    
        
        
        return count;
    }
}