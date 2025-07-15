class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
       List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
            int[] res = new int[numCourses];
 List<Integer> lists = new ArrayList<>();
        for(int i =0; i < numCourses; i++){
            ArrayList<Integer> list = new ArrayList<>();
            adj.add(i, list);
        }    
        for(int[] arr : prerequisites){

            int u = arr[0];
            int v = arr[1];

            adj.get(v).add(u);
            inDegree[u]++;
        }

        for(int i = 0; i < numCourses; i++){

            if(inDegree[i] == 0){
                queue.offer(i);
            }

        }

        while(!queue.isEmpty()){

            int node = queue.poll();
            lists.add(node);
            for(int i : adj.get(node)){
                inDegree[i]--;
                if(inDegree[i] == 0){
                    queue.offer(i);
                }
            }

        }
if (lists.size() != numCourses) {
    return new int[0]; // \U0001f6a8 cycle detected
}
        int k = 0;
        for(int i : lists){
            res[k++] = i;
        }

        return res;

    }
}