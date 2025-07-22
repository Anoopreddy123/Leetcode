class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
            List<List<Integer>> res = new ArrayList<>();
             helper(candidates, target, res, 0, 0, new ArrayList<Integer>());

            return res;
    }

    public void helper(int[] candidates, int target, List<List<Integer>> list, int sum, int index, ArrayList<Integer> ans){

        if(sum == target){
          list.add(new ArrayList<>(ans));
          return;
        }

        if(sum > target || index >= candidates.length){
            return;
        }

        ans.add(candidates[index]);
       helper(candidates, target, list, sum + candidates[index], index,ans);
       ans.remove(ans.size()-1);
        helper(candidates, target, list, sum, index + 1, ans);

    }
}