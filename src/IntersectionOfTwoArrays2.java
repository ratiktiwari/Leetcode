import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {

//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int n = Math.min(nums1.length, nums2.length);
//
//        int[] array = new int[n];
//
//        int i=0;
//        int j=0;
//        int k =0;
//
//        while(i<nums1.length && j< nums2.length){
//
//            if(nums1[i]<nums2[j]){
//                i++;
//            }
//            else if(nums1[i]>nums2[j]){
//                j++;
//            }
//            else if (nums1[i]==nums2[j]) {
//                array[k] = nums1[i];
//                i++;
//                j++;
//                k++;
//            }
//        }
//        if(k>0) {
//            return Arrays.copyOfRange(array, 0, k);
//        }
//
//        return new int[0];



        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i])) map.put(nums1[i], map.get(nums1[i])+1);
            else map.put(nums1[i], 1);
        }

        for(int i = 0; i < nums2.length; i++)
        {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        int[] r = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
        {
            r[i] = result.get(i);
        }

        return r;

    }

}
