import java.math.BigInteger;
class Solution {
    public static int[] plusOne(int[] digits) {
    StringBuilder str = new StringBuilder();
    for (int digit : digits) {
        str.append(digit);
    }

    BigInteger num = new BigInteger(str.toString());
    num = num.add(BigInteger.ONE);

    String resultStr = num.toString();
    int[] result = new int[resultStr.length()];
    for (int i = 0; i < resultStr.length(); i++) {
        result[i] = resultStr.charAt(i) - '0';
    }

    return result;
}
}