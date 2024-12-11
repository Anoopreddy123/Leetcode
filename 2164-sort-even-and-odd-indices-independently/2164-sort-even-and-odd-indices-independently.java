class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int size = nums.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int j = 0, k = 0;
        for(int i=0;i<size;i++){
            
            if(i%2 == 0){
               even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
            
        }
       Collections.sort(even);
        Collections.sort(odd);
          j = 0; 
         k = odd.size() - 1;
         for(int i=0;i<size;i++){
          
             if(i %2 == 0){
                 nums[i] = even.get(j++);
             }else{
                 nums[i] = odd.get(k--);
             }
             
         }
        
        
        return nums;
        
    }
}