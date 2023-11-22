class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length*2];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            System.out.println(i);
            newArr[i] = nums[i];
            count++;
        }
        
          for(int i = 0;i<nums.length;i++){
              System.out.println(i);
            newArr[count++] = nums[i];
        }
        
        return newArr;
    }
}