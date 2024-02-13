class Solution {
    public int maxSubArray(int[] arr) {
        if(arr.length == 1 ){
            return arr[0];
        }
        int curr_sum = 0;
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
            
			curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            System.out.print(curr_sum);
			if(curr_sum > sum){
				sum = curr_sum;
			}
		}
		return sum;
    }
}