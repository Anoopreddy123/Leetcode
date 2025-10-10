class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;

        int[] prefixArr = new int[size];
        int[] postfixArr = new int[size];

        prefixArr[0] = 1;
        for(int i = 1; i < size; i++){
        prefixArr[i] = prefixArr[i - 1] * nums[i - 1];
        }

         postfixArr[size - 1] = 1;
        for(int i = size - 2; i >= 0; i--){
        postfixArr[i] = postfixArr[i + 1] * nums[i + 1];
        }

        int ans[] = new int[size];

        for(int i = 0; i < size; i++){
            ans[i] = prefixArr[i] * postfixArr[i];
        }


        return ans;
    }
}