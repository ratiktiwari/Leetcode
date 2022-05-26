public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        //Kadane's Algorithm

        int currentMax = 0;
        int totalMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            currentMax += nums[i];
            if (totalMax < currentMax) {
                totalMax = currentMax;
            }
            if (currentMax < 0) {
                currentMax = 0;
            }

        }

        return totalMax;
    }

    public static void printMaxSubArray(int[] nums) { //O(n) - Kadane's Algorithm

        //Kadane's Algorithm

        int currentMax = 0;
        int currentMaxLeft = 0;
        int totalMax = Integer.MIN_VALUE;
        int totalMaxLeft = 0;
        int totalMaxRight = 0;

        for (int i = 0; i < nums.length; i++) {
            currentMax += nums[i];

            if (totalMax < currentMax) {
                totalMax = currentMax;
                totalMaxLeft = currentMaxLeft;
                totalMaxRight = i;
            }

            if (currentMax < 0) {
                currentMax = 0;
                currentMaxLeft = i + 1;
            }

        }

        System.out.println("Maximum SubArray Sum : " + totalMax);

        for (int i = totalMaxLeft; i <= totalMaxRight; i++) {
            System.out.println(nums[i]);
        }


    }

//    public static void printMaxSubArray(int[] nums){ //O(n^2)
//
//        int totalMax = Integer.MIN_VALUE;
//        int totalMaxLeftIndex = 0;
//        int totalMaxRightIndex = 0;
//        int currentMax = 0;
//
//        for(int i=0; i<nums.length; i++){
//            currentMax=0;
//            for(int j=i; j<nums.length; j++){
//                currentMax+=nums[j];
//                if(currentMax>totalMax){
//                    totalMax = currentMax;
//                    totalMaxLeftIndex = i;
//                    totalMaxRightIndex = j;
//                }
//            }
//        }
//
//        System.out.println("Maximum SubArray Sum : "+ totalMax);
//
//        for(int i=totalMaxLeftIndex; i<=totalMaxRightIndex; i++){
//            System.out.println(nums[i]);
//        }
//    }

    public static void main(String[] args) {

//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {-2,1};
//        int[] nums = {-5, -1, -2};
        int[] nums = {-2,1,-3};

        printMaxSubArray(nums);
    }

}
