class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((long) spells[i] * potions[j] >= success) {
                    ans[i] = m - j;
                    break;  // stop at the first valid potion
                }
            }
        }
        return ans;
    }
}