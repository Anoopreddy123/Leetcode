class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int inDegree[] = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] course : prerequisites){
            int u = course[0];
            int v = course[1];

            adj.get(v).add(u);
            inDegree[u]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
    if (inDegree[i] == 0) {
        queue.offer(i); 
    }
}

        int[] res = new int[numCourses];
        int it = 0;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            List<Integer> courses = adj.get(temp);
            res[it++] = temp;
            for(int i : courses){

                inDegree[i]--;
               
                if(inDegree[i] == 0){
                    queue.offer(i);
                }

            }




        }

  return (it == numCourses) ? res : new int[0];

    }
}