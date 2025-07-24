class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(candidates, ans, list, 0, 0, target);

        return ans;
    }

    public void helper(int[] candidates,  List<List<Integer>> ans, List<Integer> list, int sum, int index, int target){

        if(sum > target || index >= candidates.length){
            return ;
        }

        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        list.add(candidates[index]);
        helper(candidates, ans, list, sum + candidates[index], index, target);
        list.remove(list.size() - 1);

         helper(candidates, ans, list, sum, index + 1, target);


         //return ans;


    }
}