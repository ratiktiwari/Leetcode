class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = Math.min(nums1.length, nums2.length);

        int[] array = new int[n];

        int i=0;
        int j=0;
        int k =0;

        while(i<nums1.length && j< nums2.length){

            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if (nums1[i]==nums2[j]) {
                array[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }
        if(k>0) {
            return Arrays.copyOfRange(array, 0, k);
        }
        
        return new int[0];
        
    }
}