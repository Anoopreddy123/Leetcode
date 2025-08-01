class Solution {
  public boolean reachingPoints(int sx, int sy, int tx, int ty) {
    if (sx > tx || sy > ty) return false;
    if (sx == tx && (ty - sy) % sx == 0) return true;
    if (sy == ty && (tx - sx) % sy == 0) return true;

    if (tx > ty) {
        return reachingPoints(sx, sy, tx % ty, ty);
    } else {
        return reachingPoints(sx, sy, tx, ty % tx);
    }
} 
}