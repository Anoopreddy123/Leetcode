class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);
        int[] currentInterval = intervals[0];

        ArrayList<int[]> arrayList = new ArrayList<>();

        for(int[] interval : intervals){

            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];

            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextStart){

                currentInterval[1] = Math.max(currentEnd, nextEnd);

            }else{

                arrayList.add(currentInterval);
                currentInterval = interval;

            }

        }
            arrayList.add(currentInterval);

            return arrayList.toArray(new int[arrayList.size()][]);

    }
}