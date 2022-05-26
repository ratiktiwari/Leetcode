import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        // Brute Force  -  O(n^2)
//        for(int i=0; i<nums.length; i++){
//            int count = 1;
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//                if(count==2){
//                    return true;
//                }
//            }
//        }
//
//        return false;


        //Better Approach - First Sorting - O(nlogn+n)

//        Arrays.sort(nums);
//
//        for(int i=0; i<nums.length-1; i++){
//            if(nums[i]==nums[i+1]){
//                return true;
//            }
//        }
//
//        return false;


        //Best Approach

        Set<Integer> distinct = new HashSet<>();

        for(int num : nums){
            if(distinct.contains(num)){
                return true;
            }

            distinct.add(num);
        }

        return false;

    }

}
