class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        boolean flag = true;
        while(left<=right){
            int temp = left;
            flag = true;
            while(temp!= 0){
                int digit = temp % 10;
                
                //System.out.println("DIGIT" + digit);
                if(digit!=0 && left % digit == 0){
                    System.out.println(temp);
                }
                else{
                    flag = false;
                    break;
                }
               
                temp = temp / 10;
                // System.out.println("TEMP : "+ temp);
            }
            if(flag)
            result.add(left);
            left++;
        }
        return result;
    }
}