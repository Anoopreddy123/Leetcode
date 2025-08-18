class Solution {
    static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();
        int[] ans = new int[queries.length];

        // step 1: break n into powers of 2
        while(n != 0){
            int a = (int)Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            powers.add(a);
            n -= a;
        }

        // step 2: ascending order
        Collections.sort(powers);

        // step 3: prefix product array
        int[] prefixArr = new int[powers.size() + 1];
        prefixArr[0] = 1;
        for(int i = 1; i <= powers.size(); i++){
            long prod = (1L * prefixArr[i-1] * powers.get(i-1)) % MOD;
            prefixArr[i] = (int)prod;
        }

        // step 4: answer queries using modular inverse
        for(int i = 0; i < queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];

            long res = prefixArr[r+1];
            res = (res * modPow(prefixArr[l], MOD-2)) % MOD;  // modular division
            ans[i] = (int)res;
        }

        return ans;
    }

    private long modPow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}