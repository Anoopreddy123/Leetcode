class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> currRow = new ArrayList<>();

        currRow.add(1);
        ans.add(currRow);
        if(numRows == 1){
            return ans;
        }

        for(int i = 1; i < numRows; i++){
 List<Integer> prevRow = ans.get(i-1);
  currRow = new ArrayList<>();
            currRow.add(1);
           
           
            for(int j = 0; j < i-1; j++){
                int x = prevRow.get(j) + prevRow.get(j + 1);
                currRow.add(x);
            }

            currRow.add(1);
            ans.add(currRow);
        }

        return ans;

    }
}