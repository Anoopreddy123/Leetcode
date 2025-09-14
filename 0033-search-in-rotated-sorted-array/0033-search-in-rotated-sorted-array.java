class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;


        while(left < right){

            int mid = left + (right - left) /2;

            if(nums[mid] == target){
                return mid;

            }


            if(nums[left] <= target && nums[mid] > target){
                right = mid;
            }
            else{
                left = mid + 1;
            }

        }

                return -1;
    }
}