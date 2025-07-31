class Solution {
    public String fractionToDecimal(int num, int den) {

      

        StringBuilder sb = new StringBuilder();

        if ((num < 0) ^ (den < 0)) {
            sb.append("-");
        }

        long numerator = Math.abs((long) num);
long denominator = Math.abs((long) den);
  if(numerator == 0 || denominator == 0){
            return "0";
            
        }
          
      
 long rem = Math.abs((long)numerator % denominator);
        long quo = Math.abs((long)numerator/ denominator);

        sb.append(String.valueOf(quo));
        if(rem == 0){
            
            return sb.toString();
        }else{
            sb.append(".");
            HashMap<Long, Integer> hashMap = new HashMap<>();

            while(rem != 0){

                    if(hashMap.containsKey(rem)){
                        sb.insert(hashMap.get(rem), "(");
                        sb.append(")");

                        return sb.toString();
                    }

                    hashMap.put(rem, sb.length());

                    rem = rem * 10;
                    sb.append(rem/denominator);

                    rem %= denominator;

            }

        }


        return sb.toString();

    }
}