class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);

        int[] currentInterval = intervals[0];

        ArrayList<int[]> arrayList = new ArrayList<>();

        for(int[] i : intervals){

            int prevStart = currentInterval[0];
            int prevEnd = currentInterval[1];

            int currentStart = i[0];
            int currentEnd = i[1];

            if(prevEnd >= currentStart){
                   currentInterval[1] = Math.max(prevEnd, currentEnd);
            }else{
                arrayList.add(currentInterval);
                currentInterval = i;
            }

        }

        arrayList.add(currentInterval);

        return arrayList.toArray(new int[arrayList.size()][]);

    }
}