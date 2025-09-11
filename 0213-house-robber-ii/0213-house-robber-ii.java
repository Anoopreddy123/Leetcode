class Solution {
    public int rob(int[] nums) {

        int size = nums.length;
        int[] dp1 = new int[size];
        int[] dp2 = new int[size];
        // if(size == 0){
        //     return new int[]{};
        // }
        if(size == 1){
            return nums[0];
        }

        if(size == 2){
            return Math.max(nums[0], nums[1]);
        }



         // First range: houses 0 to n-2
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);

        // Second range: houses 1 to n-1
        dp2[0] = 0;
        dp2[1] = nums[1];
        for(int i = 2; i < size - 1; i++){
           dp1[i] = Math.max(dp1[i-2] + nums[i], dp1[i-1]);
            //dp2[i] = Math.max(dp2[i-2] + nums[i], dp2[i-1]);
        }

        for(int i = 2; i < size ; i++){
           // dp1[i] = Math.max(dp1[i-2] + nums[i], dp1[i-1]);
           dp2[i] = Math.max(dp2[i-2] + nums[i], dp2[i-1]);
        }

        


        return Math.max(dp1[nums.length-2], dp2[nums.length-1]);
    }
}