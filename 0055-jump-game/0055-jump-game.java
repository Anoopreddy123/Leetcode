class Solution {
    public boolean canJump(int[] nums) {
        int destination = nums.length - 1;

        boolean possible = false;


        for(int i = nums.length - 2; i >=0; i--){

                if(nums[destination] - nums[i] >= 1){
                    possible = true;
                }else{
                    possible = false;
                    break;
                }

        }


        return possible;
    }
}