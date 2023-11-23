class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double Sum = 0;
        int length = nums.length;
        for(int i = 0;i<k;i++){
            Sum = nums[i] + Sum;
        }
        double maxSum = Sum / k;
        System.out.print(maxSum +""+Sum);
        
        for(int i = 1;i<length - k + 1 ;i++){
            
            double temp = Sum - nums[i - 1];
            temp = temp + nums[i + k - 1];
            System.out.println("Temp" + temp/k);
            Sum = temp;
            temp = temp/k;
            
            if(temp > maxSum){
                maxSum = temp;
                System.out.println(maxSum);
            }
            
        }
        
        return maxSum;
    }
}