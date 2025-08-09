class Solution {
    public boolean canJump(int[] nums) {
        int destination = nums.length - 1;

        for(int i = nums.length - 2; i >=0; i--){

                if(destination - i <= nums[i]){
                    destination = i;
                }

        }
        if(destination != 0){
            return false;
        }
        return true;
    }
}