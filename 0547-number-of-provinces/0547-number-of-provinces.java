class Solution {


    public void helper(int it,List<List<Integer>> list, boolean[] visited){
             visited[it] = true;
            for(int i : list.get(it)){
                if(visited[i]) continue;
              
                helper(i, list, visited);

            }

    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();

        int size = isConnected.length;
        for(int i = 0; i <size; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i <size ; i++){
            for(int j = 0; j < size; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int count = 0;

        boolean[] visited = new boolean[size];
       // Arrays.fill(visited, false);
        for(int i =0; i < size;i++)
            if(visited[i] == false){
                count++;
                helper(i, adj, visited);
            }

            return count;
        }
       
    


}