class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
    int n = spells.length, m = potions.length;
    int[] ans = new int[n];
    int[][] spellsWithIdx = new int[n][2];
    for (int i = 0; i < n; i++) {
        spellsWithIdx[i][0] = spells[i];
        spellsWithIdx[i][1] = i;
    }

    Arrays.sort(spellsWithIdx, (a, b) -> Integer.compare(a[0], b[0]));
    Arrays.sort(potions);

    int j = m - 1;
    for (int i = 0; i < n; i++) {
        int spell = spellsWithIdx[i][0];
        while (j >= 0 && (long) spell * potions[j] >= success) {
            j--;
        }
        ans[spellsWithIdx[i][1]] = m - (j + 1);
    }

    return ans;
}
}