class Solution {
    public int addDigits(int num) {
     
        int digit = 0;
        
        int temp = 0;
        while(num >= 10){
        temp = 0;
        while(num != 0){
            digit = num % 10;
            temp = temp + digit;
            num = num/10;
        }
        
          num = temp;  
        }
        return num ;
    }
}