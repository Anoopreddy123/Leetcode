class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        
       

            int e10 = Integer.parseInt(event1[0].replace(":",""));
            int e11 = Integer.parseInt(event1[1].replace(":",""));

            int e20 = Integer.parseInt(event2[0].replace(":",""));
            int e21 = Integer.parseInt(event2[1].replace(":",""));

          if (Math.max(e10, e20) <= Math.min(e11, e21)) {

                return true;
            }
            
           
        

        return false;

    }
}