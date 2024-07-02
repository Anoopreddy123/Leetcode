class Solution {
    public int findKthPositive(int[] arr, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        
        int count = 1;
        int max = arr[arr.length - 1];  // The last element in the sorted array is the maximum element.
        
        int i = 0;
        
        while (list.size() < k && count <= max) {
            if (i < arr.length && arr[i] == count) {
                i++;
            } else {
                list.add(count);
            }
            count++;
        }
        
        // If the list size is still less than k, then the k-th missing number is beyond the max value in the array.
        while (list.size() < k) {
            list.add(count);
            count++;
        }
        
        return list.get(k - 1);
    }
}