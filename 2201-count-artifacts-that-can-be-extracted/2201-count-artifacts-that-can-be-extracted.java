// Brief intro: We will use a grid-marking approach. First mark every dug cell. Then for each artifact’s rectangle, check if all its cells were dug. If yes, count it as extractable.

// Steps:
// - Initialize a boolean matrix `dug[n][n]` and mark all positions from `dig`.
// - For each artifact `[r1, c1, r2, c2]`, scan all cells in that rectangle.
// - If every cell is marked `true`, increment the answer.
// - Time: O(D + A*4) where D is number of digs and each artifact covers at most 4 cells. Space: O(n^2).

// ```java
class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        boolean[][] dug = new boolean[n][n];
        for (int[] d : dig) {
            dug[d[0]][d[1]] = true;
        }

        int result = 0;
        for (int[] a : artifacts) {
            int r1 = a[0], c1 = a[1], r2 = a[2], c2 = a[3];
            boolean fullyDug = true;
            for (int r = r1; r <= r2 && fullyDug; r++) {
                for (int c = c1; c <= c2; c++) {
                    if (!dug[r][c]) {
                        fullyDug = false;
                        break;
                    }
                }
            }
            if (fullyDug) result++;
        }
        return result;
    }
}
