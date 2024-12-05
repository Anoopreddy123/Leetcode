class Solution {
    public int kthFactor(int n, int k) {
        int temp = -1, count = 0;
        for(int i = 1; i <= n && count < k; i++){
              float div = n % i;
            System.out.println(div);
             System.out.println(i);
             System.out.println(count);
            if(div == 0.0 ){
                
                count++;
                temp = i;
            }
        }
        
        if(count < k) return -1;
        return temp;
    }
}