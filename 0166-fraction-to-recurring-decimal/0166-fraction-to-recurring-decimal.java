class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();
        

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        if(num == 0 || den == 0){
            return "0";
        }

        if(numerator < 0 || denominator < 0){
            sb.append("-");
        }
        
        long rem = num % den;
        long quo = num / den;

        sb.append(quo);

        if(rem == 0){
            return sb.toString();
        }

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
            sb.append(rem/den);
            rem = rem % den;




        }

        return sb.toString();
    }
}