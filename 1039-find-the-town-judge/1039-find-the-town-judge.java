class Solution {
    public int findJudge(int n, int[][] trust) {
        

        HashMap<Integer, List<Integer>> adj = new HashMap<>();
         for (int i = 1; i <= n; i++) {
            adj.put(i, new ArrayList<>());
        }

        int[] inDegree = new int[n];

        for(int[] t : trust){
               int u = t[0];
            int v = t[1];
        
                inDegree[v - 1]++;

        }

        for(int[] t : trust){

            int u = t[0];
            int v = t[1];


                adj.get(u).add(v);
           
        }

        System.out.println(adj);
        int temp = 0, count = 0;
        for(int i : adj.keySet()){

            List<Integer> list = new ArrayList<>();

            list = adj.get(i);

            if(list.size() == 0 && inDegree[i - 1] == n - 1){
                count++;
                temp = i;
            }

        }    

        return count == 1 ? temp : -1;    

    }
}