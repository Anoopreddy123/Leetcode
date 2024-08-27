class Solution {
    public boolean isPowerOfTwo(int num) {
        int count = 0;
        while(num > 0){
            int temp = num % 2;
          //  stack.push(temp);
            num = num / 2;
          if(temp == 1)   count++;
           
        }        
        
        if(count == 1) return true;
        else return false;

    }
}