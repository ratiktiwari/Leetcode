import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {

//    public static int printF(int index, int[] array, ArrayList<Integer> sub, int target, int min, int max, int count){
//        if(index==array.length){
//            if(sub.size()!=0) {
//                if (sub.get(0) + sub.get(sub.size() - 1) <= target) {
//                    for (int i : sub) {
//                        System.out.print(i);
//                    }
//                    if (array.length == 0) {
//                        System.out.print("{}");
//                    }
//                    System.out.print(", ");
//                    count++;
//
//                    return count;
//                } else return count;
//            }
//            else{
//                return count;
//            }
//        }
//
//        sub.add(array[index]);
////        if(array[index]<min){
////            min = index;
////        }
////        if(array[index]>max){
////            max = index;
////        }
//        count = printF(index+1, array, sub, target, min, max, count);
//
//
//        sub.remove(sub.size()-1); //remove last element from arraylist
//        count=printF(index+1, array, sub, target, min, max, count);
//
//        return count;
//    }
//
//    public static int numSubseq(int[] nums, int target) {
//
//        ArrayList<Integer> sub = new ArrayList<>();
//        Arrays.sort(nums);
//        int count = 0;
//        count = printF(0, nums, sub, target, nums[0], nums[0], count);
//
//        return count;
//
//    }

    public static int numSubseq(int[] nums, int target) {

        //https://www.youtube.com/watch?v=xCsIkPLS4Ls

        Arrays.sort(nums);

        int l=0, r=nums.length-1;
        int result = 0;
        int mod = (int) (Math.pow(10, 9)+1);

        for(l=0; l<nums.length; l++){

            while(nums[l]+nums[r]>target && l<=r){
                r=r-1;
                if(r<0){
                    break;
                }
            }

            if(l<=r){
                result = (int) (result+(Math.pow(2, r-l)));
                result = result%mod;

            }
        }

        return result;

    }


    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        int target = 9;

        System.out.println("count = "+numSubseq(nums, target));
    }

}
