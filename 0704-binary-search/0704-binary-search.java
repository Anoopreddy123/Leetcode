class Solution {
    public int search(int[] nums, int target) {
        
        
        
       return binarySearch(0,nums.length, nums, target);
        
    }
    
    
    public int binarySearch(int start,int end, int[] nums, int target ){
        int mid = ( start + end)/2;
        
          if (start > end) {
            return -1; // Base condition 1: Element not found
        }
        if(nums[mid] == target) return mid;
        
        else if(nums[mid] > target){
            return binarySearch(start, mid-1,nums,target);
        }else{
            return binarySearch(mid + 1, nums.length-1,nums,target);
        }
        
    }
}