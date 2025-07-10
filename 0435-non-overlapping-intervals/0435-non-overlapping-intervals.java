class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a , b) -> a[0] - b[0]);

        int[] first = intervals[0];
        int count = 0;

        for(int[] i : intervals)
        System.out.println(Arrays.toString(i));
        for(int i = 1; i < intervals.length; i++){

            int[] current = intervals[i];

            if(first[1] > current[0]){
                count++;
                current[1] = Math.min(current[1], first[1]);
               //  System.out.println(Arrays.toString(current));
            }

            

           

            first = current;

        }

        System.out.println("YES");

        for(int[] i : intervals)
        System.out.println(Arrays.toString(i));
        return count;

    }
}