class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
       List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        if(numRows == 1){
            return ans;           
        }

        for(int i = 1; i < numRows; i++){

            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = ans.get(i-1);

            currRow.add(1);
            for(int j = 0; j <i - 1; j++){
                currRow.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            currRow.add(1);
            ans.add(currRow);
        }


        return ans;

    }
}