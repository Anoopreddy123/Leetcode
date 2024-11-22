class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     
        
        Stack<Integer> stack = new Stack<>();
        
        int size = nums1.length;
        int[] arr = new int[size];
        Arrays.fill(arr, -1);
        for(int i =0; i < size; i++){
            int target = nums1[i];
            boolean found = false;
            for(int j = 0;j < nums2.length;j++){
                
                if(nums2[j] == target){
                    found = true;
                }
                
                if(nums2[j] > target && found){
                    arr[i] = nums2[j];
                    break;
                
                }
                
            }
            
            
            
            
        }
        
        return arr;
        
    }
}