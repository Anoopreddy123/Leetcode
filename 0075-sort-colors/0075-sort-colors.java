class Solution {
    public void sortColors(int[] arr) {
        
        int i =0;
        int j = arr.length-1;
        
        for(int k=0;k<arr.length;k++){
            
        while(j>i){
         if(arr[j]<arr[i]){
             int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
         }   
            j--;
        }   
            i++;
            j=arr.length-1;
    }
    }
}