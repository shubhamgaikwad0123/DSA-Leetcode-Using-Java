class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        // Pointers for nums1, nums2, and the merged array
        int i = m - 1;           // Last element of actual nums1
        int j = n - 1;           // Last element of nums2
        int k = m + n - 1;       // Last position of nums1's full capacity

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        // No need to check for nums1 remaining, it's already in place
    

    }
}