class Solution {
    public boolean canJump(int[] nums) {
        
        int goalPost = nums.length - 1;
        int size = nums.length - 1;
        for(int i = size; i >= 0; i--){

            if(i + nums[i] >= goalPost){
                goalPost = i;
            }else{
                return false;
            }

        }

        if(goalPost == 0){
            return true;
        }else{
            return false;
        }

    }
}