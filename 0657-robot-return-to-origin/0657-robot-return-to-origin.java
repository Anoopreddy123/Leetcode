class Solution {
    public boolean judgeCircle(String moves) {
      int ver = 0, hor = 0;

      for(char c : moves.toCharArray()){

        if( c == 'U' ) {
            ver++;
        } else if (c == 'D')
        {
            ver--;
        }else if(c == 'L'){
            hor++;
        }else{
            hor--;
        }

      }


      return ver == 0 && hor == 0;   
    }
}