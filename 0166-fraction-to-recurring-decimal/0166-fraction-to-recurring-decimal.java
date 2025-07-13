class Solution {
    public String fractionToDecimal(int num, int den) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        // Sign must be handled BEFORE taking abs
        if ((num < 0) ^ (den < 0)) {
            sb.append("-");
        }

        long numerator = Math.abs((long) num);
        long denominator = Math.abs((long) den);

        long quo = numerator / denominator;
        long remainder = numerator % denominator;

        sb.append(quo);

        if (remainder == 0) {
            return sb.toString();
        }

        sb.append(".");
        HashMap<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }

            map.put(remainder, sb.length());
            remainder *= 10;
            sb.append(remainder / denominator);
            remainder %= denominator;
        }

        return sb.toString();
    }
}