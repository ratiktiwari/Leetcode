import java.util.HashMap;

public class Day_4 {
    public int lengthOfLongestSubstring(String s) {

//        int l=0, r=0;
//        int n = s.length();
//        int maxLen = 0;
//
//        HashSet<Character> set = new HashSet<Character>();
//
//        while(r<n){
//            if(!set.contains(s.charAt(r))){
//                if(r-l+1>maxLen) maxLen++;
//                set.add(s.charAt(r));
//                r++;
//            }
//            else{
//                set.remove(s.charAt(l));
//                l++;
//            }
//        }
//
//        return maxLen;

        int l = 0, r = 0;
        int n = s.length();
        int maxLen = 0;

        HashMap<Character, Integer> set = new HashMap<Character, Integer>();

        while (r < n) {

            if(!set.containsKey(s.charAt(r)) || l>set.get(s.charAt(r))){
                if (r - l + 1 > maxLen) maxLen++;
                set.put(s.charAt(r), r);
                r++;
            } else {
                l = set.get(s.charAt(r)) + 1;
                set.put(s.charAt(r), r);
                r++;
            }


        }

        return maxLen;

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

//        int len1 = nums1.length;
//        int len2 = nums2.length;
//        int i=0;
//        int j=0;
//        int k=0;
//        int[] array = new int[len1+len2];
//
//        while(i<len1 && j<len2){
//            if(nums1[i]<=nums2[j]){
//                array[k]=nums1[i];
//                k++;
//                i++;
//            }
//            else if(nums1[i]>nums2[j]){
//                array[k]=nums2[j];
//                k++;
//                j++;
//            }
//        }
//
//        if(i>=len1){
//            while(j<len2){
//                array[k]=nums2[j];
//                k++;
//                j++;
//            }
//        }
//        if(j>=len2){
//            while(i<len1){
//                array[k]=nums1[i];
//                k++;
//                i++;
//            }
//        }
//
//        if((len1+len2)%2==0){//even
//            int index = (len1+len2)/2;
//            return (double) (array[index-1]+array[index])/2;
//        }
//        if((len1+len2)%2!=0){
//            int index = (len1+len2)/2;
//            return (double) array[index];
//        }
//
//        return 0.0;



        int len1 = nums1.length;
        int len2 = nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int[] array = new int[len1+len2];

        while(i<len1 && j<len2){
            if(nums1[i]<=nums2[j]){
                array[k]=nums1[i];
                k++;
                i++;
            }
            else if(nums1[i]>nums2[j]){
                array[k]=nums2[j];
                k++;
                j++;
            }
        }

        if(i>=len1){
            while(j<len2){
                array[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(j>=len2){
            while(i<len1){
                array[k]=nums1[i];
                k++;
                i++;
            }
        }

        if((len1+len2)%2==0){//even
            int index = (len1+len2)/2;
            return (double) (array[index-1]+array[index])/2;
        }
        if((len1+len2)%2!=0){
            int index = (len1+len2)/2;
            return (double) array[index];
        }

        return 0.0;


    }
}
