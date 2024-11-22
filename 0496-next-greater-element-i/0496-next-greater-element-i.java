class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int size = nums2.length;
        int[] arr = new int[nums1.length]; // arr should match nums1 length for the final result
        
        // Traverse nums2 in reverse to find the next greater element
        for (int i = size - 1; i >= 0; i--) { // Corrected condition (i >= 0 instead of i >= size)
            
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) { // Ensure stack only has greater elements
                stack.pop();
            }
            
            // Assign the next greater element or -1 if stack is empty
            if (stack.isEmpty()) {
                hm.put(nums2[i], -1);
            } else {
                hm.put(nums2[i], stack.peek());
            }
            
            stack.push(nums2[i]); // Push the current element onto the stack
        }
        
        // Populate the result array for nums1 using the hashmap
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = hm.get(nums1[i]);
        }
        
        return arr;
    }
}
