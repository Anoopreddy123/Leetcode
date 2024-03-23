class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        return binarySearch(nums, low, high,target);
    }
    
   public int  binarySearch(int[] arr, int low,int high, int target){
       
       int mid = (low + high) / 2;
       if(low < high){
           
           if(arr[mid] == target){
               return mid;
           }else if(arr[mid] < target){
               return binarySearch(arr,mid + 1, high,target);
           }else{
               return binarySearch(arr,0, mid,target);
           }
           
       
       
   }else{
           return low;
       }
   }
    

}