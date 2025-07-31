class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int len = m + n;
        int sortedArr[] = new int[len];
        int i = 0, j = 0;
        int k =0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                sortedArr[k++] = nums1[i++];
            }else{
                sortedArr[k++] = nums2[j++];
            }
        }

        while(i < m){
            sortedArr[k++] = nums1[i++];
        }

        while(j < n){
            sortedArr[k++] = nums2[j++];
        }

        int mid = len / 2;

        if(len % 2 != 0)
            return sortedArr[mid];
        else{
            double temp = sortedArr[mid] + sortedArr[mid - 1];
            return temp / 2.0;
        }

       // return 0;
    }
}