class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        int[] result = new int[size];

        prefix[0] = 1;
        suffix[size - 1] = 1;

        for(int i = 1; i <=size - 1; i++){
            prefix[i] = prefix[i-1] * nums[i - 1];
        }

        for(int i = size-2; i >=0; i--){
            suffix[i] = suffix[i+1] * nums[i + 1];
        }

        for(int i = 0; i <= size - 1; i++){
            result[i] = suffix[i] * prefix[i];
        }


        return result;
    }
}