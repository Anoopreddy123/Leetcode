class Solution {
    public boolean findSubarrays(int[] nums) {
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<2;i++){
            sum = sum+nums[i];
             System.out.println("SUm1" + sum);
        }
        
            arrayList.add(sum);
        int k = 2;
        for(int i=k;i<nums.length;i++){
     sum = sum + nums[i] - nums[i-k];
            System.out.println("SUm" + sum);
            if(arrayList.contains(sum)){
                 System.out.println("Yes");
                return true;
            }else{
                 System.out.println("NOOO");
                    arrayList.add(sum);
            }
        }
        
        return false;
        
    }
}