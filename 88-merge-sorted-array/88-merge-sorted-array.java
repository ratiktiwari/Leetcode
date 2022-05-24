class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int nums1Iterator = m - 1;
        int nums2Iterator = n - 1;
        int emptyIterator = m + n - 1;

        while (nums2Iterator >= 0 && nums1Iterator >= 0) {
            if (nums1[nums1Iterator] <= nums2[nums2Iterator]) {
                nums1[emptyIterator--] = nums2[nums2Iterator--];
            } else {
                nums1[emptyIterator--] = nums1[nums1Iterator--];
            }
        }

        while (nums2Iterator >= 0) {
            nums1[emptyIterator--] = nums2[nums2Iterator--];
        }
    }
}