import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

//        int i = 0;
//        int j = 0;
//
//        for(i=0; i<nums.length-1; i++){
//            for(j=i+1; j< nums.length; j++){
//                if(nums[i]+nums[j]==target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//        return new int[]{};


        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};

    }

}
