class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        helper(candidates, target, res, 0, 0, new ArrayList<>());
        return res;
    }

    public void helper(int[] candidates, int target, List<List<Integer>> res, int sum, int index, List<Integer> ans){

        if(sum == target){
            res.add(new ArrayList<>(ans));
          return;
        }

        if(index >= candidates.length || sum > target) return;

        ans.add(candidates[index]);

        helper(candidates, target, res, sum + candidates[index], index, ans);

        ans.remove(ans.size() - 1);

     helper(candidates, target, res, sum , index + 1, ans);




    }
}