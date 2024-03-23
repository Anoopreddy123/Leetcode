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
           return position(arr, target);
       }
       
   }
    
    public int position(int[] arr, int target){
        int count = -1;
        for(int i=0;i<arr.length;i++){
            if(target < arr[i]){
                return i;
            }
        }
        if(count == -1){
            return arr.length;
        }
        return count;
    }
}