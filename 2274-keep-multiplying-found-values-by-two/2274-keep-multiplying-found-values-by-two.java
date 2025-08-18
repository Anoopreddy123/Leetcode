class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        int new_original = original;
        while(true){
            
            for(int i : nums){
                if(i == original){
                    new_original = 2 * original;
                    break;
                }
            }

                if(new_original!=original){
                    original = new_original;
                }else{
                    break;
                }



        }


        return original;
    }
}