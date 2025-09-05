class Solution {
    public boolean canJump(int[] nums) {
        int destination = nums.length - 1;

        boolean possible = false;


        for(int i = nums.length - 2; i >=0; i--){

                if(destination - i <= nums[i]){
                    //possible = true;
                    destination = i;
                }

        }

        if(destination == 0){
            return true;
        }else{
            return false;
        }
       // return possible;
    }
}