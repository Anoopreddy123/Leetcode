class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);

        List<int[]> list = new ArrayList<>();

        int[] currentInterval = intervals[0];

        for(int[] interval : intervals){

            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];

            int next_start = interval[0];
            int next_end = interval[1];

            if(currentEnd >= next_start){
                currentInterval[1] = Math.max(currentEnd, next_end);
            }else{
                list.add(currentInterval);
                currentInterval = interval;
            }

        }

        list.add(currentInterval);

        return list.toArray(new int[list.size()][]);
    }
}