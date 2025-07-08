class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> {
            return arr1[0] - arr2[0];
        });


        List<int[]> result = new ArrayList<>();
        int[] current_interval = intervals[0];
        int i = 0, j = 0;
        for(int[] interval : intervals){
            int current_start = current_interval[0];
            int current_end = current_interval[1];

            int next_start = interval[0];
            int next_end = interval[1];

            if(current_end >=next_start){
                 current_interval[1] = Math.max(current_end, next_end);
            }else{
                 result.add(current_interval);
                current_interval = interval;
            }
            
           
            
        }
      result.add(current_interval);

        return result.toArray(new int[result.size()][]);
    }
}