class Solution {
    int[] parent = new int[26];
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        
        int size = s1.length();

       for(int i =0; i < 26; i++){
            parent[i] = i;
       }


        for(int i = 0; i < size; i++){
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < baseStr.length(); i++){

            char c = baseStr.charAt(i);
            
          sb.append((char)(find(c - 'a') + 'a'));
            
        }


                    return sb.toString();

    }

     private  int find(int x){

        if(parent[x] != x){
            
            parent[x] = find(parent[x]);

        }

        return parent[x];

    }


    public  void union(int x, int y){

        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) return;
        if(rootX < rootY){
            parent[rootY] = rootX;
        }else{
            parent[rootX] = rootY;
        }


    }
}