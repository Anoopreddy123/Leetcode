class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        ArrayList<Character> lists = new ArrayList<>();
        for(int i =0;i< jewels.length();i++){
            lists.add(jewels.charAt(i));
        }
        
        for(int i = 0 ; i< stones.length();i++){
            if(lists.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
        
    }
}