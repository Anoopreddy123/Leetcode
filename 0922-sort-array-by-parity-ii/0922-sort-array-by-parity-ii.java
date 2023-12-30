class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        
        int i = 0, j = 1;
        int len = arr.length;
        while(i<len && j<len){
            
            while(i<len && arr[i]%2 == 0)
            {
                i+=2;
            }
            
            while(j<len && arr[j] %2 == 1){
                j+=2;
            }
            
            if(i<len && j<len){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            }
        }
        return arr;
    }
}