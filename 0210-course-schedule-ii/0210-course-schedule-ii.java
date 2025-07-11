class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
               List<Integer> lists = new ArrayList<>();
               int[] res = new int[numCourses];
        int[] inDegree = new int[numCourses];
        Arrays.fill(inDegree,0);
        Queue<Integer> queue = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>();;
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

        int k = 0;
        for(int i : lists){
            res[k++] = i;
        }

        return res;
    }
}


