import java.util.*;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = trips.length;
        // int[] start = new int[n];
        // int[] end = new int[n];

        // for (int i = 0; i < n; i++) {
        //     start[i] = trips[i][1];
        //     end[i] = trips[i][2];
        // }

        // Arrays.sort(start);
        // Arrays.sort(end);

        // But this is incomplete because we also need passengers per trip
        // So we need an event-based approach
        List<int[]> events = new ArrayList<>();
        for (int[] trip : trips) {
            events.add(new int[]{trip[1], trip[0]}); // pickup
            events.add(new int[]{trip[2], -trip[0]}); // dropoff
        }

        // Sort by location
        Collections.sort(events, (a, b) -> {
    if (a[0] != b[0]) return a[0] - b[0];
    return a[1] - b[1]; // Negative before positive
});

        int currentPassengers = 0;
        for (int[] event : events) {
            currentPassengers += event[1];
            if (currentPassengers > capacity) return false;
        }
        return true;
    }
}