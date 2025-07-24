class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        generatePermutation(resList, list, nums);
        return resList;
    }

    public void generatePermutation(List<List<Integer>> resList, List<Integer> list, int[] nums){

        if(list.size() == nums.length){
            resList.add(new ArrayList<>(list));
        }

        for(int num : nums){

            if(list.contains(num)){
                continue;
            }
            list.add(num);
            generatePermutation(resList, list, nums);
            list.remove(list.size() - 1);
        }


    }

}