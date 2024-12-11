class Solution {
    public double average(int[] salary) {
        long min = Integer.MAX_VALUE, max = 0;
         long sum = 0;
        for(int i = 0; i < salary.length; i++){
            
            if(min > salary[i]){
                min = salary[i]; 
            }
            
              
            if(max < salary[i]){
                max = salary[i]; 
            }
            
            sum = sum + salary[i];
        }
        
        sum = sum - min - max;
        
        System.out.println(sum + " "+ min+ " " + max);
      double average = (double) sum / (salary.length - 2);

        // Format to 5 decimal places
        return Double.parseDouble(String.format("%.5f", average));
    }
}