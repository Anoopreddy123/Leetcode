class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size = nums.length;
        int[] prefixArr = new int[size];
        int[] suffixArr = new int[size];
        int[] ans = new int[size];


        prefixArr[0] = 1;
        suffixArr[size - 1] = 1;

        for(int i = 1; i <= size - 1; i++){
            prefixArr[i] = prefixArr[i-1] * nums[i-1];
        }

        for(int i = size - 2; i >= 0; i--){
            suffixArr[i] = suffixArr[i+1] * nums[i+1];
        }

        for(int i = 0; i <= size-1; i++){
            ans[i] = prefixArr[i] * suffixArr[i];
        }

        return ans;

    }
}