class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            List<Integer> list = new ArrayList<>();
             adj.add(i, list);
        }
        for(int[] arr : prerequisites){
            int u = arr[0];
            int v = arr[1];
            adj.get(v).add(u);
            inDegree[u]++;
        }

        for(int i : inDegree){

            if(i == 0){
                queue.offer(i);
            }

        }
        int k = 0;
        while(!queue.isEmpty()){
            
            int currCourse = queue.poll();
            List<Integer> currNode = adj.get(currCourse);
            res[k++] = currCourse;
            for(int i : currNode){
                inDegree[i]--;
                if(inDegree[i] == 0){
                    queue.offer(i);
                }
            }

        }

        return res;

    }
}