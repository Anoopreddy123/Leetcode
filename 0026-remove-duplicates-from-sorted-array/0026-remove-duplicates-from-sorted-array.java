class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int arrLen = nums.length;
        //boolean swap = false;
        while(i< arrLen && j< arrLen){
            if(nums[j] == nums[j-1]){
                j++;
            }
            else{
            nums[i] = nums[j];    
                i++;
                j++;
            }
            
           
        
        
    }
        
        
        return i;
}
}