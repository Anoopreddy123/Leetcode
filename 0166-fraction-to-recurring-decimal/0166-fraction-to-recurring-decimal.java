class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();
        long rem = 0, quo = 0;
        if(numerator == 0 || denominator == 0){
            return "0";
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);


        if(numerator < 0 ^ denominator < 0){
            sb.append("-");
        }

        rem = num % den;
        quo = num / den;
        sb.append(quo);
        if(rem == 0){
            return sb.toString();
        }

        sb.append(".");
        HashMap<Long, Integer> memory = new HashMap<>();

        while(rem != 0){

            if(memory.containsKey(rem)){

                sb.insert(memory.get(rem), "(");
                sb.append(")");

                return sb.toString();

            }
       memory.put(rem, sb.length());
               // 
                rem = rem * 10;
                sb.append(rem/den);
               rem = rem % den;
         

        }


        return sb.toString();
    }
}