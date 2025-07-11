class Solution {
    public boolean judgeCircle(String moves) {
        //int horizontal = 0, vertical = 0;
        int[] position = new int[]{0,0};
        for(char ch : moves.toCharArray()){

            if(ch == 'U'){
                position[0] -= 1;
            }else if(ch == 'D'){
                position[0] += 1;
            }else if(ch == 'L'){
                position[1] -= 1;
            }else{
                position[1] +=1;
            }

        }


        return position[0] == 0 && position[1] == 0;
    }
}