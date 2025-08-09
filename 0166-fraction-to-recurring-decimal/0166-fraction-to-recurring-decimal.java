class Solution {
    public String fractionToDecimal(int num, int den) {
         if(num == 0 || den == 0){
            return "0";
        }
         long denominator = Math.abs((long)den);
       long numerator = Math.abs((long)num);
        long rem = numerator % denominator;
        long quo = numerator/denominator;

      

        StringBuilder sb = new StringBuilder();

         if(den < 0 ^ num < 0){
            sb.append("-");
        }

        sb.append(quo);

        if(rem == 0){
            return sb.toString();
        }

        sb.append(".");
        HashMap<Long, Integer> cache = new HashMap<>();

        while(rem != 0){

            if(cache.containsKey(rem)){
                sb.insert(cache.get(rem), "(");
                sb.append(")");

                break;
            }

            cache.put(rem, sb.length());

            rem = rem * 10;
            sb.append(rem / denominator);
            rem = rem % denominator;

        }

        return sb.toString();
    }
}