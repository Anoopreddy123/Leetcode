class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);
        ArrayList<int[]> list = new ArrayList<>();

        int[] currentInterval = intervals[0];

        for(int[] interval : intervals){

            int currentStart = currentInterval[0];
            int currentEnd =  currentInterval[1];

            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextStart){
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }else{
                list.add(currentInterval);
                currentInterval = interval;
            }

        }
        list.add(currentInterval);

return list.toArray(new int[list.size()][]);
    }
}