class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums[0], count = 1;

        for(int i : nums){

            if( i == temp){
                count++;
            }else if( i!= temp){

                count--;

                if(count == 0){
                    temp = i;
                    count = 1;
                }

            }

        }

        return temp;
    }
}