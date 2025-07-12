class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> temp = new ArrayList<>();


        for(int i : nums1){

            hashMap.put(i , hashMap.getOrDefault(i, 0) + 1);

        }


        for(int i : nums2){

            if(hashMap.containsKey(i) && hashMap.get(i) > 0){

                temp.add(i);
                hashMap.put(i, hashMap.get(i) - 1);
            }


        }


        int[] arr = new int[temp.size()];

        int k = 0;
        for(int i : temp){
            arr[k++] = i;
        }


        return arr;
    }
}