class Solution {
    public int[] findOrder(int numCourses, int[][] arr) {
        boolean[] visited = new boolean[numCourses];  
         boolean[] onPath = new boolean[numCourses];  
        int[][] adj = new int[numCourses][numCourses];

        for(int[] temp : arr){

            int i = temp[1];
            int j = temp[0];

            adj[i][j] = 1;

        }

        Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
             if(dfs(i, adj, visited, stack, onPath)){
                return new int[0];
             }
            }
            }

        int[] res = new int[numCourses];
            int i = 0;
        while(!stack.isEmpty()){
            res[i++] = stack.pop();
        }

        return res;
    }


    public boolean dfs(int i, int[][] adj, boolean[] visited, Stack<Integer> stack, boolean[] onPath){

    if(onPath[i]){
        return true;
    }
    if(visited[i]){
        return false;
    }
onPath[i] = true;
 visited[i] = true;
          
        for(int k = 0; k < adj.length; k++){

if(adj[i][k] == 1)  
              if(dfs(k, adj, visited, stack, onPath)){
                   return true;

            }
        }
        stack.push(i);
        onPath[i] = false;
        return false;

    }
}